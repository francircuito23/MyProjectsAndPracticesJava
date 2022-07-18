package ejerciciosplataforma;

import java.util.Scanner;

public class ejercicio35 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        System.out.print("Dime el valor de n: ");
        int n = entrada.nextInt();
        System.out.print("Dime el valor de m: ");
        int m = entrada.nextInt();

        
        System.out.print("Los múltiplos de " + n + " entre " +n+  " y " + m*n + " son: ");

        for(int i = n; i<m*n; i++){
            if ((i%n==0)&&(i == (m*n))){

            }
            else if (i%n==0){
                System.out.print(i+",");
            
            }
            
        }
        System.out.print("");
    }
    
}
