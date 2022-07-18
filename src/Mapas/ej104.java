package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ej104 {
    public static void main(String[] args) {
        
        Map<String, Double> clase = new HashMap<>();
        Iterator<String> it = clase.keySet().iterator();

        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        String alumno = "";

        do{
            System.out.println("Dime el nombre del alumno: ");
            alumno = entrada.next();

            System.out.println("Dime la nota media del alumno: ");
            nota=entrada.nextDouble();

            if(!alumno.equalsIgnoreCase("fin")){
                clase.put(alumno, nota);
            }

        }while(!alumno.equalsIgnoreCase("fin"));

        for (String key: clase.keySet()){  
			System.out.println("El alumno es "+ key +" y su nota media es "+ clase.get(key));
        }

        //a)
        double notaSubida = 0;
        for(String res: clase.keySet()){
            if(res.charAt(0)=='J'){
                notaSubida =clase.get(res)+1;
                clase.replace(res, notaSubida);
            }
        }

        // Borrar
        while(it.hasNext()){

            String nombreAlum = it.next();

            if(nombreAlum.charAt(0)=='A' || nombreAlum.charAt(0)=='D'){
                it.remove();
            }
        }

        // Suma de las notas de los alumnos
        int sum = 0;
        for(Double i : clase.values()){
            sum += i;
        }

        // Media
        double media=0;
        for(Double i : clase.values()){
            media++;
        }

        if(!clase.isEmpty()){

            System.out.println("Las notas son: ");

            for (String key: clase.keySet()){  
                System.out.print(clase.get(key)+" ");
            }

            System.out.println();

            System.out.println("La media de todas las notas es: "+sum/media);

        }

    }
}
