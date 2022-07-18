package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class buffer3 {
    public static void main(String[] args) {
        FileReader lector= null;
        BufferedReader miBuffer= null;

        String linea="";


        try {

            lector = new FileReader("C:/Users/Usuario/Desktop/FICHEROS/arte.txt");
            miBuffer= new BufferedReader(lector);

            do{

                linea= miBuffer.readLine();

                if(linea!=null){
                    System.out.println(linea);

                }

            }while(linea!=null);
                

        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());

        } catch (IOException e) {

            System.out.println(e.getMessage());

        } finally {

            try {

                lector.close();

            } catch (IOException e) {
                System.out.println("Error cerrando el fichero");
            }

            try {

                miBuffer.close();

            } catch (IOException e) {

                System.out.println("Error cerrando el buffer");
            }
        
        }
    }
}
