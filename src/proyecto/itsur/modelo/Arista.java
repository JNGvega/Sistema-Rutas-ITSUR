package proyecto.itsur.modelo;

public class Arista {
    Lugar destino;
    double distancia;
    public Arista(Lugar destino, double distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }
}
