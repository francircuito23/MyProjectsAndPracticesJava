package Matrices;

public class Estrella {
    private int x;
    private int y;
    private String forma;
    /*
    private String forma;
    private double masa;
    private double diametro;
    private double distancia;
    private String nombre;
    */

    public Estrella(int x, int y) {
        int alea;
        this.x = x;
        this.y = y;
        alea = (int)(Math.random()*9+1);
        
        if((alea>=1)&&(alea<=3)){
            this.forma="*";
        }
        else{
            this.forma=".";
        }
    }
    public String toString() {
        return this.forma;
    }
}

// Otra forma del método ponerEstrellas
/*
public void ponerEstrellas(int numEstrella) {
    int contador=0;
    do{
        for(int i=0;i<numEstrella;i++){
            int posicion1=(int)(Math.random()*this.filas);
            int posicion2=(int)(Math.random()*this.columnas);
            if(this.Cielito[posicion1][posicion2]==null){
                this.Cielito[posicion1][posicion2] = new Estrella(posicion1, posicion2);
            }
            else{
                i--;
            }
        }
    }while(contador<numEstrella);
}
*/