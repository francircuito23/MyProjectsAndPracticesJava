package Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pizarra {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        FileWriter writer = null;
        FileReader lector = null;

        String ficheroLeer= "";
        String ficheroEscribir="";

        int datos=0;

        char letra;

        String ruta="trimestre 1/src/Ficheros/Textos/"+ficheroLeer;

        try {
            
            System.out.print("Dime el nombre del fichero que quieres leer: ");
            ficheroLeer=entrada.next();
    
            System.out.print("Dime el nombre del fichero que quieres escribir: ");
            ficheroEscribir=entrada.next();

            lector = new FileReader(ruta+ficheroLeer);

            writer = new FileWriter(ruta+ficheroEscribir);

            System.out.println("Copiando...");

            while(datos != -1){

                datos = lector.read();
                letra=(char)datos;

                if(datos!= -1){
                    writer.write(letra);
                }
                
            }

            System.out.println("Copiado.");

        } catch (FileNotFoundException e) { //Fichero no encontrado
            e.printStackTrace();

        } catch (IOException e) {

            System.out.println("Error en la escritura");
            System.out.println(e.getMessage());
            
        }

        finally{

            try {
                writer.close();
                lector.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el fichero");
            }
        }
    }
}
