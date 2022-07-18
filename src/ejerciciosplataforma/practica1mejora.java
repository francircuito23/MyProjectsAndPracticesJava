package ejerciciosplataforma;

import java.util.Scanner;

public class practica1mejora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Dime el valor de a: ");
        double a = entrada.nextDouble();
        System.out.print("Dime el valor de b: ");
        double b = entrada.nextDouble();
        System.out.print("Dime el valor de c: ");
        double c = entrada.nextDouble();

        double resultado = 0;

        double ecuacion1 = (-b+(Math.sqrt((Math.pow(b,2)-(4*a*c)))))/(2*a);
        double ecuacion2 = (-b-(Math.sqrt((Math.pow(b,2)-(4*a*c)))))/(2*a);
        
        double raiz = (Math.pow(b,2)-4*a*c);
        
    
        if(((a==0)&&(b==0)&&(c==0))){
            System.out.println("Hay infinitas soluciones");
        

        }
        else if ((a==0)&&(b==0)){
            System.out.println("Sin solución");

        }
        else if(a==0){
            resultado = -c/b;
            System.out.println("Solución: " + resultado);

        }
        else if (raiz<0) {
            System.out.println("Raíz negativa, no se puede hacer");
        
        }//Mejora
        else if(ecuacion1 == ecuacion2){
            
            System.out.println("Solución doble: " + ecuacion1);
        }

        else{

            System.out.println("Solución 1: " + ecuacion2);
            System.out.println("Solucion 2: " + ecuacion1);
            
            entrada.close();
        }

    }
}
