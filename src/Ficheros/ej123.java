package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej123 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        FileReader lector1 = null, lector2 = null;
        BufferedReader miBuffer= null;
        BufferedWriter bufferWriter = null;
        FileWriter writer = null;
        
        File archivo = null;

        String fichero1= "";
        String fichero1txt="";
        String fichero2= "";
        String fichero2txt="";
        String linea="";

        String name;

        String ruta="trimestre 1/src/Ficheros/Textos/";

        try {
            
            System.out.print("Dime el nombre del fichero 1: ");
            fichero1 = entrada.next();
            fichero1txt = fichero1+".txt";
    
            System.out.print("Dime el nombre del fichero 2: ");
            fichero2=entrada.next();
            fichero2txt = fichero2+".txt";

            name = ruta+fichero1+"-"+fichero2+".txt";

            archivo = new File (name);

            if(!archivo.exists()){
                archivo.createNewFile();
            }

            System.out.println("Copiando...");

            lector1 = new FileReader(ruta+fichero1txt);

            miBuffer = new BufferedReader(lector1);

            writer = new FileWriter(name);

            bufferWriter = new BufferedWriter(writer);

            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    bufferWriter.write(linea +"\n");
                }

            }while(linea!=null);


            lector2 = new FileReader(ruta+fichero2txt);

            miBuffer = new BufferedReader(lector2);


            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    bufferWriter.write("\n");
                    bufferWriter.write(linea);
                }

            }while(linea!=null);

            System.out.println("Copiado.");

        } catch (FileNotFoundException e) { //Fichero no encontrado
            e.printStackTrace();

        } catch (IOException e) {

            System.out.println("Error en la escritura");
            System.out.println(e.getMessage());
            
        }

        finally{

            try {

                lector2.close();
                bufferWriter.close();
                writer.close();
                miBuffer.close();
                lector1.close();

            } catch (IOException e) {
                System.out.println("Error cerrando el fichero");
            }
        }
    }
    
}
