package Matrices;

import java.util.Scanner;

public class mainJuego {
    public static void main(String[] args) {
         
       Scanner entrada = new Scanner(System.in);
       int tam=0;
       int opcion=0; //Opcion del menu

       MapaJuego pito = new MapaJuego(tam);

       do{
            System.out.print("Número total de jugadores (mayor a 0): ");
            tam = entrada.nextInt();

        }while(tam<5);
        
        pito.inicializarTablero();

        while (opcion != 4){
            System.out.println("----------------------------------");
            System.out.println("1- Mostrar tablero.");
            System.out.println("2- Posibles direcciones.");
            System.out.println("3- Mover protagonista.");
            System.out.println("4- Salir.");
            
            System.out.print("\nOpcion? ");
            opcion = entrada.nextInt();
            
            switch (opcion){
             case 1:
                 
                 break;
             case 2:
                 
                 break;
             case 3:
                 
                 break;
             case 4: 
                 System.out.println("Cerrando programa...");
                 break;
             default:
                 System.out.println("Opción Incorrecta!!");
                
            }
         }

    }
}
