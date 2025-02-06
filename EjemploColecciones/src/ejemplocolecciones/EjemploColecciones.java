package ejemplocolecciones;

import java.util.*; // Importa las clases necesarias de colecciones

public class EjemploColecciones {
    public static void main(String[] args) {
        
        // 1. Creación de una lista (List)
        List<String> frutas = new ArrayList<>(); // Lista que permite elementos duplicados y mantiene el orden
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Manzana"); // Agregar un elemento duplicado para mostrar cómo funciona
        
        System.out.println("Lista de frutas: " + frutas);
        // Acceder a un elemento por índice
        System.out.println("Primer fruta: " + frutas.get(0)); // Imprime "Manzana"
        
        // 2. Crear un conjunto (Set)
        Set<String> conjuntoFrutas = new HashSet<>(); // Conjunto no permite elementos duplicados
        conjuntoFrutas.add("Manzana");
        conjuntoFrutas.add("Banana");
        conjuntoFrutas.add("Naranja");
        conjuntoFrutas.add("Manzana"); // Intentamos agregar un duplicado
        
        System.out.println("Conjunto de frutas (sin duplicados): " + conjuntoFrutas);
        
        // 3. Crear una cola (Queue)
        Queue<String> cola = new LinkedList<>(); // Cola FIFO
        cola.add("Elemento 1");
        cola.add("Elemento 2");
        cola.add("Elemento 3");
        
        System.out.println("Elemento en la cola: " + cola.peek()); // Muestra el primer elemento sin eliminarlo
        
        // Extraer el primer elemento de la cola (FIFO)
        System.out.println("Sacando el primer elemento: " + cola.poll()); // Elimina y devuelve el primer elemento
        
        System.out.println("Cola después de sacar el primer elemento: " + cola);
        
        // 4. Crear un mapa (Map) para almacenar claves y valores
        Map<Integer, String> mapaTelefonico = new HashMap<>();
        mapaTelefonico.put(123456789, "Juan");
        mapaTelefonico.put(987654321, "Ana");
        mapaTelefonico.put(112233445, "Carlos");
        
        System.out.println("Mapa telefónico: " + mapaTelefonico);
        // Obtener el valor asociado a una clave
        System.out.println("Número 123456789 pertenece a: " + mapaTelefonico.get(123456789));
        
        // 5. Operaciones comunes con colecciones
        // 5.1 Eliminar elementos de la lista
        frutas.remove("Banana"); // Eliminar un elemento específico
        System.out.println("Lista de frutas después de eliminar Banana: " + frutas);
        
        // 5.2 Verificar si un elemento está en el conjunto
        boolean contieneManzana = conjuntoFrutas.contains("Manzana");
        System.out.println("¿El conjunto contiene Manzana? " + contieneManzana);
        
        // 5.3 Iterar sobre la lista
        System.out.println("Iterando sobre la lista de frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // 6. Diferencias entre colecciones
        // Arrays: Son más eficientes para acceder a elementos por índice, pero tienen un tamaño fijo.
        // ArrayList: Tiene mayor flexibilidad al cambiar su tamaño, pero puede ser más lento para operaciones de inserción/eliminación en medio de la lista.
        // HashSet: Almacena elementos únicos y no mantiene ningún orden específico.
        // LinkedList: Es más eficiente en inserciones y eliminaciones en el medio de la lista, pero más lento en el acceso por índice.

        // 7. Uso de la colecciones en casos prácticos
        // Listas: Útil cuando necesitamos mantener el orden, como una lista de tareas.
        // Conjuntos: Útil cuando necesitamos asegurarnos de que no haya duplicados, como un conjunto de IDs únicos.
        // Mapas: Útil cuando necesitamos asociar una clave a un valor, como un directorio telefónico.
    }
}