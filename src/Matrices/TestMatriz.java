package Matrices;

public class TestMatriz {
    public static void main(String[] args) {
        
        Matriz pito = new Matriz(3);

        int [][] matrizB = new int[][] { {1,1,1}, {1,1,1}, {1,1,1} };
        int [][] matrizA = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };

        System.out.println(pito.suma(matrizB));
        
        System.out.println(pito.resta(matrizB));

        System.out.println(pito.producto(5));

        System.out.println(pito.traspuesta(matrizA));
    }
}
