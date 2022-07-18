package Ficheros;

import java.io.*;
import java.util.ArrayList;

public class ej {
    public static void main(String[] args) {

        String ruta = "trimestre 1/src/Ficheros/Textos/ej118.txt";
        BufferedReader lector = null;

        try{

            lector = new BufferedReader(new FileReader(ruta));
            String linea = "";
            String lineaL = "";
            ArrayList<String> array = new ArrayList<>();

            while(linea!=null){
                linea = lector.readLine();

                if(linea!=null){
                    if(linea.length()>=lineaL.length()){
                        lineaL = linea;
                    }
                }
            }

            lector = new BufferedReader(new FileReader(ruta));

            linea = "";
            while(linea!=null){
                linea = lector.readLine();

                if(linea!=null){
                    if(linea.length()==lineaL.length()){
                        array.add(linea);
                    }
                }
            }

            System.out.println("Las lineas más largas del fichero son: ");
            for(String i:array){
                System.out.println(i);
            }

        }catch (FileNotFoundException e){
            System.out.println("Error localizando fichero");
        }catch (IOException e){
            System.out.println("ERROR: "+e.getMessage());
        }finally {
            try {
                lector.close();
            }catch (IOException e){
                System.out.println("Error cerrando fichero");
            }
        }

    }
}
