package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ej101 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Integer> numeritos = new ArrayList<Integer>();

        int opcion=0; //Opcion del menu

        while (opcion != 7){
            System.out.println("----------------------------------");
            System.out.println("1- Agregar");
            System.out.println("2- Buscar");
            System.out.println("3- Eliminar");
            System.out.println("4- Modificar");
            System.out.println("5- Insertar en posición");
            System.out.println("6- Mostrar");
            System.out.println("7- Salir");
            
            System.out.print("\nOpcion? ");
            opcion = entrada.nextInt();
            
            switch (opcion){
             case 1:
                 System.out.print("Dime el número: ");
                 numeritos.add(entrada.nextInt());
                 break;
             case 2:
                 System.out.print("Dime el número: ");
                 int num=entrada.nextInt();

                if(numeritos.contains(num)){
                    System.out.println("SÍ ESTÁ");
                }
                else{
                    System.out.println("NO ESTÁ");
                }

                 break;
             case 3:
                    System.out.print("Dime el número: ");
                    num=entrada.nextInt();

                    if(numeritos.contains(num)){
                        numeritos.indexOf(num);
                        System.out.println("Cajón eliminado");
                    }
                    else{
                        System.out.println("No ha podido ser eliminado señor, ya que el número que usted me ha dicho no está en el ArrayList. Lo siento bebé");

                    }
                 
                break;
             case 4: 

                    System.out.print("Dime el número: ");
                    num=entrada.nextInt();

                    if(numeritos.contains(num)){
                        System.out.print("Dime otro numerito: ");

                        int num2= entrada.nextInt();
                        numeritos.set(num, num2);
                    }
                    else{
                        System.out.println("NO ESTÁ");
                    }
                    
                    break;

             case 5:
                int pos=0;
                System.out.print("Dime el número: ");
                num=entrada.nextInt();

                do{
                    System.out.print("Dime la posición donde quieras meterlo: ");
                    pos=entrada.nextInt();
                }while(pos<=0);

                numeritos.add(pos, num);

                break;
             case 6:

                for (Integer i : numeritos) {
                    System.out.println(i);
                }

                break;
             case 7: 
                 System.out.println("Cerrando programa...");
                
                break;

             default:
                 System.out.println("Opción Incorrecta!!");
                
            }
        }
        entrada.close();
    }
}
