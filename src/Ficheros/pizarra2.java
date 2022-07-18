package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class pizarra2 {
    
    public static void main(String[] args) {
        
        FileReader lector= null;
        BufferedReader miBuffer= null;

        String linea="";

        String ruta="trimestre 1/src/Ficheros/Textos/vocales.txt";

        int contadorVocales=0;


        try {
            
            lector = new FileReader(ruta);
            miBuffer= new BufferedReader(lector);

            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    linea.toLowerCase();

                    for(int i=0; i<linea.length(); i++){

                        if(linea.charAt(i) == 'a' || linea.charAt(i) == 'e' || linea.charAt(i) == 'i' || linea.charAt(i) == 'o' 
                        || linea.charAt(i) == 'u'){

                            contadorVocales++;
                        }

                    }
                    
                }

            }while(linea!=null);

            System.out.println("Vocales: "+contadorVocales);


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
