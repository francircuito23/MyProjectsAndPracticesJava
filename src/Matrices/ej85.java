package Matrices;

import java.util.Scanner;

public class ej85 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int n=0;

        while((n!=3) && (n!=5) && (n!=4)){
            System.out.println("Dime un número entre 3 y 5");
            n=entrada.nextInt();
        }
        
        int[][] matriz = new int[n][n];

        System.out.println("Dime la matriz:");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("Matriz ["+i+"]["+j+"]:");
                matriz[i][j]=entrada.nextInt();
            }
        }

        System.out.println("La matriz es:");
        for(int i=0;i<n;i++){//numero de filas
            for(int j=0;j<n;j++){//numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

    }
}
