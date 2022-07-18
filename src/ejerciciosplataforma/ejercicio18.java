package ejerciciosplataforma;
import java.util.Scanner;

    public class ejercicio18 {
        public static void main(String[] args) {
            Scanner numeros = new Scanner (System.in);
            System.out.print("Dime el primer número: ");
            double num1 = numeros.nextDouble();
            System.out.print("Dime el segundo número: ");
            double num2 = numeros.nextDouble();
            if (num1 > num2){
                System.out.print("Resta: " + (num1 - num2) + " División: " + (num1/num2));

            }else if (num2 >= num1) {
                System.out.print("Suma: " + (num1 + num2) + " Producto: " + (num1%num2));
    
                numeros.close();


}}}
