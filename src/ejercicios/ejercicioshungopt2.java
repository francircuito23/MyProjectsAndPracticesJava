package ejercicios;

import java.util.Scanner;

public class ejercicioshungopt2 {
    public static void main (String arg[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime un opción: ");
        int op = entrada.nextInt();
        while((op<1)||(op>4)){
            System.out.println("Opcion incorrecta");
            System.out.println("Vuelve a introducir una opción:");
            op = entrada.nextInt();
        }
        String ultimaopcion = String.valueOf(4);
        if ((op>=1) && (op<=4)){
            if (op == 1) {
            System.out.print("Dime un número: ");
            double num1 = entrada.nextDouble();
            System.out.print("Dime otro número: ");
            double num2 = entrada.nextDouble();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (op == 2) {
            System.out.print("Dime un número: ");
            double num1 = entrada.nextDouble();
            System.out.print("Dime otro número: ");
            double num2 = entrada.nextDouble();
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (op == 3) {
            System.out.print("Dime un número: ");
            double num1 = entrada.nextDouble();
            System.out.print("Dime otro número: ");
            double num2 = entrada.nextDouble();
            System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
            } else {
            System.out.println(ultimaopcion = "Adiós");
            
        }
        entrada.close();
    }
}}

    

