package proyecto.itsur.modelo;
 
import java.util.*;

public class Ruta {
    private List<Lugar> camino;
    private double distancia;

    public Ruta(List<Lugar> camino, double distancia) {
        this.camino = Collections.unmodifiableList(camino);
        this.distancia = distancia;
    }
 
    public List<Lugar> getCamino() {
        return camino;
    }

    public double getDistancia() {
        return distancia;
    }
}