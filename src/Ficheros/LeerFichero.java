package Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
    public static void main(String[] args) {

        FileReader lector = null;
        int datos=0;
        
        try {

            lector = new FileReader("C:/Users/Usuario/Desktop/FICHEROS/arte.txt");
            datos=lector.read();

            while(datos != -1){
                System.out.print((char)datos);
                datos = lector.read();
            }

        } catch (FileNotFoundException e) { //Fichero no encontrado
            e.printStackTrace();

        } catch (IOException e){ //Fallo de lectura
            e.printStackTrace();

        } finally {
            
            try {

                lector.close();

            } catch (IOException e) {
                System.out.println("Error cerrando el fichero");
            }
        }
    }
}
