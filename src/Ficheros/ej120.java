package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ej120 {

    public static void main(String[] args) {
        
        FileReader lector= null;
        BufferedReader miBuffer= null;

        String linea="";

        String ruta="trimestre 1/src/Ficheros/Textos/ej118.txt";

        String mayor="";

        ArrayList<String> frases = new ArrayList<>();

        try {
            
            lector = new FileReader(ruta);
            miBuffer= new BufferedReader(lector);

            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    if(linea.length() > mayor.length()){ //para el b) poner un >=

                        mayor=linea;

                    }

                }

            }while(linea!=null);


            lector = new FileReader(ruta);
            miBuffer= new BufferedReader(lector);

            do{
                linea= miBuffer.readLine();

                if(linea!=null){

                    if(linea.length() == mayor.length()){
                        frases.add(linea);
                    }
                }


            }while(linea!=null);

            System.out.println("Apartado A:");
            System.out.println(mayor+"\n");

            System.out.println("Apartado C: ");

            for(String i:frases){
                System.out.println(i);
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
