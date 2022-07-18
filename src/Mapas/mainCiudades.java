package Mapas;

import java.util.Scanner;

public class mainCiudades {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion=0;

        Ciudades pito = new Ciudades();

        System.out.println("--Menu Alumnos--");

        while (opcion != 7){
            System.out.println("----------------------------------");
            System.out.println("1- Añadir Alumno.");
            System.out.println("2- Borrar Alumno.");
            System.out.println("3- Mostrar Instituto.");
            System.out.println("4- Alumnos por ciudad.");
            System.out.println("5- Mostrar datos.");
            System.out.println("6- Borrar todo.");
            System.out.println("7- Salir.");
            
            System.out.print("\n¿Opción? ");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1:
                String nombre="";
                String ciudad="";
                int aniadirAlum=0;

                System.out.print("Dime cuántas ciudades y alumnos quieres añadir: ");
                aniadirAlum=entrada.nextInt();

                for(int i=0; i<aniadirAlum; i++){

                    System.out.print("Dime el nombre del alumno: ");
                    nombre = entrada.next();
    
                    System.out.print("Dime el nombre de la ciudad: ");
                    ciudad = entrada.next();
    
                    pito.aniadirAlumno(nombre, ciudad);
                }

                break;
                case 2:
                String nombreAlum="";

                System.out.print("Dime el nombre del alumno que quieres borras: ");
                nombreAlum=entrada.next();

                pito.borrar(nombreAlum);

                System.out.println("Alumno borrado, pal lobby");

                break;

                case 3:
                String ciudadPara="";

                System.out.print("Dime el nombre de la ciudad: ");
                ciudadPara=entrada.next();
                
                pito.mostrarCiudad(ciudadPara);

                break;

                case 4:

                System.out.println(pito.resumen());

                break;

                case 5:

                System.out.println("Hay "+pito.cantidadCiudades()+" ciudades distintas");
                System.out.println();
                System.out.println(pito.resumen());
                
                break;

                case 6:

                pito.borrarTodo();
                System.out.println("HAS MATADO A TODO EL MUNDO");
                
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
