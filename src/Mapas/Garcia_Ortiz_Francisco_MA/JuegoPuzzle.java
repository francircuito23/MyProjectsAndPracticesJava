package Mapas.Garcia_Ortiz_Francisco_MA;

import java.util.Scanner;

public class JuegoPuzzle {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int opcion=1;
        int n;

        do{

            System.out.print("Dime el tamaño del puzzle (Mayor o igual a 5): ");
            n=entrada.nextInt();

        }while(n<5);

        PuzzleLuces Puzzle = new PuzzleLuces(n);

        do{
            System.out.println(Puzzle);

            System.out.print("Qué botón quieres pulsar? (0 para salir): ");
            opcion=entrada.nextInt();

            Puzzle.tocarPulsador(opcion);

        }while(opcion!=0 && Puzzle.comprobarSolucion()==false);

        if(opcion==0){
            System.out.println("Adiós!");
        }

        if(Puzzle.comprobarSolucion()==true){
            System.out.println("Has ganado máquina");
        }
        
    }
}
