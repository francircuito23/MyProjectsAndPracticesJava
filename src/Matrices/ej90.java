package Matrices;

import java.util.Scanner;

public class ej90 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int mayor=0;

        int[][] matriz = new int[3][3];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print("Matriz ["+i+"]["+j+"]:");
                matriz[i][j]=entrada.nextInt();
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(mayor<matriz[0][0]){
                    mayor=matriz[0][0];
                }
                else if(mayor<matriz[1][1]){
                    mayor=matriz[1][1];
                }
                else if(mayor<matriz[2][2]){
                    mayor=matriz[2][2];
                }
            }
        }

        double media=(matriz[0][0]+matriz[1][1]+matriz[2][2])/3;
        System.out.println("El valor máximo es el: "+mayor+" y la media es: "+media);
    }
}
