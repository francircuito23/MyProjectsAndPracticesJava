package Mapas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainDepartamento {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion=0;

        Departamento pito = new Departamento();

        System.out.println("--Menu Departamento--");

        while (opcion != 7){
            System.out.println("----------------------------------");
            System.out.println("1- Añadir Empleado.");
            System.out.println("2- Mostrar Departamento.");
            System.out.println("3- Despedir Empleado.");
            System.out.println("4- Aumentar antigüedad al departamento.");
            System.out.println("5- Revisar salarios.");
            System.out.println("6- Despedir a todos los empleados.");
            System.out.println("7- Salir.");
            
            System.out.print("\n¿Opción? ");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1:
    
                pito.AniadirEmpleado(7445566, new Empleado("Fran", "Garcia", true));
                pito.AniadirEmpleado(2323232, new Empleado("CR7", "RONALDO", true));
                pito.AniadirEmpleado(5555555, new Empleado("Putita", "Lopez", false));

                System.out.println("Empleados añadidos :)");

                break;
                case 2:

                System.out.println(pito);

                break;

                case 3:

                boolean noNum=true;
                Integer dni;

                do{
                    try {
    
                        System.out.print("Dime el DNI del empleado/a: ");
                        dni=entrada.nextInt();
                        noNum=true;
                        
                        pito.BorrarEmpleado(dni);
        
                    } catch (InputMismatchException e) {
    
                        System.out.println("Tienes que introducir un DNI");
                        entrada.next();
                        noNum=false;
    
                    }

                }while(!noNum);

                break;

                case 4:

                int n;

                System.out.print("Dime los años que quieres aumentar a la empresa: ");
                n=entrada.nextInt();

                pito.NuevoAnio(n);

                break;

                case 5:

                System.out.println("Revisando salarios..."+"\n");

                pito.RevisarSueldos();

                System.out.println("Salarios revisados con éxito.");
                
                break;

                case 6:

                pito.PalLobby();

                System.out.println("TODOS PAL LOBBY");
                
                break;

                case 7:

                System.out.println("Aips!");

                break;

                default:

                System.out.println("Opción incorrecta!");
        
            }
        }
    }
}
