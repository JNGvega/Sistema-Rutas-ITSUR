package proyecto.itsur.vista;

import proyecto.itsur.modelo.Grafo;
import proyecto.itsur.modelo.Lugar;
import proyecto.itsur.modelo.Ruta;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private MapaPanel mapaPanel;
    private JLabel lblEstado;
    private JLabel lblDetalle;
    private Grafo grafo;

    public MainFrame(Grafo grafo) {
        this.grafo = grafo;

        setTitle("Sistema de Rutas ITSUR - Algoritmo de Dijkstra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelInfo = new JPanel();
        panelInfo.setBackground(new Color(33, 37, 43));
        panelInfo.setLayout(new GridLayout(2, 1, 0, 5));
        panelInfo.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        lblEstado = new JLabel("SELECCIONA EL ORIGEN HACIENDO CLIC EN EL MAPA", SwingConstants.CENTER);
        lblEstado.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblEstado.setForeground(new Color(0, 230, 118));

        lblDetalle = new JLabel("Esperando selección...", SwingConstants.CENTER);
        lblDetalle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblDetalle.setForeground(new Color(170, 170, 170));

        panelInfo.add(lblEstado);
        panelInfo.add(lblDetalle);

        add(panelInfo, BorderLayout.NORTH);

        mapaPanel = new MapaPanel();
        mapaPanel.setLugares(grafo.getLugares());

        JScrollPane scrollMapa = new JScrollPane(mapaPanel);
        scrollMapa.setBorder(null);
        add(scrollMapa, BorderLayout.CENTER);

        configurarInteraccionMapa();

        pack();
        setLocationRelativeTo(null);
    }

    private void configurarInteraccionMapa() {
        mapaPanel.setRutaListener(new MapaPanel.RutaListener() {

            @Override
            public void SeleccionarRuta(Lugar origen, Lugar destino) {
                lblEstado.setText("RUTA ÓPTIMA: " + origen.getNombre().toUpperCase() + " ➜ " + destino.getNombre().toUpperCase());
                lblEstado.setForeground(new Color(33, 150, 243));

                Ruta resultado = grafo.dijkstra(origen, destino);

                if (resultado != null && resultado.getCamino().size() > 1) {
                    mapaPanel.animarRuta(resultado.getCamino());
                    lblDetalle.setText(String.format("Distancia total: %.2f metros  (Haz clic en otro edificio para nueva ruta)", resultado.getDistancia()));
                } else {
                    mapaPanel.animarRuta(null);
                    lblDetalle.setText("No hay camino conectado entre estos dos edificios.");
                }
            }

            @Override
            public void Reiniciar() {
                lblEstado.setText("SELECCIONA EL DESTINO HACIENDO CLIC EN OTRO EDIFICIO");
                lblEstado.setForeground(new Color(231, 76, 60));
                lblDetalle.setText("Origen seleccionado. Esperando destino...");
            }
        });
    }
}