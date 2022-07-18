package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class probar {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Programa para dividir");
        System.out.println();

        int numerador, denominador, resultado;
        boolean noNumero = true;

        do{
            try {

                System.out.print("Dime el numerador: ");
                numerador=entrada.nextInt();
    
                System.out.print("Dime el denominador: ");
                denominador=entrada.nextInt();
    
                resultado=numerador/denominador;
    
                System.out.println("El resultado es: "+resultado);

                noNumero = true;
                
            } catch (InputMismatchException e) {

                System.out.println("No has introducido un numero");
                entrada.next();
                noNumero=false;
            }

        }while(!noNumero);

    }
}
