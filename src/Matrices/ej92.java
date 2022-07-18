package Matrices;

import java.util.Scanner;

public class ej92 {
    public static void main(String[] args) {
        //Francisco García Ortiz
        Scanner entrada= new Scanner(System.in);

        int opcion=0;
        int j1=0;
        int j2=0;
        int contadorJ1=0;
        int contadorJ2=0;
        int contadorEmpate=0;

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

        //Menú de opción de jugar o salir
        while (opcion != 2){
            System.out.println("----------------------------------");
            System.out.println("1- JUGAR");
            System.out.println("2- Apagar juego");

            
            System.out.print("\n¿Opción? ");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1:
                do{

                    System.out.println("\nTURNO J1 (Introduce un nº correcto)");
                    System.out.println("Piedra -> 0");
                    System.out.println("Papel -> 1");
                    System.out.println("Tijeras -> 2");
                    System.out.print("Elijo el número: ");
                    j1=entrada.nextInt();

                    System.out.println("\nTURNO J2 (Introduce un nº correcto)");
                    System.out.println("Piedra -> 0");
                    System.out.println("Papel -> 1");
                    System.out.println("Tijeras -> 2");
                    System.out.print("Elijo el número: ");
                    j2=entrada.nextInt();

                }while((j1!=0 && j1!=1 && j1!=2) || (j2!=0 && j2!=1 && j2!=2));//Controlar que el número es correcto

                int jugada = matriz[j1][j2];//elementos pedido por teclado para saber quien gana o se empata

                    if(jugada==0){
                        System.out.println("\nEmpate");
                        contadorEmpate++;
                    }
                    else if(jugada==1){
                        System.out.println("\nJ1 gana");
                        contadorJ1++;
                    }
                    else{
                        System.out.println("\nJ2 gana");
                        contadorJ2++;
                    }
                
                break;
                case 2:
                System.out.println("Adiós!");
                break;

                default:
                System.out.println("Opción incorrecta!");
                
            }
        }
        //contadores
        System.out.println("\nVictorias J1: "+contadorJ1);
        System.out.println("Victorias J2: "+contadorJ2);
        System.out.println("Empates: "+contadorEmpate);
        entrada.close();
    }
}
