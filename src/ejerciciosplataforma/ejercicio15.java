package ejerciciosplataforma;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        //15)
        //a)
        Scanner cifras = new Scanner(System.in);
        System.out.print("Dime un número de 4 cifras: ");
        int num = cifras.nextInt();
        int valor1 = num/1000;
        int valor2 = (num/100)%10;
        int valor3 = (num%100)/10;
        int valor4 = num%10;
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        System.out.println(valor4);
        System.out.println("número al reves: " +valor4+valor3+valor2+valor1);
        cifras.close();

    }    

}