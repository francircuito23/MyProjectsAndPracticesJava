package ejerciciosplataforma;

import java.util.Scanner;

public class examen2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int contMaqui=0;
        int contJugador=0;
        int jugada=0;

        while(jugada!=0){

            do{
                System.out.println("Victorias Máquina: "+contMaqui);
                System.out.println("Victorias Jugador: "+contJugador);
                System.out.print("Introduce un numero entre 5 y 15 (0 para salir): ");
                jugada=entrada.nextInt();

                if(jugada==0){
                    System.out.println("Game over!!!!!!!!!!!!!!!");
                }

            }while((jugada<5) || (jugada>15));

            int numMaquina= (int) (Math.random()*20+1);
            System.out.println("La maquina ha sacado el numero "+numMaquina);

            if(jugada==0){
                System.out.println("Game over!");
            }

            else if(jugada>numMaquina){
                System.out.println("Tú ganas");
                contJugador++;
            }
            else if(jugada<numMaquina){
                System.out.println("Has perdido");
                contMaqui++;
            }
            else if(jugada==numMaquina){
                System.out.println("Empate.");
            }
        }
    }
}
