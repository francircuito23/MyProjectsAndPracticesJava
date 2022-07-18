package Matrices;

public class ej86 {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                //meter numeros de 1 a N
                matriz[i][j]=(i*matriz.length)+(j+1);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
