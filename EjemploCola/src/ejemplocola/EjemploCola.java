package ejemplocola;

import java.util.*;

public class EjemploCola {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        cola.add("Elemento 1");
        cola.add("Elemento 2");
        cola.add("Elemento 3");
        
        System.out.println("Primero en la cola: " + cola.peek());
        
        // Sacar el primer elemento
        System.out.println("Sacando el primer elemento: " + cola.poll());
        System.out.println("Cola después de sacar el primer elemento: " + cola);
    }
}
