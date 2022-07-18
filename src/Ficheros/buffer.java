package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class buffer {
    public static void main(String[] args) {

        FileReader lector= null;
        BufferedReader miBuffer = null;
        int datos=0;


        try {

            lector = new FileReader("trimestre 1/src/Ficheros/buffer.java");
            miBuffer = new BufferedReader(lector);

            while(datos != -1){
                datos = lector.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            try {

                lector.close();

            } catch (IOException e) {
                System.out.println("Error cerrando el fichero");
            }

            try {

                miBuffer.close();

            } catch (IOException e) {

                System.out.println("Error de buffer");
            }
        }
    }
}
