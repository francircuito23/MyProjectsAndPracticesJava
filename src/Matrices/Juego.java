package Matrices;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int Juego = 1;
        int N;
        boolean salir = true;
        
        while(salir == true){

            //MENÚ
            System.out.println("");
            System.out.println("Hueco Vacío: " + '\u2B1C');
            System.out.println("Protagonista: " + '\u271C');
            System.out.println("");
            System.out.println("Menú");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.println(" ");
            System.out.print("Introduce la opción que vayas a realizar: ");
            int opcion = entrada.nextInt();

            if(opcion == Juego){

                System.out.print("Introduce el tamaño del tablero: ");
                N = entrada.nextInt();

                if(N > 5){

                    MapaJuego Mapa = new MapaJuego(N);
                    System.out.print(Mapa.toString());
                    System.out.print("Introduce la direccion nueva1 para el protagonista: ");
                    int direccion = entrada.nextInt();
                    System.out.print("Introduce la direccion nueva2 para el protagonista: ");
                    int direccion2 = entrada.nextInt();
                    Mapa.moverProta(direccion, direccion2);
                    Mapa.toString();
                    if(direccion > N){
                        System.out.println("El protagonista se sale del tablero");
                    }

                }
                else{
                    while(N < 5){

                        System.out.print("Introduce el tamaño del tablero: ");
                        N = entrada.nextInt();

                    }
                } 
            }
            else{
                salir = false;
                System.out.println("SALIENDO ...");
            }
        }  
        entrada.close(); 
    }
}
