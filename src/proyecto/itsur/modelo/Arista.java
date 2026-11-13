package proyecto.itsur.modelo;

public class Arista {
    Lugar destino;
    int distancia;
    public Arista(Lugar destino, int distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }
}
