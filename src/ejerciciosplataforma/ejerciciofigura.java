package ejerciciosplataforma;

import java.util.Scanner;

public class ejerciciofigura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num = entrada.nextInt();
        int i;
        int k;
        
        for (i=1; i<=num; i++){
            for (k=1;k<=i;k++){
                System.out.print("* ");
            }
        System.out.println(" ");
        }
        
        
    }
    
}
