package proyecto.itsur;


//import com.formdev.flatlaf.FlatDarkLaf;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import proyecto.itsur.modelo.Grafo;
import proyecto.itsur.modelo.Lugar;


public class ProyectoITSUR {
    public static void main(String[] args) {
        /*
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
        });*/
        
        Grafo grafo = new Grafo();

        
        Lugar biblioteca = new Lugar("Biblioteca");
        Lugar cafeteria = new Lugar("Cafeteria");
        Lugar direccion = new Lugar("Direccion");
        Lugar edificioA = new Lugar("Edificio A");
        Lugar edificioB = new Lugar("Edificio B");
        Lugar edificioE = new Lugar("Edificio E");
        Lugar vinculacion = new Lugar("Vinculacion");
        Lugar palapas = new Lugar("Palapas");
        Lugar tics = new Lugar("TICS");
        Lugar canchaFut = new Lugar("Cancha Futbol");
        Lugar canchaBasket = new Lugar("Cancha Basquet");
        Lugar estacionamiento = new Lugar("Estacionamiento");
        Lugar auditorio = new Lugar("Auditorio");
        Lugar auditorioAba = new Lugar("Auditorio Abandonado");
        Lugar entradaEstacionamiento = new Lugar("Entrada Estacionamiento");
        Lugar entradaPrincipal = new Lugar("Entrada Principal");
        Lugar cabanaGastro = new Lugar("Cabaña Gastro");
        
        Lugar nodo1 = new Lugar("Nodo 1");
        Lugar nodo2 = new Lugar("Nodo 2");
        Lugar nodo3 = new Lugar("Nodo 3");
        Lugar nodo4 = new Lugar("Nodo 4");
        Lugar nodo5 = new Lugar("Nodo 5");
        Lugar nodo6 = new Lugar("Nodo 6");
        Lugar nodo7 = new Lugar("Nodo 7");
        Lugar nodo8 = new Lugar("Nodo 8");
        Lugar nodo9 = new Lugar("Nodo 9");
        Lugar nodo10 = new Lugar("Nodo 10");
        Lugar nodo11 = new Lugar("Nodo 11");
        Lugar nodo12 = new Lugar("Nodo 12");
        Lugar nodo13 = new Lugar("Nodo 13");
        Lugar nodo14 = new Lugar("Nodo 14");
        Lugar nodo15 = new Lugar("Nodo 15");
        Lugar nodo16 = new Lugar("Nodo 16");
        Lugar nodo17 = new Lugar("Nodo 17");
        Lugar nodo18 = new Lugar("Nodo 18");
        Lugar nodo19 = new Lugar("Nodo 19");
        Lugar nodo20 = new Lugar("Nodo 20");
        Lugar nodo21 = new Lugar("Nodo 21");
        Lugar nodo22 = new Lugar("Nodo 22");
        Lugar nodo23 = new Lugar("Nodo 23");
        Lugar nodo24 = new Lugar("Nodo 24");
        Lugar nodo25 = new Lugar("Nodo 25");
        Lugar nodo26 = new Lugar("Nodo 26");
        Lugar nodo27 = new Lugar("Nodo 27");
        Lugar nodo28 = new Lugar("Nodo 28");
        Lugar nodo29 = new Lugar("Nodo 29");
        Lugar nodo30 = new Lugar("Nodo 30");
        Lugar nodo31 = new Lugar("Nodo 31");
        Lugar nodo32 = new Lugar("Nodo 32");
        Lugar nodo33 = new Lugar("Nodo 33");
        Lugar nodo34 = new Lugar("Nodo 34");
        Lugar nodo35 = new Lugar("Nodo 35");

        grafo.nuevoLugar(nodo1);
        grafo.nuevoLugar(nodo2);
        grafo.nuevoLugar(nodo3);
        grafo.nuevoLugar(nodo4);
        grafo.nuevoLugar(nodo5);
        grafo.nuevoLugar(nodo6);
        grafo.nuevoLugar(nodo7);
        grafo.nuevoLugar(nodo8);
        grafo.nuevoLugar(nodo9);
        grafo.nuevoLugar(nodo10);
        grafo.nuevoLugar(nodo11);
        grafo.nuevoLugar(nodo12);
        grafo.nuevoLugar(nodo13);
        grafo.nuevoLugar(nodo14);
        grafo.nuevoLugar(nodo15);
        grafo.nuevoLugar(nodo16);
        grafo.nuevoLugar(nodo17);
        grafo.nuevoLugar(nodo18);
        grafo.nuevoLugar(nodo19);
        grafo.nuevoLugar(nodo20);
        grafo.nuevoLugar(nodo21);
        grafo.nuevoLugar(nodo22);
        grafo.nuevoLugar(nodo23);
        grafo.nuevoLugar(nodo24);
        grafo.nuevoLugar(nodo25);
        grafo.nuevoLugar(nodo26);
        grafo.nuevoLugar(nodo27);
        grafo.nuevoLugar(nodo28);
        grafo.nuevoLugar(nodo29);
        grafo.nuevoLugar(nodo30);
        grafo.nuevoLugar(nodo31);
        grafo.nuevoLugar(nodo32);
        grafo.nuevoLugar(nodo33);
        grafo.nuevoLugar(nodo34);
        grafo.nuevoLugar(nodo35);
        
        grafo.nuevoLugar(biblioteca); //
        grafo.nuevoLugar(cafeteria); //
        grafo.nuevoLugar(direccion); //
        grafo.nuevoLugar(edificioA); //
        grafo.nuevoLugar(edificioB); //
        grafo.nuevoLugar(edificioE); //
        grafo.nuevoLugar(vinculacion); //
        grafo.nuevoLugar(palapas); //
        grafo.nuevoLugar(tics); //
        grafo.nuevoLugar(canchaFut); //
        grafo.nuevoLugar(canchaBasket); //
        grafo.nuevoLugar(estacionamiento); //
        grafo.nuevoLugar(auditorio); //
        grafo.nuevoLugar(auditorioAba); //
        grafo.nuevoLugar(entradaEstacionamiento); //
        grafo.nuevoLugar(entradaPrincipal); //
        grafo.nuevoLugar(cabanaGastro); //
        
        
        // Biblioteca
        biblioteca.nuevaArista(nodo20, 11.75);
        
        // Nodo 20
        nodo20.nuevaArista(biblioteca, 11.75);
        nodo20.nuevaArista(nodo21, 18.10);
        
        // Nodo 21
        nodo21.nuevaArista(nodo20, 18.10);
    }
}
