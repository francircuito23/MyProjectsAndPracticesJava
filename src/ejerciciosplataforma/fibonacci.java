package ejerciciosplataforma;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posuno=1;
        int posdos=1;
        int num=0;
        int suma=0;
        num = entrada.nextInt();
        System.out.println(suma+" ");

        for(int i=1; i<num; i++){
            System.out.print(suma+" ");
            suma = posuno + posdos;
            posuno=posdos;
            posdos=suma;
        }
    }
}
