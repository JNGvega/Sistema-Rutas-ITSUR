package proyecto.itsur.vista;

import proyecto.itsur.modelo.Lugar;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MapaPanel extends JPanel {
    private BufferedImage imagen;
    private List<Lugar> lugares = new ArrayList<>();
    private List<Lugar> ruta = new ArrayList<>();
    private Lugar origen = null;
    private Lugar destino = null;
    private Timer timerRuta;
    private int tramoActual = 0;
    private float progresoTramo = 0f;
    private boolean ok = false;
    private Timer timerPulso;
    private int radioPulso = 8;
    private int alphaPulso = 255;

    public interface RutaListener {
        void SeleccionarRuta(Lugar origen, Lugar destino);
        void Reiniciar();
    }

    private RutaListener rutaListener;

    public void setRutaListener(RutaListener listener) {
        this.rutaListener = listener;
    }

    public MapaPanel() {
        cargarImagen();
        Clics();
        animacionRadar();
    }

    private void animacionRadar() {
        timerPulso = new Timer(30, e -> {
            radioPulso += 1;
            alphaPulso -= 8;
            if (alphaPulso <= 0) {
                radioPulso = 8;
                alphaPulso = 255;
            }
            if (origen != null || destino != null) {
                repaint();
            }
        });
        timerPulso.start();
    }

    private void cargarImagen() {
        try {
            URL url = getClass().getResource("/recursos/mapa_itsur.png");
            if (url != null) {
                imagen = ImageIO.read(url);
                setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
            } else {
                System.err.println("No se encontró la imagen");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void Clics() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Lugar Tocado = Cercano(e.getX(), e.getY());
                if (Tocado != null) {
                    gestionarSeleccion(Tocado);
                }
            }
        });
    }

    private Lugar Cercano(int mouseX, int mouseY) {
        for (Lugar lugar : lugares) {
            if (lugar.getNombre().startsWith("Nodo ")) continue;

            double distancia = Math.hypot(lugar.getX() - mouseX, lugar.getY() - mouseY);
            if (distancia <= 15) return lugar;
        }
        return null;
    }

    private void gestionarSeleccion(Lugar lugar) {
        ok = false;
        if (origen == null) {
            origen = lugar;
            ruta.clear();
            if (rutaListener != null) rutaListener.Reiniciar();
        } else if (destino == null) {
            if (lugar.equals(origen)) return;
            destino = lugar;
            if (rutaListener != null) {
                rutaListener.SeleccionarRuta(origen, destino);
            }
        } else {
            origen = lugar;
            destino = null;
            ruta.clear();
            if (rutaListener != null) rutaListener.Reiniciar();
        }
        repaint();
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
        repaint();
    }

    public void animarRuta(List<Lugar> rutaNueva) {
        if (timerRuta != null && timerRuta.isRunning()) timerRuta.stop();

        this.ruta = (rutaNueva != null) ? new ArrayList<>(rutaNueva) : new ArrayList<>();
        this.tramoActual = 0;
        this.progresoTramo = 0f;
        this.ok = false;


        if (rutaNueva == null || rutaNueva.size() < 2) {
            repaint();
            return;
        }

        timerRuta = new Timer(15, e -> {
            progresoTramo += 0.04f;

            if (progresoTramo >= 1f) {
                progresoTramo = 0f;
                tramoActual++;
                if (tramoActual >= ruta.size() - 1) {
                    tramoActual = ruta.size() - 1;
                    ((Timer) e.getSource()).stop();

                    ok = true;
                    Toolkit.getDefaultToolkit().beep();

                    SwingUtilities.invokeLater(() -> {
                        String msj = "¡Uf! Llegamos" + destino.getNombre() + ".\n";
                        JOptionPane.showMessageDialog(MapaPanel.this,
                            msj,
                            "¡Destino Alcanzado!",
                            JOptionPane.INFORMATION_MESSAGE);
                    });
                }
            }
            repaint();
        });
        timerRuta.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        if (imagen != null) g2.drawImage(imagen, 0, 0, this);

        if (ruta != null && ruta.size() > 1 && (tramoActual > 0 || progresoTramo > 0f)) {
            g2.setColor(new Color(0, 230, 118));
            g2.setStroke(new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

            for (int i = 0; i < tramoActual; i++) {
                Lugar origenTramo = ruta.get(i);
                Lugar destinoTramo = ruta.get(i + 1);
                g2.drawLine(origenTramo.getX(), origenTramo.getY(), destinoTramo.getX(), destinoTramo.getY());
            }

            if (tramoActual < ruta.size() - 1) {
                Lugar o = ruta.get(tramoActual);
                Lugar d = ruta.get(tramoActual + 1);
                int actualX = (int) (o.getX() + (d.getX() - o.getX()) * progresoTramo);
                int actualY = (int) (o.getY() + (d.getY() - o.getY()) * progresoTramo);
                g2.drawLine(o.getX(), o.getY(), actualX, actualY);

                if (!ok) {
                    g2.setColor(Color.WHITE);
                    g2.fillOval(actualX - 4, actualY - 4, 8, 8);
                }
            }
        }

        for (Lugar lugar : lugares) {
            int x = lugar.getX();
            int y = lugar.getY();

            if (lugar.getNombre().startsWith("Nodo ")) {
                if (ruta != null && ruta.contains(lugar)) {
                    g2.setColor(new Color(0, 230, 118));
                    g2.fillOval(x - 4, y - 4, 8, 8);
                    g2.setColor(Color.WHITE);
                    g2.fillOval(x - 2, y - 2, 4, 4);
                }
                continue;
            }

            Color colorPin = new Color(33, 150, 243);
            String etiqueta = "";

            if (lugar.equals(origen)) {
                colorPin = new Color(46, 204, 113);
                etiqueta = " (ORIGEN)";
            } else if (lugar.equals(destino)) {
                colorPin = new Color(231, 76, 60);
                etiqueta = " (DESTINO)";

                if (ok) {
                    g2.setColor(new Color(255, 193, 7));
                    g2.fillRoundRect(x + 12, y - 35, 110, 20, 6, 6);
                    g2.setColor(Color.BLACK);
                    g2.setFont(new Font("Segoe UI", Font.BOLD, 12));
                    g2.drawString("¡LLEGAMOS!", x + 18, y - 21);
                }
            }

            if (lugar.equals(origen) || lugar.equals(destino)) {
                g2.setColor(new Color(colorPin.getRed(), colorPin.getGreen(), colorPin.getBlue(), Math.max(0, alphaPulso)));
                g2.setStroke(new BasicStroke(2f));
                g2.drawOval(x - radioPulso, y - radioPulso, radioPulso * 2, radioPulso * 2);
            }

            g2.setColor(colorPin);
            g2.fillOval(x - 7, y - 7, 14, 14);
            g2.setColor(Color.WHITE);
            g2.setStroke(new BasicStroke(2.5f));
            g2.drawOval(x - 7, y - 7, 14, 14);

            String texto = lugar.getNombre() + etiqueta;
            FontMetrics fm = g2.getFontMetrics();
            int anchoTexto = fm.stringWidth(texto);

            g2.setColor(new Color(20, 20, 20, 220));
            g2.fillRoundRect(x + 12, y - 12, anchoTexto + 8, 20, 6, 6);
            g2.setColor(Color.WHITE);
            g2.setFont(new Font("Segoe UI", Font.BOLD, 11));
            g2.drawString(texto, x + 16, y + 2);
        }
    }
}