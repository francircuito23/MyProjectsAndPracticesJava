package ejerciciosplataforma;

import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) {

        Scanner futbol = new Scanner (System.in);
        System.out.print("Introduzca valor de segundos: ");
        double segundos = Integer.parseInt(futbol.nextLine());

        while(segundos > 5400){
        System.out.println("Te has pasado de segundos");
        System.out.println("Introduzca valor de segundos: ");
        segundos = Integer.parseInt(futbol.nextLine());
        }
        if(segundos < 0){
            System.out.print("Números negativos no");
        }
        else{
        int Calculaminutos = (int)((segundos/60) + 1);
        System.out.print("El minuto es el : " + Calculaminutos);
        futbol.close();
        }
    }
    
}
