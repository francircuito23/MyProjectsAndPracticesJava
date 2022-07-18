package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej119 {
    
    public static void main(String[] args) {
        
        FileReader lector= null;
        BufferedReader miBuffer= null;

        String linea="";

        String ruta="trimestre 1/src/Ficheros/Textos/ej118.txt";

        int contador=1;

        try {
            
            lector = new FileReader(ruta);
            miBuffer= new BufferedReader(lector);

            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    System.out.println("Linea "+contador+": "+linea);

                    contador++;

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
