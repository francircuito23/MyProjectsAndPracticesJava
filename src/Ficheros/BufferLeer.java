package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferLeer {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        FileWriter writer = null;
        FileReader lector = null;
        BufferedReader bufferReader= null;
        BufferedWriter bufferWriter= null;

        String ficheroLeer= "";
        String ficheroEscribir="";
        String linea=""; //buffer

        String ruta="trimestre 1/src/Ficheros/Textos/"+ficheroLeer;

        try {
            
            System.out.print("Dime el nombre del fichero que quieres leer: ");
            ficheroLeer=entrada.next();
    
            System.out.print("Dime el nombre del fichero que quieres escribir: ");
            ficheroEscribir=entrada.next();

            lector = new FileReader(ruta+ficheroLeer);

            writer = new FileWriter(ruta+ficheroEscribir);

            bufferReader= new BufferedReader(lector);

            bufferWriter= new BufferedWriter(writer);

            System.out.println("Copiando...");
            try {
                do{    
                    linea=bufferReader.readLine();

                    if(linea!=null){
                        bufferWriter.write(linea);
    
                    }
    
                }while(linea!=null);

            } catch (IOException e) {
                System.out.println(e.getMessage());
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
                
                bufferWriter.close();
                bufferReader.close();
                writer.close();
                lector.close();

            } catch (IOException e) {
                System.out.println("Error cerrando el fichero");
            }
        }
    }
}
