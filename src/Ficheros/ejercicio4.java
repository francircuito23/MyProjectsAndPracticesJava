package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ejercicio4 {
    public static void main(String[] args) {
        
        FileReader lector= null;
        BufferedReader miBuffer= null;

        String linea="";

        String ruta="trimestre 1/src/Ficheros/Textos/alumnos.txt";

        String[] palabras;

        Map<String, String> contenido= new HashMap<>();

        try {
            
            lector = new FileReader(ruta);
            miBuffer= new BufferedReader(lector);


            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    palabras = linea.split(";");

                    contenido.put(palabras[0], "");
                    contenido.put(palabras[1], "");
                    contenido.put(palabras[2], "");
                    contenido.put(palabras[3], "");
                    contenido.put(palabras[4], "");
                    contenido.put(palabras[5], "");
                    contenido.put(palabras[6], "");
                    contenido.put(palabras[7], "");
                    contenido.put(palabras[8], "");
                    contenido.put(palabras[9], "");
                    contenido.put(palabras[10], "");
                    contenido.put(palabras[11], "");
                    contenido.put(palabras[12], "");


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
