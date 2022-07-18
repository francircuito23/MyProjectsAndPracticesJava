package ejercicios;

import java.util.Scanner;

public class ejerciciosif {
    public static void main (String arg[]){
        //1)Pido 2 numeros por teclado (op1 y op2)
        //a) hago su division op2/op1
        //Nota: Hay que comprobar que op2 es mayor o igual que op1. Si esto ocurre muestro un mensaje por pantalla y no hago nada más
        //b) Tengo que controlar si algún numero es 0
        //Si op es 0 y op2 no ---> saco el mensaje "No puedo dividir entre 0"
        //Si op y op2 son 0 ----> resultado es 0
        //Si op2 es 0 ---> hago la division normalmente

        Scanner numeros = new Scanner (System.in);
        System.out.print("Dime un numero: ");
        int num1 = numeros.nextInt();
        System.out.print("Dime otro numero ");
        int num2 = numeros.nextInt();
        if (num2 >= num1){
            System.out.print(num2/num1);
        }
        else{
            System.out.print("No se puede hacer porque el numero 2 es mayor o igual que 1");
            //b)
            
            if (num1 == 0){
                System.out.print("No se puede dividir entre 0");
            }
            if ((num1 == 0) && (num2 == 0)){
                System.out.print(num2 + " / " + num1 + " = 0 ");
            }
            if(num2 == 0){
                System.out.print(num2 + " / " + " = " + (num2/num1));   
                numeros.close(); 
            }
        }
    }
}