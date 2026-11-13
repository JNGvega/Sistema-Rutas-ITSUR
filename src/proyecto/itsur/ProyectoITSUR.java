package proyecto.itsur;


//import com.formdev.flatlaf.FlatDarkLaf;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import proyecto.itsur.modelo.Grafo;
import proyecto.itsur.modelo.Lugar;
import proyecto.itsur.modelo.Ruta;


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
        
        // Entrada Principal
        entradaPrincipal.nuevaArista(nodo21, 20.84);
        
        // Auditorio
        auditorio.nuevaArista(nodo15, 19.66);
        
        // Direccion
        direccion.nuevaArista(nodo15, 10.30);
        
        // Vinculacion
        vinculacion.nuevaArista(nodo16, 9.92);
        
        // Cabaña gastro
        cabanaGastro.nuevaArista(nodo12, 57.99);
        cabanaGastro.nuevaArista(nodo13, 32.06);
        cabanaGastro.nuevaArista(nodo14, 18.76);
        
        // Palapas
        palapas.nuevaArista(nodo19, 18.75);
        palapas.nuevaArista(nodo32, 26.16);
        palapas.nuevaArista(nodo33, 25.91);
        
        // Auditorio abandonado
        auditorioAba.nuevaArista(nodo12, 27.40);
        auditorioAba.nuevaArista(canchaBasket, 29.67);
        
        // Cancha Basquet
        canchaBasket.nuevaArista(auditorioAba, 29.67);
        canchaBasket.nuevaArista(nodo11, 41.91);
        canchaBasket.nuevaArista(nodo12, 33.52);
        
        // Edificio A
        edificioA.nuevaArista(nodo33, 12.66);
        edificioA.nuevaArista(nodo34, 12.72);
        
        // Edificio B
        edificioB.nuevaArista(nodo24, 21.85);
        edificioB.nuevaArista(nodo25, 17.09);
        
        // Edificio E
        edificioE.nuevaArista(nodo30, 27.76);
        
        // Cafeteria
        cafeteria.nuevaArista(nodo29, 18.12);
        cafeteria.nuevaArista(nodo30, 9.88);
        
        // TICS
        tics.nuevaArista(nodo27, 10.25);
        
        // Cancha Futbol
        canchaFut.nuevaArista(nodo5, 50.27);
        canchaFut.nuevaArista(nodo6, 25.38);
        
        // Estacionamiento
        estacionamiento.nuevaArista(nodo3, 38.76);
        estacionamiento.nuevaArista(nodo4, 30.50);
        
        // Entrada Estacionamiento
        entradaEstacionamiento.nuevaArista(nodo1, 20.95);
        
        // Nodo 1
        nodo1.nuevaArista(entradaEstacionamiento, 20.95);
        nodo1.nuevaArista(nodo2, 25.75);
        
        // Nodo 2
        nodo2.nuevaArista(nodo1, 25.75);
        nodo2.nuevaArista(nodo3, 39.68);
        nodo2.nuevaArista(nodo23, 50.86);
        nodo2.nuevaArista(nodo24, 40.76);
        
        // Nodo 3
        nodo3.nuevaArista(estacionamiento, 38.76);
        nodo3.nuevaArista(nodo2, 39.68);
        nodo3.nuevaArista(nodo4, 38.83);
        nodo3.nuevaArista(nodo7, 71.78);
        nodo3.nuevaArista(nodo25, 66.75);
        
        // Nodo 4
        nodo4.nuevaArista(estacionamiento, 30.50);
        nodo4.nuevaArista(nodo3, 38.83);
        nodo4.nuevaArista(nodo5, 28.89);
        
        // Nodo 5
        nodo5.nuevaArista(canchaFut, 50.27);
        nodo5.nuevaArista(nodo4, 28.89);
        
        // Nodo 6
        nodo6.nuevaArista(canchaFut, 25.38);
        nodo6.nuevaArista(nodo7, 14.64);
        
        // Nodo 7
        nodo7.nuevaArista(nodo3, 71.78);
        nodo7.nuevaArista(nodo6, 14.64);
        nodo7.nuevaArista(nodo8, 27.69);
        nodo7.nuevaArista(nodo25, 32.84);
        
        // Nodo 8
        nodo8.nuevaArista(nodo7, 27.69);
        nodo8.nuevaArista(nodo9, 38.11);
        nodo8.nuevaArista(nodo26, 45.45);
        
        // Nodo 9
        nodo9.nuevaArista(nodo8, 38.11);
        nodo9.nuevaArista(nodo10, 44.14);
        
        // Nodo 10
        nodo10.nuevaArista(nodo9, 44.14);
        nodo10.nuevaArista(nodo11, 47.81);
        nodo10.nuevaArista(nodo29, 34.43);
        
        // Nodo 11
        nodo11.nuevaArista(canchaBasket, 41.91);
        nodo11.nuevaArista(nodo10, 47.81);
        nodo11.nuevaArista(nodo12, 57.23);
        nodo11.nuevaArista(nodo30, 23.65);
        
        // Nodo 12
        nodo12.nuevaArista(canchaBasket, 33.52);
        nodo12.nuevaArista(cabanaGastro, 57.99);
        nodo12.nuevaArista(auditorioAba, 27.40);
        nodo12.nuevaArista(nodo11, 57.23);
        nodo12.nuevaArista(nodo13, 59.33);
        nodo12.nuevaArista(nodo31, 56.34);
        nodo12.nuevaArista(nodo33, 83.79);
        
        // Nodo 13
        nodo13.nuevaArista(cabanaGastro, 32.06);
        nodo13.nuevaArista(nodo12, 59.33);
        nodo13.nuevaArista(nodo14, 16.33);
        nodo13.nuevaArista(nodo18, 44.87);
        nodo13.nuevaArista(nodo31, 64.46);
        nodo13.nuevaArista(nodo32, 19.63);
        
        // Nodo 14
        nodo14.nuevaArista(cabanaGastro, 18.76);
        nodo14.nuevaArista(nodo13, 16.33);
        nodo14.nuevaArista(nodo15, 16.39);
        
        // Nodo 15
        nodo15.nuevaArista(auditorio, 19.66);
        nodo15.nuevaArista(direccion, 10.30);
        nodo15.nuevaArista(nodo14, 16.39);
        nodo15.nuevaArista(nodo16, 14.94);
        
        
        // Nodo 16
        nodo16.nuevaArista(vinculacion, 9.92);
        nodo16.nuevaArista(nodo15, 14.94);
        nodo16.nuevaArista(nodo17, 14.10);
        
        // Nodo 17
        nodo17.nuevaArista(nodo16, 14.10);
        nodo17.nuevaArista(nodo18, 20.87);
        
        // Nodo 18
        nodo18.nuevaArista(nodo13, 44.87);
        nodo18.nuevaArista(nodo17, 20.87);
        nodo18.nuevaArista(nodo19, 39.56);
        
        // Nodo 19
        nodo19.nuevaArista(nodo18, 39.56);
        nodo19.nuevaArista(nodo20, 24.71);
        nodo19.nuevaArista(nodo22, 22.79);
        nodo19.nuevaArista(palapas, 18.75);
        
        // Nodo 20
        nodo20.nuevaArista(biblioteca, 11.75);
        nodo20.nuevaArista(nodo21, 18.10);
        nodo20.nuevaArista(nodo19, 24.71);
        
        // Nodo 21
        nodo21.nuevaArista(entradaPrincipal, 20.84);
        nodo21.nuevaArista(nodo20, 18.10);
        nodo21.nuevaArista(nodo22, 25.00);
        
        // Nodo 22
        nodo22.nuevaArista(nodo19, 22.79);
        nodo22.nuevaArista(nodo21, 25.00);
        nodo22.nuevaArista(nodo23, 22.14);
        nodo22.nuevaArista(nodo33, 32.73);
        
        // Nodo 23
        nodo23.nuevaArista(nodo2, 50.86);
        nodo23.nuevaArista(nodo22, 22.14);
        nodo23.nuevaArista(nodo24, 39.69);
        
        // Nodo 24
        nodo24.nuevaArista(edificioB, 21.85);
        nodo24.nuevaArista(nodo2, 40.76);
        nodo24.nuevaArista(nodo23, 39.69);
        nodo24.nuevaArista(nodo35, 33.07);
        
        // Nodo 25
        nodo25.nuevaArista(edificioB, 17.09);
        nodo25.nuevaArista(nodo3, 66.75);
        nodo25.nuevaArista(nodo7, 32.84);
        nodo25.nuevaArista(nodo26, 26.96);
        
        // Nodo 26
        nodo26.nuevaArista(nodo8, 45.45);
        nodo26.nuevaArista(nodo25, 26.96);
        nodo26.nuevaArista(nodo27, 27.20);
        nodo26.nuevaArista(nodo35, 35.87);
        
        // Nodo 27
        nodo27.nuevaArista(tics, 10.25);
        nodo27.nuevaArista(nodo26, 27.20);
        nodo27.nuevaArista(nodo28, 15.56);
        
        // Nodo 28
        nodo28.nuevaArista(nodo27, 15.56);
        nodo28.nuevaArista(nodo29, 25.89);
        nodo28.nuevaArista(nodo30, 44.70);
        nodo28.nuevaArista(nodo31, 37.07);
        nodo28.nuevaArista(nodo35, 34.78);
        
        // Nodo 29
        nodo29.nuevaArista(cafeteria, 18.12);
        nodo29.nuevaArista(nodo10, 34.43);
        nodo29.nuevaArista(nodo28, 25.89);
        
        // Nodo 30
        nodo30.nuevaArista(cafeteria, 9.88);
        nodo30.nuevaArista(edificioE, 27.76);
        nodo30.nuevaArista(nodo11, 23.65);
        nodo30.nuevaArista(nodo28, 44.70);
        
        // Nodo 31
        nodo31.nuevaArista(nodo12, 56.34);
        nodo31.nuevaArista(nodo13, 64.46);
        nodo31.nuevaArista(nodo28, 37.07);
        nodo31.nuevaArista(nodo34, 29.55);
        
        // Nodo 32
        nodo32.nuevaArista(palapas, 26.16);
        nodo32.nuevaArista(nodo13, 19.63);
        
        // Nodo 33
        nodo33.nuevaArista(edificioA, 12.66);
        nodo33.nuevaArista(nodo12, 83.79);
        nodo33.nuevaArista(nodo22, 32.73);
        nodo33.nuevaArista(palapas, 25.91);
        
        // Nodo 34
        nodo34.nuevaArista(edificioA, 12.72);
        nodo34.nuevaArista(nodo31, 29.55);
        nodo34.nuevaArista(nodo35, 18.46);
        
        // Nodo 35
        nodo35.nuevaArista(nodo24, 33.07);
        nodo35.nuevaArista(nodo26, 35.87);
        nodo35.nuevaArista(nodo28, 34.78);
        nodo35.nuevaArista(nodo34, 18.46);
        
        Ruta rt = grafo.dijkstra(vinculacion, estacionamiento);
        List<Lugar> a = rt.getCamino();
        for(Lugar lugar : a) {
            System.out.println(lugar.getNombre());
        }
        System.out.println(rt.getDistancia());
    }
}
