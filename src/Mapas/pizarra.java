package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class pizarra {
    public static void main(String[] args) {
        
        Map<String, Double> clase = new HashMap<>();
        Iterator it = clase.keySet().iterator();

        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        String alumno = "";

        do{
            System.out.println("Dime el nombre del alumno: ");
            alumno = entrada.nextLine();

            System.out.println("Dime la nota media del alumno: ");
            nota=entrada.nextDouble();

            if(!alumno.equalsIgnoreCase("fin")){
                clase.put(alumno, nota);
            }

        }while(!alumno.equalsIgnoreCase("fin"));

        System.out.println(clase);

        //a)
        double notaSubida = 0;
        for(String res: clase.keySet()){
            if(res.charAt(0)=='J'){
                notaSubida =clase.get(res)+1;
                clase.replace(res, notaSubida);
            }
        }


        //suma de las notas de los alumnos
        int sum = 0;
        for(Double i : clase.values()){
            sum += i;
        }
        System.out.println("La suma de todos sus elementos es: "+sum);

        //b) Media
        double media=0;
        for(Double i : clase.values()){
            media++;
        }
        System.out.println("La media de sus elementos es: "+sum/media);

        //c)
        if(media>nota){
            clase.remove(alumno, nota);
        }

        //d)
        for (String key: clase.keySet()){  
			System.out.println("El alumno es "+ key +" y su nota media es "+ clase.get(key));
        }
    }
}
