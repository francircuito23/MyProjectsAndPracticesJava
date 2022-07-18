package PapelTijera;

import java.util.Scanner;

public class ej92 {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);

        int opcion=0;
        int j1=0;
        int j2=0;

        /*
                    Piedra  Papel Tijera
           Piedra      0      -1     1
           Papel       1       0    -1
           Tijera     -1       1     0
        */

        int[][] matriz=
        {
        {0,-1,1},
        {1,0,-1},
        {-1,1,0}
        };
        
        System.out.println("Bienvenido al juego del año");

        while (opcion != 2){
            System.out.println("----------------------------------");
            System.out.println("1- JUGAR");
            System.out.println("2- Apagar juego");

            
            System.out.print("\n¿Opción? ");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1:

                System.out.println("\nTURNO J1");
                System.out.println("Piedra -> 0");
                System.out.println("Papel -> 1");
                System.out.println("Tijeras -> 2");
                j1=entrada.nextInt();

                System.out.println("\nTURNO J2");
                System.out.println("Piedra -> 0");
                System.out.println("Papel -> 1");
                System.out.println("Tijeras -> 2");
                j2=entrada.nextInt();

                int jugada = matriz[j1][j2];

                    if(jugada==0){
                        System.out.println("\nEmpate");
                    }
                    else if(jugada==1){
                        System.out.println("\nJ1 gana");
                    }
                    else{
                        System.out.println("\nJ2 gana");
                    }
                    
                
                break;
                case 2:
                System.out.println("Adiós!");
                break;

                default:
                System.out.println("Opción incorrecta!");
                
            }
        }
    }
}
