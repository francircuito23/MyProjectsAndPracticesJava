package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicio1 {
    public static void main(String[] args) {

        FileWriter writer = null;
        FileReader lector = null;
        BufferedReader bufferReader = null;
        BufferedWriter bufferWriter = null;

        File archivo = null;

        String[] palabras;

        String linea = ""; // buffer

        String ruta = "trimestre 1/src/Ficheros/Textos/texto1.txt";

        String name = "trimestre 1/src/Ficheros/Textos/salida.txt";

        try {

            archivo = new File(name);

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            lector = new FileReader(ruta);

            bufferReader = new BufferedReader(lector);

            writer = new FileWriter(name);

            bufferWriter = new BufferedWriter(writer);

            System.out.println("Copiando...");

            do {

                linea = bufferReader.readLine();

                if (linea != null) {

                    palabras = linea.split(" "); // elimino los espacios

                    for (String i : palabras) { // recorro el split y lo escribo luego
                        bufferWriter.write(i);
                    }
                    
                    bufferWriter.write("\n");

                }

            } while (linea != null);

            System.out.println("Copiado.");

        } catch (FileNotFoundException e) { // Fichero no encontrado
            e.printStackTrace();

        } catch (IOException e) {

            System.out.println("Error en la escritura");
            System.out.println(e.getMessage());

        }

        finally {

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
