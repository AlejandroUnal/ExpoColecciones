package ejemplomapa;

import java.util.*;

public class EjemploMapa {
    public static void main(String[] args) {
        Map<Integer, String> mapaTelefonico = new HashMap<>();
        mapaTelefonico.put(123456789, "Juan");
        mapaTelefonico.put(987654321, "Ana");
        mapaTelefonico.put(112233445, "Carlos");
        
        System.out.println("Mapa telefónico: " + mapaTelefonico);
        
        // Acceder al valor por clave
        System.out.println("Número 123456789 pertenece a: " + mapaTelefonico.get(123456789));
    }
}
