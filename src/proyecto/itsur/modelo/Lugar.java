package proyecto.itsur.modelo;
import java.util.*;

public class Lugar {
    String nombre;
    List<Arista> aristas;
    int distancia;
    Lugar anterior;
    public Lugar(String nombre) {
        this.nombre = nombre;
        this.aristas = new ArrayList<>();
    }
    public void nuevaArista(Lugar destino, int peso) {
        aristas.add(new Arista(destino, peso));
    }
    @Override
    public String toString() {
        return nombre;
    }
}
