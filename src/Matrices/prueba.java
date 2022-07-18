package Matrices;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int mayor=0;
        int suma=0;
        int contador=0;
        int j=0;

        int[][] matriz = new int[3][3];

        for(int i=0;i<matriz.length;i++){
            for(j=0;j<matriz.length;j++){
                System.out.print("Matriz ["+i+"]["+j+"]:");
                matriz[i][j]=entrada.nextInt();
            }
        }

        for(int i=0;i<matriz.length;i++){
            j++;
            if(mayor<matriz[i][j]){
                mayor=matriz[i][j];
                suma += matriz[i][j];
                contador++;
            }
        }


        double media=(suma)/contador;
        System.out.println("El valor máximo es el: "+mayor+" y la media es: "+media);
    }
}
