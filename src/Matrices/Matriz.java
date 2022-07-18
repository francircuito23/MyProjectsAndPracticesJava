package Matrices;

public class Matriz {
    
    private int n;
    private int[][] matriz;

    public Matriz(int n) {
        this.n = n;
        this.matriz = new int[n][n];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                this.matriz[i][j]=1;
            }
        }
    }

    public void dimension() {
        System.out.println("Filas: "+n);
        System.out.println("Columnas: "+n);
    }

    public String suma(int[][] matrizB) {
        String res="";

        if(this.matriz.length==matrizB.length && this.matriz[0].length==matrizB[0].length){

            System.out.println("Suma de las matrices: ");

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    res+=this.matriz[i][j] + matrizB[i][j]+" ";
                }
                res+="\n";
            }
        }
        else{
            res+="Las matrices no son simétricas";
        }
        return res;
    }

    public String resta(int[][] matrizB) {
        String res="";

        if(this.matriz.length==matrizB.length && this.matriz[0].length==matrizB[0].length){

            System.out.println("Resta de las matrices: ");

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    res+=this.matriz[i][j] - matrizB[i][j]+" ";
                }
                res+="\n";
            }
        }
        else{
            res+="Las matrices no son simétricas";
        }
        return res;
    }

    public String producto(int num) {
        String res="";

        System.out.println("Producto de la matriz: ");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res+=this.matriz[i][j] * num +" ";
            }
            res+="\n";
        }
        return res;
    }

    public int[][] traspuesta(int[][] matrizA) {

        int aux;

        for(int i=0;i<matrizA.length;i++){
            for(int j=0;j<matrizA[i].length;j++){ 
                if(i>j){
                    aux = matrizA[i][j];
                    matrizA[i][j] = matrizA[j][i];
                    matrizA[j][i] = aux;
                }
            }
        }
        return matrizA;
    }
}
