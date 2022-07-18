package Matrices;

public class Tablero {

    private int filas;
    private int columnas;
    private int tablero[][];
    private int dimensionTotal;

    public Tablero(int filas, int columnas) {
        this.filas=filas;
        this.columnas=columnas;
        this.tablero = new int[filas][columnas];
        this.inicializarTablero();
    }

    public Tablero(int dimensionTotal) {
        this.dimensionTotal=dimensionTotal;
        this.tablero = new int[dimensionTotal][dimensionTotal];
        this.inicializarTablero();

    }
    public void inicializarTablero(){
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                tablero[i][j]=0;
            }
        }
    }

    public void rellenarPos(int posF, int posC) {
        this.tablero[posF][posC]=1;
    }

    public String toString() {
        String res="";
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                if(this.tablero[i][j]==0){//Para que cambie el 0 por el punto
                    res+=" . ";
                }
                else{//Para que cambie el 1 por *
                    res+=" * ";
                }
            }
            res+="\n";
        }
        return res;
    }
}
