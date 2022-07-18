package arrays;

import java.util.Scanner;

public class ej64 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mayor=0;
        int menor=1000000;
        int valores[]= new int[10];
        int i=0;
        int contador=0;
        int posMayor=0;
        int posMenor=0;
        int posiciones[]= new int[contador];

        System.out.println("Introduce los valores del array");
        for(i=0;i<10;i++){
            System.out.println("Valor para posición: "+i);
            valores[i]=entrada.nextInt();
        }
        for(i=0;i<valores[i];i++){
            if(mayor<valores[i]){
                mayor=valores[i];
            }
            if(menor>valores[i]){
                menor=valores[i];
                posMenor=i;
            }//contador de veces
            if(mayor==valores[i]){
                contador++;
            }

        }

        System.out.println("El valor máximo es el: "+mayor+" y aparece "+contador+" veces en las posicion/es "+posiciones+",");
    }
}
