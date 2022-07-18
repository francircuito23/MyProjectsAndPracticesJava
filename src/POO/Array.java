package POO;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int i;
        String[] nombres = new String[3];

        Scanner entrada = new Scanner(System.in);

        for(i=0; i<nombres.length; i++)
        {
            System.out.print("Introduzca nombre: ");
            nombres[i] = entrada.nextLine();
        }

        for(i=0; i<nombres.length; i++)
        {
            System.out.println(nombres[i]);
        }

        int[] numeros = new int[5];
        int num1=23;
        int num2=24;
        numeros[0]=num2;
        numeros[1]=num1+num2;
        numeros[2]=((5*3+3)/6)-1;
        numeros[4]= numeros[2];

        String[] meses = {"Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        for(int j=0;j<meses.length;j++){
            System.out.println(meses[j]);
        }
        System.out.println(meses[8]);

    }
}
