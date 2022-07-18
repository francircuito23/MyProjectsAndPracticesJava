package ejerciciosplataforma;

import java.util.Random;
import java.util.Scanner;

public class ejercicio46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Dime un numerito de bolas: ");
        int bolas = entrada.nextInt();
        
        
        Random elegir = new Random();
        
        String[] opciones = new String[2];
        
        opciones[0] = "Yo";
        opciones[1] = "Máquina";
        
        System.out.print("Empieza a jugar: "); 
        String eleccion = entrada.nextLine();
        
        int numeroAleatorio = elegir.nextInt(2);
        
            String opcion = opciones[numeroAleatorio];
            System.out.println(opcion);

            do {
                if (opcion == opciones[0]){
                    System.out.println("¿Cúantas bolas quieres retirar? 3, 2 ó 1?");
                    
                    
                }
                int bolasretirar = entrada.nextInt();
                if(bolasretirar >= 4){
                System.out.println("no quites más de 3 bolas máquina");
                }
                
                if (opcion == opciones[1]){
                    System.out.println("¿Cúantas bolas quieres retirar? 3, 2 ó 1?");
                    
                    
                }
                bolasretirar = entrada.nextInt();
                if(bolasretirar >= 4){
                System.out.println("no quites más de 3 bolas máquina");
                }


            } while (bolas==0);
            
            
        }   

        
    }
    

