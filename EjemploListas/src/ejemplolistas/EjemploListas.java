package ejemplolistas;

import java.util.*;

public class EjemploListas {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Manzana"); // Duplicado
        
        System.out.println("Lista de frutas: " + frutas);
        
        // Acceder a un elemento por índice
        System.out.println("Primer fruta: " + frutas.get(0)); // Imprime "Manzana"
        
        // Eliminar un elemento
        frutas.remove("Banana");
        System.out.println("Lista después de eliminar Banana: " + frutas);
    }
}