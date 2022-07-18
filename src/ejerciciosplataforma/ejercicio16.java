package ejerciciosplataforma;
import java.util.Scanner;

public class ejercicio16 {
   public static void main(String[] args) {

       Scanner notamedia = new Scanner (System.in);
       System.out.print("Dime la primera nota: ");
       double num1 = notamedia.nextDouble();
       System.out.print("Dime la segunda nota: ");
       double num2 = notamedia.nextDouble();
       System.out.print("Dime la tercera nota: ");
       double num3 = notamedia.nextDouble();
       System.out.println("La media es: " + (num1 + num2 + num3) / 3);
       if ((num1 + num2 + num3) / 3 > 6.5){
           System.out.println("Promocionado con una nota media de: " + (num1 + num2 + num3) / 3);

        
        } else if ((num1 + num2 + num3) / 3 < 6.5){
            
        System.out.print("No promociona");
        notamedia.close();



   }
}}