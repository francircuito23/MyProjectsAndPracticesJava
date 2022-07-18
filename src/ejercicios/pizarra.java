package ejercicios;

import java.util.Scanner;

public class pizarra {
    public static void main (String arg[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Elige un número del 1 al 7: ");
        double num = entrada.nextDouble();
        if(num == 1){
            System.out.println("Lunes");
        }
        else if (num == 2){
            System.out.println("Martes");
        }
        else if(num == 3){
            System.out.println("Miércoles");
        }
        else if (num ==4){
            System.out.println("Jueves");
        }
        else if(num ==5){
            System.out.println("Viernes");
        }
        else if(num==6){
            System.out.println("Sábado");
        }
        else if(num==7){
            System.out.println("Domingo");
        }
        else{
            System.out.println("Número incorrecto");

            entrada.close();
        }
    }
}
