package ejerciciosplataforma;

import java.util.Scanner;

public class Garcia_Ortiz_Francisco_E2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hay 10 plantas en total");
        int planta =1;
        System.out.println("Ascensor parado en planta "+planta);
        System.out.print("A qué piso vas? ");
        int piso = entrada.nextInt();
        int i;


        if(piso==0){
            System.out.println("Apagando ascensor...");
            System.out.println("Ascensor apagado");
        }
            
            if(piso>planta){
                for(i=piso; i>=planta; i--){
                    System.out.println("Bajando");
                    System.out.println("Planta "+i+"...");
                }
            }
            else if(piso<planta){
                for(i=piso; i<=planta; i++){
                    System.out.println("Subiendo");
                    System.out.println("Planta "+i+"...");
                }
            }
            else if(piso==planta){
                System.out.println("Ya estás en esa planta");
            }

    }
}
