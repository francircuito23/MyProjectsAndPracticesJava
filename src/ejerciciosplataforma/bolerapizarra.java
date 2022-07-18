package ejerciciosplataforma;

import java.util.Scanner;

public class bolerapizarra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion=0;
        int edad=0;
        double precioTicket=0;
        final double PRECIO=10;
        double recaudado=0;
        int numTickets=0;
        do{
            System.out.println("Bolera otaku");
            System.out.println("=============");
            System.out.println("1. Vender ticket");
            System.out.println("2. Resumen ventas");
            System.out.println("3. Salir");
            System.out.print("Opción? ");
            opcion = entrada.nextInt();
            if(opcion==1){
                System.out.println("Generando ticket...");
                do{
                    System.out.print("Edad? ");
                    edad = entrada.nextInt();
                }while(edad<0);
                if((edad<=5)||(edad>70)){
                    precioTicket=1;
                }
                else if((edad>=6)&&(edad<=14)||((edad>=51)&&(edad<=70))){
                    precioTicket=PRECIO-(PRECIO*0.25);
                }
                else if((edad>=15)&&(edad<=50)){
                    precioTicket=PRECIO;
                }
                numTickets++;
                recaudado=recaudado+precioTicket;
                System.out.println("===============");
                System.out.println("TICKET DE ENTRADA");
                System.out.println("Edad: "+edad);
                System.out.println("Total a pagar: "+precioTicket);
                System.out.println("===============");
            }
            else if (opcion==2){
                System.out.println("RESUMEN DE VENTAS");
                System.out.println("===============");
                System.out.println("Se han vendido "+numTickets+" tickets");
                System.out.println("Se ha recaudado "+recaudado+" €");
            }
            else if (opcion==3){
                System.out.println("Saliendo...");
                System.out.println("Ven a la bolera y no consumas drogas");
            }
            else{
                System.out.println("Error: Opción incorrecta");
            }
        }while (opcion!=3);
    }
}
