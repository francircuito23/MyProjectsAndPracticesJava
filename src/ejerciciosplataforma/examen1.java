package ejerciciosplataforma;

import java.util.Scanner;

public class examen1 {
    public static void main(String[] args) {
        
        System.out.println("He pensado un numero entre 1 y 100. Trata de adivinarlo!!");
        Scanner entrada = new Scanner (System.in);
        int numIntentos=0;
        int numMaquina= (int) (Math.random()*10+1);

        do{
            System.out.println("Llevas "+numIntentos+" intentos");
            System.out.print("Tu jugada? ");
            int num =entrada.nextInt();

            while((num<1) || (num>100)){
                System.out.println("No introduzcas un número menor que 1 ni mayor que 100");
                System.out.print("Tu jugada? ");
                num=entrada.nextInt();
            }
                if (num<numMaquina){ 
                    System.out.println("Te has quedado corto");
                }
                else if(num>numMaquina){
                    System.out.println("Te has pasado");
                }
                else{
                    System.out.println("Has ganado");
                    System.out.println("Has usado "+numIntentos+" intentos");
                    break;
                }
                numIntentos++;

        }while(numIntentos!=8);
        System.out.println("Has gastado los 8 intentos");
        
    }
    
}
