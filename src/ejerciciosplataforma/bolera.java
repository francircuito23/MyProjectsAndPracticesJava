package ejerciciosplataforma;

import java.util.Scanner;

public class bolera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int precio =10;
        int opcion = 0;
        int edad=0;
        int contadortickets=0;
        int contadordinero=0;
        
        while((opcion>3) || (opcion<1)){
            System.out.println("BOLERA OTAKU");
            System.out.println("1. Vender Ticket");
            System.out.println("2. Resumen de ventas");
            System.out.println("3. Salir");
            System.out.print("Opcion? ");
            opcion = entrada.nextInt();

            do{
                if(opcion==1){
                    System.out.println("Generando Ticket...");
                    System.out.print("edad? ");
                    edad=entrada.nextInt();
                    System.out.println("TICKET DE ENTRADA");
                    System.out.println("Edad: "+edad );
                    contadortickets+= contadortickets;
                }
                if(edad<=5){
                    double operacion0 = precio-9;
                    System.out.println("Total a pagar:"+operacion0);
                }
                else if((edad>=6) || (edad<=14)){
                    double operacion1 = (25*precio)/100;
                    System.out.println("Total a pagar: "+operacion1);
                }
                else if((edad>14) || (edad<50)){
                    System.out.println("Total a pagar: "+precio);
                }
                else if((edad>=50) || (edad<70)){
                    int operacion2= (75*precio)/100;
                    System.out.println("Total a pagar: "+operacion2);
                }
                else if(edad>70){
                    double operacion3 = precio-9;
                    System.out.println("Total a pagar: "+operacion3);
                }
            }while(edad>0);
            
            if(opcion==2){
                System.out.println("RESUMEN DE VENTAS");
                System.out.println("");
            }
        }
    }
}
