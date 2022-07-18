package Matrices;

import java.util.Scanner;

public class TestCine {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion=0;

        Cine pito = new Cine(5);

        System.out.println("--Menu Cine--");

        while (opcion != 5){
            System.out.println("----------------------------------");
            System.out.println("1- Vender entradas");
            System.out.println("2- Mostrar asientos");
            System.out.println("3- Resumen de ventas");
            System.out.println("4- Limpiar sala");
            System.out.println("5- Salir");

            
            System.out.print("\n¿Opción? ");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1:
                do{

                    System.out.println("\nCuántas entradas quieres comprar?");
                    int entradas=entrada.nextInt();
                    

                }while(opcion==1);

                break;
                case 2:
                System.out.println(pito.mostrarSala());
                break;

                case 3:
                System.out.println(pito.mostrarDatos());
                break;

                case 4:
                System.out.println("Limpiando sala...");
                System.out.println("Listo! Sala preparada para nueva se sesión");
                pito.vaciarSala();

                case 5:
                System.out.println("Adiós!");
                break;

                default:
                System.out.println("Opción incorrecta!");
                
            }
        }
    }
}
