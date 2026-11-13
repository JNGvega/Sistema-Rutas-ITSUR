package proyecto.itsur.modelo;

public class Arista {
    private Lugar destino;
    /* 
    tenemos la distancia en metros como una unidad universal
    para el proyecto
    */
    private double distancia;
    public Arista (Lugar destino, double distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }
    
    public Lugar getDestino () {
        return destino;
    }
    
    public double distancia () {
        return distancia;
    }
}
