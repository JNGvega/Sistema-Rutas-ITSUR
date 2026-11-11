package proyecto.itsur;


import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class ProyectoITSUR {
    public static void main(String[] args) {
        // 1. Activar el Look and Feel de FlatLaf
        try {
            FlatDarkLaf.setup();
        } catch (Exception ex) {
            System.err.println("Error al cargar FlatLaf: " + ex.getMessage());
        }

        // 2. Crear una ventana de prueba simple
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Rutas ITSUR - Prueba UI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 300);
            frame.setLocationRelativeTo(null);
            
            JLabel label = new JLabel("¡FlatLaf configurado correctamente!", SwingConstants.CENTER);
            frame.add(label);
            
            frame.setVisible(true);
        });
    }
}
