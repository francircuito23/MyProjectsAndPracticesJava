package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ej118 {
    public static void main(String[] args) {
        
        String[] palabras;

        String linea="";

        Map<String, Integer> mapa= new HashMap<>();

        FileReader lector= null;
        BufferedReader miBuffer= null;

        String ruta="trimestre 1/src/Ficheros/Textos/ej118.txt";

        try {
            
            lector = new FileReader(ruta);
            miBuffer= new BufferedReader(lector);

            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    palabras = linea.toLowerCase().split(" ");

                    for(String k: palabras){
                        if(mapa.containsKey(k)){
                            mapa.replace(k, mapa.get(k), mapa.get(k)+1);
                        }
                        else{
                            mapa.put(k, 1);
                        }
                    }

                }

            }while(linea!=null);

            for(String clave: mapa.keySet()){

                System.out.println("Palabra: "+clave+" Aparece: "+mapa.get(clave));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

        finally{

            try {
                
                lector.close();
                miBuffer.close();

            } catch (IOException e) {
                System.out.println("Error cerrando el fichero");
            }
        }
    }
}
