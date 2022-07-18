package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej112Mejorao {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numMaquina = (int) (Math.random()*5+1);
        int num = 0;
        int intentos = 0;
        boolean noNumero=true;
        
        do {
            System.out.println("Introduzca un numero entre 1 y 5");
            do {    
                try {

                    num = teclado.nextInt();
                    noNumero = true;

                } catch (InputMismatchException e) {

                    System.out.println("No has introducido un numero");
                    teclado.nextLine(); // Esto es para liberar el buffer (Evitar el bucle infinito)
                    
                    noNumero = false;
                    intentos++;

                }
            } while (!noNumero);

            if (num > numMaquina) {
                System.out.println("Te has quedado corto");
                intentos++;

            }
            if (num < numMaquina) {
                System.out.println("Te has pasado");
                intentos++;

            }

        } while (num != numMaquina);

        System.out.println("Has ganado máquina");
        intentos++;
        System.out.println("Has gastado "+intentos+" intentos");
    }
}
