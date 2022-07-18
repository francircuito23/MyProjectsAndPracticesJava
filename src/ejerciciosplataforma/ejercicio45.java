package ejerciciosplataforma;

import java.util.Scanner;

public class ejercicio45 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random()*10+1);
        int num=-1;


        while(numeroAleatorio!=num){
            System.out.print("Dime un número: ");
            num = entrada.nextInt();

            if(num>numeroAleatorio){
                System.out.println("Te has pasado");    
            }
            else if (num<numeroAleatorio){
                System.out.println("Te has quedado corto");

            }else{
                System.out.println("Has ganado MÁQUINA");
                entrada.close();
            }
                
        }
        
    }
    
}
