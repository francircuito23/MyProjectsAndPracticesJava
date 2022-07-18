package Mastermind2;

import java.util.Scanner;

public class MainMM {
    public static void main(String[] args) {
        
        Mastermind master = new Mastermind(5);
        
        Scanner entrada = new Scanner(System.in);

        int intentoContra[] = new int[5];
        
        int contador=0;

        System.out.println("Bienvenido a Mastermind\n");

        do{

            System.out.println("Dime la posible contraseña:");
            
            for(int i=0; i<intentoContra.length; i++){

                System.out.print("Dime el número "+i+": ");
                intentoContra[i] = entrada.nextInt();

            }

            System.out.println(master.Pistas(intentoContra));

            contador++;


        }while(!master.Adivinado(intentoContra));

        if(master.Adivinado(intentoContra)==true){

            System.out.println("Ganaste en "+contador+" intentos");
        }
    }
}
