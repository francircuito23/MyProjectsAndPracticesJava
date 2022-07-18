package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej114 {
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

            if(numerador>100){

                throw new Exception("El numerador tiene que ser menor que 100");
            }

            if(denominador<-5){

                throw new Exception("El denominador tiene que ser mayor que -5");

            }

            System.out.println("El resultado es: "+resultado);
            
        } catch (ArithmeticException ae) {
            
            System.out.println("No puedes dividir por 0 subnormal");

        } catch (InputMismatchException ie) {

            System.out.println("No has introducido un numero");

        } catch (Exception e) {
            
            System.out.println(e.getMessage());

        }
    }
}
