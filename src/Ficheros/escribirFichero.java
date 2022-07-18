package Ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class escribirFichero {
    public static void main(String[] args) {
        
        FileWriter writer = null;

        String ruta="trimestre 1/src/Ficheros/Textos/Copiarte.txt";

        String frase="Messi Chiquito";

        try {
            
            writer = new FileWriter(ruta, true);

            for(int i=0; i<50; i++){
                writer.write(frase+"\n");
            }

            writer.append("\nUn poema de Franes");//append -> Añadir
            writer.append("\nUn poema de Franes");
            writer.close();

        } catch (IOException e) {
            System.out.println("Error en la escritura");
            System.out.println(e.getMessage());
        }

        finally{

            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el fichero");
            }
        }
    }
}
