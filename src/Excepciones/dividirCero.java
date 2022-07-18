package Excepciones;

import java.util.Scanner;

public class dividirCero {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Programa para dividir");
        System.out.println();

        try {
            int numerador, denominador, resultado;
            System.out.print("Dime el numerador: ");
            numerador=entrada.nextInt();

            System.out.print("Dime el denominador: ");
            denominador=entrada.nextInt();

            resultado=numerador/denominador;

            System.out.println("El resultado es: "+resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("No puedes dividir por 0 subnormal");
        }
    }
}
