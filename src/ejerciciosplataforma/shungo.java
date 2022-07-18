package ejerciciosplataforma;
import java.util.Scanner;
public class shungo {
    public static void main(String[] args) {
    double opcion1 = 1;
    double opcion2 = 2;
    double opcion3 = 3;
    double opcion4 = 4;
   
    System.out.println("Tus opciones:");
    System.out.println(opcion1 + " -> suma");
    System.out.println(opcion2 + " -> resta");
    System.out.println(opcion3 + " -> multiplicacion");
    System.out.println(opcion4 + " -> salir");
    Scanner entrada = new Scanner(System.in);
    System.out.print("Elige opción: ");
    double dimeunnumero = entrada.nextDouble();
    String ultimaopcion = String.valueOf(opcion4);
    if ((dimeunnumero>=1) && (dimeunnumero<=4)){
        if (dimeunnumero == opcion1) {
        System.out.print("Dime un número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Dime otro número: ");
        double num2 = entrada.nextDouble();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (dimeunnumero == opcion2) {
        System.out.print("Dime un número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Dime otro número: ");
        double num2 = entrada.nextDouble();
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (dimeunnumero == opcion3) {
        System.out.print("Dime un número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Dime otro número: ");
        double num2 = entrada.nextDouble();
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
        } else {
        System.out.println(ultimaopcion = "Adiós");
    }    
    
    } else {
        System.out.println("Opción incorrecta");
    }
    entrada.close();
        
}}
