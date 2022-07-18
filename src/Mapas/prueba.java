package Mapas;

import java.util.Map;
import java.util.HashMap;

public class prueba {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Robert", 9); // Clave, Valor
        map.put("Juanje", 9);
        map.put("Zea", 10);

        for (String key: map.keySet()){  
			System.out.println("La clave es "+ key +" y su valor es "+ map.get(key));
        }

        Integer res = map.get("Robert"); //Devuelve el valor de la Clave que se le diga

        int ele = map.remove("Zea"); //Borra el par clave/valor de la clave que se le pasa como parámetro
        map.remove("Zea", 23); //Te lo quita si el valor 23 es el mismo al de la Clave

        map.clear(); //Borra todos los componentes del Map
        map.isEmpty(); //Devuelve True si no hay elementos en el Map y False si si los hay
        map.size(); // Devuelve el numero de elementos del Map

        map.containsKey("Zea"); //Devuelve True si existe y False si no
        map.containsValue(8); //Devuelve True si existe y False si no

    }
}
