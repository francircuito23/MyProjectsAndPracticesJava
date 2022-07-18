package ejerciciosplataforma;

import java.util.Scanner;

public class ejercicio40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int m=0, n=0, fm=1, fn=1, fnm=1;
        do{
        
        System.out.println("El primer valor debe ser mayor o igual que el primero: ");
        System.out.print("Dime el valor de m: ");
        m = entrada.nextInt();
        System.out.print("Dime el valor de n: ");
        n = entrada.nextInt();
        while (m!=0){
            fm=fm*m;
            m--;
        }
        while (n!=0){
            fn=fn*n;
            n--;
        }
        int resta = m-n;
        while (resta!=0){
            fnm=fnm*resta;
            resta--;
        }
        System.out.println("Factorial n: "+fn);
        System.out.println("Factorial m: "+fm);
        System.out.println("Factorial nm: "+fnm);

        int combinatorio = fm/(fn*fnm);
        System.out.println("Solución combinatorio: "+combinatorio);
        
        

        }while(m>=n);
        entrada.close();
    }
    
}
