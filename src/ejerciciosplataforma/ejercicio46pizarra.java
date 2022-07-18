package ejerciciosplataforma;

import java.util.Scanner;

public class ejercicio46pizarra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Jugador --> 1");
        System.out.println("Máquina --> 2");
        int bolas=0;
        int turno;
        int bolasusuario;
        int bolasmaquina;
        
        while (bolas <=0){
            System.out.print("Mete un número de bolas en la urna: ");
            bolas = entrada.nextInt();
        }

        turno = (int) (Math.random()*2+1);
        System.out.println("Empieza a jugar el número: " + turno);

        

            if (turno==1){
                do{
                
                    System.out.println("Dime cuántas bolas quieres sacar: 3, 2 ó 1");
                    bolasusuario = entrada.nextInt();
                    bolas = bolas - bolasusuario;

                    bolasmaquina = (int) (Math.random()*3+1);
                    System.out.println("La máquina ha retirado " +bolasmaquina+ " bola/s");
                    bolas = bolas - bolasmaquina;

                }while((bolasusuario>3)||(bolasusuario<1) || ((bolas!=0)));
                
            }

            if (turno==2){
                
                do{
                    bolasmaquina = (int) (Math.random()*3+1);
                    System.out.println("La máquina ha retirado " +bolasmaquina+ " bola/s");
                    bolas = bolas - bolasmaquina;
                    

                    System.out.println("Dime cuántas bolas quieres sacar: 3, 2 ó 1");
                    bolasusuario = entrada.nextInt();
                    bolas = bolas - bolasusuario;
    
                }while((bolasusuario>3)||(bolasusuario<1) || ((bolas!=0)));
            }

        
  
    }
    
}
