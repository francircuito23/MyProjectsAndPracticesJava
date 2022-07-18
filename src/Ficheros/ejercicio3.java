package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        FileReader lector= null;
        BufferedReader miBuffer= null;

        String linea="";

        String fichero1= "";

        String ruta="trimestre 1/src/Ficheros/Textos/";


        try {

            System.out.print("Dime el nombre del fichero : ");
            fichero1 = entrada.next();
            
            lector = new FileReader(ruta+fichero1);
            miBuffer= new BufferedReader(lector);

            do{

                linea= miBuffer.readLine();

                if(linea!=null){

                    linea.toLowerCase();

                    for(int i=0; i<linea.length(); i++){

                        if(linea.charAt(i) == 'a' || linea.charAt(i) == 'e' || linea.charAt(i) == 'i' || linea.charAt(i) == 'o' 
                        || linea.charAt(i) == 'u'){

                            linea.charAt('0');

                        }
                        else if (linea.charAt(i) != 'a' || linea.charAt(i) != 'e' || linea.charAt(i) != 'i' || linea.charAt(i) != 'o' 
                        || linea.charAt(i) != 'u'){

                            linea.charAt('X');

                        }
                        else if(linea.equals(" ")){

                            linea="#";
                        }

                        else if(linea.equals("\n")){

                            linea="\t";
                        }

                        else if(linea.equals("1") || linea.equals("2") || linea.equals("3") || linea.equals("4") || linea.equals("5")
                        || linea.equals("6") || linea.equals("7") || linea.equals("8") || linea.equals("9") || linea.equals("0")){

                            linea=".";
                        }

                    }
                    
                }

            }while(linea!=null);

            System.out.println(linea);


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
