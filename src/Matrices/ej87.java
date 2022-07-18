package Matrices;

public class ej87 {
    public static void main(String[] args) {

        int[][] matriz = new int[10][10];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                //tablas de multiplicar del 1 al 10
                matriz[i][j]=(i*j)+(i+j+1);
                if(matriz[i][j]<10){
                    System.out.print("0");
                }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
