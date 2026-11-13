package proyecto.itsur.modelo;
import java.util.*;

public class Lugar {
    private String nombre;
    private int x;
    private int y;
    
    List<Arista> aristas;
    double distancia;
    Lugar anterior;
    
    public Lugar(String nombre) {
        this.nombre = nombre;
        this.aristas = new ArrayList<>();
    }
    
    public Lugar (String nombre, int x, int y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }
    
    public void nuevaArista(Lugar destino, double peso) {
        aristas.add(new Arista(destino, peso));
    }
    
    public String getNombre () {
        return nombre;
    }
    
    public int getX () {
        return x;
    }
    
    public int getY () {
        return y;
    }
    
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lugar lugar = (Lugar)o;
        return Objects.equals(nombre, lugar.nombre);
    }
    
    @Override
    public int hashCode () {
        return Objects.hash(nombre);
    }
    
    @Override 
    public String toString () {
        return nombre;
    }
}
