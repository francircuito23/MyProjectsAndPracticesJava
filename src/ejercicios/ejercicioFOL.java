package ejercicios;

import java.util.Scanner;

public class ejercicioFOL {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma=0;
        for(int i=1; i<=6;i++){
            System.out.println("Dime la "+i+"a "+"BCCC:");
            suma=entrada.nextInt();
            suma++;
        }
        int br=(suma/180);
    }
}
