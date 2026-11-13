package proyecto.itsur.modelo;
import java.util.*;

public class Grafo {
    List<Lugar> lugares = new ArrayList<>();
    public void nuevoLugar(Lugar n) {
        lugares.add(n);
    }
    private static class Candidato {
        Lugar lugar;
        double distancia;
        Candidato(Lugar lugar, double distancia) {
            this.lugar = lugar;
            this.distancia = distancia;
        }
    }
 
    public void Camino(List<Lugar> camino, Map<Lugar, Lugar> anterior, Lugar p) {
        if(p == null) {
            return;
        }
        Lugar q = anterior.get(p);
        Camino(camino, anterior, q);
        camino.add(p);
    }
    
    public Ruta dijkstra(Lugar inicio, Lugar fin) {
        Map<Lugar, Double> distancias = new HashMap<>();
        Map<Lugar, Lugar> anterior = new HashMap<>();
        Set<Lugar> visitados = new HashSet<>();
        PriorityQueue<Candidato> cola = new PriorityQueue<>(Comparator.comparingDouble((Candidato c) -> c.distancia));
 
        distancias.put(inicio, 0.0);
        cola.add(new Candidato(inicio, 0.0));
 
        while(!cola.isEmpty()) {
            Candidato actual = cola.poll();
            Lugar u = actual.lugar;
            if(visitados.contains(u)) continue;
            visitados.add(u);
            if(u.equals(fin)) break; 
            for(Arista a : u.aristas) {
                Lugar v = a.getDestino();
                if(visitados.contains(v)) continue;
                double nueva = actual.distancia + a.distancia();
                if(nueva < distancias.getOrDefault(v, Double.POSITIVE_INFINITY)) {
                    distancias.put(v, nueva);
                    anterior.put(v, u);
                    cola.add(new Candidato(v, nueva));
                }
            }
        }
 
        List<Lugar> camino = new LinkedList<>();
        Camino(camino, anterior, fin);
        return new Ruta(camino, distancias.get(fin));
    }
}
