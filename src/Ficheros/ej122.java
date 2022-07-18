package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ej122 {
    public static void main(String[] args) {
        
        FileReader lector= null;
        BufferedReader miBuffer= null;

        String linea="";

        String ruta="trimestre 1/src/Ficheros/Textos/ej122.txt";

        String[] palabras;

        Map<String, String> contenido= new HashMap<>();

        try {
            
            lector = new FileReader(ruta);
            miBuffer= new BufferedReader(lector);

            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    palabras = linea.split(":");

                    contenido.put("Item:     ", palabras[0]);
                    contenido.put("Precio:   ", palabras[2]);
                    contenido.put("Cantidad: ", palabras[2]);

                    for (String elementos : contenido.keySet()){

                        System.out.print(elementos + contenido.get(elementos) + "\n");
    
                    }
    
                    System.out.println();

                }

            }while(linea!=null);

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
