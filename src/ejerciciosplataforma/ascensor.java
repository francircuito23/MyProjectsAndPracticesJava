package ejerciciosplataforma;

import java.util.Scanner;

public class ascensor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TOTALP = 10;
        int i;
        int plantaAcutal = 1;
        int siguientePlanta=1;

        while(siguientePlanta!=0){

            do{
                System.out.println("Hay "+TOTALP+" plantas");
                System.out.println("Estas en la planta "+plantaAcutal);
                System.out.println("A qué planta vas?");
                siguientePlanta = entrada.nextInt();
            }while((siguientePlanta<0)||(siguientePlanta>TOTALP));
            
            if (siguientePlanta==0){
                System.out.println("Apagando...");
                System.out.println("Ascensor apagado");
            }
            else if(siguientePlanta>plantaAcutal){
                System.out.println("Subiendo");
                for(i = plantaAcutal;i<=siguientePlanta;i++){
                    System.out.println("Voy por la planta "+i);
                }
                plantaAcutal=siguientePlanta;
            }
            else if(siguientePlanta<plantaAcutal){
                System.out.println("Bajando");
                for(i = plantaAcutal;i>=siguientePlanta;i--){
                    System.out.println("Voy por la planta "+i);
                }
                plantaAcutal=siguientePlanta;
            }
            else if(plantaAcutal==siguientePlanta){
                System.out.println("Ya estás en esa planta");
            }
        }
    }
}
