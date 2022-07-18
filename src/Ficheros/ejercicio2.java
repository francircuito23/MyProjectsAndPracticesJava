package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        FileReader lector= null;
        BufferedReader miBuffer= null;

        String linea="";
        String palabra="";

        String[] palabras;

        String ruta="trimestre 1/src/Ficheros/Textos/texto1.txt";

        int contador=0;


        try {

            System.out.print("Dime la palabra: ");
            palabra=entrada.next();
            
            lector = new FileReader(ruta);
            miBuffer= new BufferedReader(lector);

            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    linea.toLowerCase();

                    palabras = linea.split(" ");

                    for(String i: palabras){
                        
                        if(i.equals(palabra)){

                            contador++;
                        }
                    }
                    
                }

            }while(linea!=null);

            System.out.println("La palabra "+palabra+" aparece "+contador+" veces en el fichero");


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
