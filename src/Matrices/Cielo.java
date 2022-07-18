package Matrices;

public class Cielo {
    
    protected Estrella Cielito[][];
    protected int filas,columnas;

    public Cielo(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.Cielito = new Estrella[this.filas][this.columnas];

        for(int i=0;i<this.filas;i++){
            for(int j=0;j<this.columnas;j++){
                this.Cielito[i][j]=null;
            }
        }
    }
    public void ponerEstrellas(int numEstrella) {
        int pos1,pos2;
        for(int i=0;i<numEstrella;i++){
            do{
                pos1=(int)(Math.random()*this.filas);
                pos2=(int)(Math.random()*this.columnas);

            }while(this.Cielito[pos1][pos2]!=null);

            this.Cielito[pos1][pos2] = new Estrella(pos1, pos2);
        }
    }
    public String mostrar() {
        String res="";
        for(int i=0;i<this.filas;i++){
            for(int j=0;j<this.columnas;j++){
                if(this.Cielito[i][j]!=null){
                    res+=this.Cielito[i][j];
                }
                else{
                    res+=" ";
                }
            }
            res+="\n";
        }
        return res;
    }
}
