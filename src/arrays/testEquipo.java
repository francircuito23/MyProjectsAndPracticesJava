package arrays;

import java.util.Scanner;

public class testEquipo {

    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       String nombre="";
       int total=0;
       int opcion=0; //Opcion del menu

       //Tamaño de jugadores
       Garcia_Ortiz_Francisco_E2 Malaga = new Garcia_Ortiz_Francisco_E2(nombre, total);
       
       System.out.print("Introduce el nombre del equipo: ");
        nombre = entrada.next();
       do{
          System.out.print("Número total de jugadores (mayor a 0): ");
          total = entrada.nextInt();
       }while(total<0);
       //Crea el equipo
       
       //Menu de opciones
       while (opcion != 4){
           System.out.println("\nGESTOR DEL EQUIPO: "+nombre); //AQUI DEBE ADJUNTARSE EL NOMBRE ACTUAL DEL EQUIPO
           System.out.println("----------------------------------");
           System.out.println("1- Cambiar nombre del equipo.");
           System.out.println("2- Añadir nuevo jugador al equipo.");
           System.out.println("3- Mostrar lista actual del equipo.");
           System.out.println("4- Salir.");
           
           System.out.print("\nOpcion? ");
           opcion = entrada.nextInt();
           
           switch (opcion){
            case 1:
                System.out.println("Nuevo nombre?");
                nombre = entrada.next();
                Malaga.setNombre(nombre);
                System.out.println("El nombre del equipo se ha cambiado");
                break;
            case 2:
                Malaga.aniadirJugador("Isco");
                Malaga.aniadirJugador("pepe");
                break;
            case 3:
                System.out.println(Malaga.mostrar());
                break;
            case 4: 
                System.out.println("Cerrando programa...");
                break;
            default:
                System.out.println("Opción Incorrecta!!");
               
           }
        }
       entrada.close();
       
    }
    
}
