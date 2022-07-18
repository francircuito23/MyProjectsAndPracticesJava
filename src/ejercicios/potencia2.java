package ejercicios;

import java.util.Scanner;

public class potencia2 {
    public static void main(String[] args) {
        
        Scanner entrada1 = new Scanner (System.in);
        System.out.print("Dime el valor para el lado 1 ");
        int lado = entrada1.nextInt();
        Scanner entrada2 = new Scanner (System.in);
        System.out.print("Dime el valor para el lado 2 ");
        int lado2 = entrada2.nextInt();
        double res1 = Math.pow(lado,2);
        double res2 = Math.pow(lado2,2);
        double sum = (res1 + res2);
        double raiz = Math.sqrt(sum);
        System.out.print("La hipotenusa del triángulo rectángulo es " + raiz);
        entrada1.close();
        entrada2.close();
    }    
}
