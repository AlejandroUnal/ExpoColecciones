package ejemploconjunto;

import java.util.*;

public class EjemploConjunto {
    public static void main(String[] args) {
        Set<String> conjuntoFrutas = new HashSet<>();
        conjuntoFrutas.add("Manzana");
        conjuntoFrutas.add("Banana");
        conjuntoFrutas.add("Naranja");
        conjuntoFrutas.add("Manzana"); // Intentamos agregar duplicado
        
        System.out.println("Conjunto de frutas (sin duplicados): " + conjuntoFrutas);
    }
}