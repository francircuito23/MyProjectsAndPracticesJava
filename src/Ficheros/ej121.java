package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej121 {
    public static void main(String[] args) {
        
        FileReader lector= null;
        BufferedReader miBuffer= null;

        String linea="";

        String ruta="trimestre 1/src/Ficheros/Textos/ej118.txt";

        int contadorLineas=0;

        int contadorLetras=0;

        try {
            
            lector = new FileReader(ruta);
            miBuffer= new BufferedReader(lector);

            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    contadorLineas++;

                }

            }while(linea!=null);

            lector = new FileReader(ruta);
            miBuffer= new BufferedReader(lector);

            String sinEspacios;

            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    sinEspacios = linea.replace(" ", "");
                    contadorLetras += sinEspacios.length();
                }

            }while(linea!=null);

            lector = new FileReader(ruta);
            miBuffer= new BufferedReader(lector);

            int contadorPalabras=0;

            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    contadorPalabras += linea.split(" ").length;

                }

            }while(linea!=null);

            System.out.println("Lineas: "+contadorLineas);
            System.out.println("Letras: "+contadorLetras);
            System.out.println("Palabras: "+contadorPalabras);

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
