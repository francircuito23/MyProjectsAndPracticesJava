package ArrayList;

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

public class ejemplo {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(3)); // Devuelve el cajón con el get
        System.out.println();

        /*
        cars.add(2,"RX7"); // Añade pero al cajon que se le indique
        cars.set(0, "Opel"); // Actualiza el cajón con el set
        cars.remove(0); // Elimina el cajón que se le indique
        cars.clear(); // Elimina todos los cajones del Arraylist
        cars.size(); // Devuelve el tamaño del Arraylist
        */

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println();

        if(cars.contains("Volvo")){
            System.out.println("SÍ ESTÁ");
        }
        else{
            System.out.println("NO ESTÁ");
        }
        
        System.out.println(cars.indexOf("Volvo")); // primera posición en la que aparece el elemento del cajón. Si no existe el elemento devuelve -1

        System.out.println(cars.lastIndexOf("BMW")); // ultima posición en la que aparece el elemento del cajón. Si no existe el elemento devuelve -1

        cars.isEmpty(); // Método que devuelve TRUE en el caso de que el tamaño de la cadena sera 0. Si NO devuelve FALSE

        System.out.println();

        Collections.sort(cars);  // Ordena alfabéticamente o numéricamente el ArrayList

        for (String i : cars) {
            System.out.println(i);
        }

    }
}
