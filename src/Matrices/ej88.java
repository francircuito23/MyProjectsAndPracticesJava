package Matrices;

import java.util.Scanner;

public class ej88 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        int n=0;
        int m=0;
        int contadorMayorCero=0;
        int contadorMenorCero=0;
        int contadorIgualCero=0;
        System.out.print("Dime el valor para N: ");
        n=entrada.nextInt();
        System.out.print("Dime el valor para M: ");
        m=entrada.nextInt();

        int[][] matriz = new int[n][m];

        System.out.println("Dime la matriz:");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Matriz ["+i+"]["+j+"]:");
                matriz[i][j]=entrada.nextInt();
                if(matriz[i][j]>0){
                    contadorMayorCero++;
                }
                if(matriz[i][j]<0){
                    contadorMenorCero++;
                }
                if(matriz[i][j]==0){
                    contadorIgualCero++;
                }
            }
        }
        System.out.println("Mayores que 0: "+contadorMayorCero);
        System.out.println("Menores que 0: "+contadorMenorCero);
        System.out.println("Iguales que 0: "+contadorIgualCero);
    }
}
