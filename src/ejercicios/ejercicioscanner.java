package ejercicios;

import java.util.Scanner;

public class ejercicioscanner {
    public static void main (String arg[]){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Dime tu nombre ");
        String minombre = entrada.nextLine();
        System.out.print("En qué ciudad naciste? ");
        String miciudad = entrada.nextLine();
        System.out.print("¿En qué año naciste? ");
        int fecha = entrada.nextInt();
        System.out.print("Hola " + minombre + " Tienes " + (2020 - fecha) + " años" + " y vienes de " + miciudad);
        entrada.close();

    }   

}