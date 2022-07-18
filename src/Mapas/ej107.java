package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ej107 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        String texto=" ";

        Map<String, Integer> mapa= new HashMap<>();

        System.out.println("Escribe el texto:");
        String linea;

        do{
            linea=entrada.nextLine();
            linea=linea.toLowerCase();

            texto=texto+linea+"";

        }while(!linea.equals(""));

        String[] palabras=texto.split(" ");

        for(String k: palabras){
            if(mapa.containsKey(k)){
                mapa.replace(k, mapa.get(k), mapa.get(k)+1);
            }
            else{
                mapa.put(k, 1);
            }
        }

        for(String clave: mapa.keySet()){
            System.out.println("Palabra: "+clave+mapa.get(clave)+" "+" veces");
        }
    }
}
