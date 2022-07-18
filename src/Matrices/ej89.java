package Matrices;

import java.util.Scanner;

public class ej89 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        int mayor=0;
        int menor=1000000;
        int filaMayor, filaMenor, colMayor, colMenor;
        filaMayor = filaMenor = colMayor = colMenor = 0;
        
        int[][] matriz = new int[3][3];

        System.out.println("Dime la matriz:");

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print("Matriz ["+i+"]["+j+"]:");
                matriz[i][j]=entrada.nextInt();
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(mayor<matriz[i][j]){
                    mayor=matriz[i][j];
                    //posiciones con filas y columnas
                    filaMayor=i;
                    colMayor=j;

                }
                else if(menor>matriz[i][j]){
                    menor=matriz[i][j];
                    filaMenor=i;
                    colMenor=j;
                }
            }
        }

        System.out.println("El valor máximo es el: "+mayor);
        //a)
        System.out.println("Primera aparición: "+"Fila: "+ filaMayor + " Columna: " + colMayor);
        System.out.println("Todas las apariciones: ");

        //b)
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j]==mayor){
                    filaMayor=i;
                    colMayor=j;
                    System.out.println("Fila: "+ filaMayor + " Columna: " + colMayor);
                }
            }
        }
    }
}