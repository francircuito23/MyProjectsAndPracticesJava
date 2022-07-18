package ejerciciosplataforma;

import java.util.Scanner;

public class mayormenor {
    public static void main(String[] args) {
        int mayor=0;
        int menor=1000000;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Cuantos números vas a meter: ");
        int n = entrada.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Dame el número "+(i+1)+" : ");
            int n1 = entrada.nextInt();
            if(mayor < n1){
                mayor=n1;
            }
            if(menor>n1){
                menor=n1;
            }
        }
        System.out.println("Número mayor: "+mayor);
        System.out.println("Número menor: "+menor);
    }   
    
}
