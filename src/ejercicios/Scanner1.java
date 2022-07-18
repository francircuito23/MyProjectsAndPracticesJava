package ejercicios;

import java.util.Scanner;

public class Scanner1 {
    public static void main (String arg[]){
        Scanner entrada1 = new Scanner (System.in);
        System.out.print("Dime tu nombre ");
        String chorizo = entrada1.nextLine();                 //next.Line = pedir cadenas next.Int = pedir números enteros
        System.out.print("Hola " + chorizo);
        entrada1.close();

        //1) Pedir al usuario su nombre, año de nacimiento y su ciudad de nacimiento
            //Saco por pantalla el mensaje: Hola ____ Tienes ___  y vienes de ____

            Scanner entrada = new Scanner (System.in);
            System.out.print("Dime tu nombre ");
            String minombre = entrada.nextLine();
            
            System.out.print("¿En qué año naciste? ");
            int fecha = entrada.nextInt();
            
            System.out.print("En qué ciudad naciste? ");
            String miciudad = entrada.nextLine();
            System.out.print("Hola" + minombre + "Tienes" + (2020 - fecha) + "y vienes de" + miciudad);
            entrada.close();
    }
}                