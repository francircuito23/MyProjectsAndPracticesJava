package ejercicios;

import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        int num = 2;
        int otro = 3;
        double res = Math.pow(num,otro);
        System.out.print("La potencia es " + res);

        //1) Pide un valor al usuario. Ese valor es el radio de una circunferencia. Calcula el Área y el Perímetro
        // A = pi x r al cuadrado P= 2 x pi x r
        //2) Pide el valor de 2 lados de un triángulo rectángulo y calcula de la hipotenusa
        // h = raiz cuadrade de (lado1)al cuadrado + (lado2)al cuadrado
        
        //1)
        Scanner entrada = new Scanner (System.in);
        System.out.print("Dime un valor para el radio ");
        int radio = entrada.nextInt();
        double resultado = Math.pow(radio,2);
        System.out.print("El área es: " + (Math.PI * resultado) + "y el perímetro es " + (2 * Math.PI * radio ));
        entrada.close();

        //2)
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
