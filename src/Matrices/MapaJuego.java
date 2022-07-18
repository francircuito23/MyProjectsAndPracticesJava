package Matrices;

public class MapaJuego {
    
    private char tablero[][];
    private int posPotra1, posPotra2;
    private int n;

    public MapaJuego(int n) {
        this.n = n;
        this.posPotra1=(int) (Math.random()*n);
        this.posPotra2=(int) (Math.random()*n);
        this.tablero = new char[n][n];
        this.inicializarTablero();
    }

    public void inicializarTablero(){
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                tablero[i][j]='\u2B1C';
            }
        }
        this.tablero[posPotra1][posPotra2]='\u271C';
    }

    public String toString() {
        String res="";
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){

                if(this.tablero[i][j]=='\u2B1C'){
                    res+='\u2B1C';
                }

                else{
                    res+='\u271C' + " ";
                }
            }
            res+="\n";
        }
        return res;
    }

    public void moverProta(int pos1, int pos2) {
        pos1 = pos1 - 1;
        pos2 = pos2 - 1;

        //Cambio la posición del potra por Hueco Vacío para que no se repita el protagonista al cambiarlo
        this.tablero[pos1][pos2] = '\u2B1C';


        for (int i = 1; i < n; i++) {

            if (pos1+i < n && pos2+i < n) {
                this.tablero[pos1+i][pos2+i] = '\u271C';
            }
    
            if (pos1-i >= 0 && pos2-i >= 0) {
                this.tablero[pos1-i][pos2-i] = '\u271C';
            }
    
            if (pos1+i < n && pos2-i >= 0) {
                this.tablero[pos1+i][pos2-i] = '\u271C';
            }
    
            if (pos1-i >= 0 && pos2+i < n) {
                this.tablero[pos1-i][pos2+i] = '\u271C';
            }
        }
    }
}
