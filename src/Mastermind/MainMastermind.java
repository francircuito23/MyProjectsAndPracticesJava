package Mastermind;

import java.util.Scanner;

public class MainMastermind {
    public static void main(String[] args) {

        Mastermind master = new Mastermind();
        
        Scanner entrada = new Scanner(System.in);

        String intentoContra;
        
        int contador=0;

        System.out.println("Bienvenido a Mastermind\n");

        do{

            System.out.println("Dime la posible contraseña:");
            intentoContra = entrada.next();
            System.out.println(master.Pistas(intentoContra));

            contador++;

        }while(!master.Adivinado(intentoContra));

        if(master.Adivinado(intentoContra)==true){
            System.out.println("Ganaste en "+contador+" intentos");
        }
    }
}
