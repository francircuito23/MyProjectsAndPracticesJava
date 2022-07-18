package arrays;

import java.util.Scanner;

public class ej63 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int[] valores = {2,4,6,8,1,3,5,7,5};
        System.out.print("Dime el número: ");
        int num = entrada.nextInt();
        boolean elNumeroEsta = false;
        
        for(int i=0;i<valores.length;i++){
            if(num==valores[i]){
                System.out.println("El número está en el array y está en la posición "+(i+1));
                elNumeroEsta=true;
                i=valores.length;
            }
        }
            if(elNumeroEsta ==false){
                System.out.println("El número no está en el array");
            }
        
    }
}
