package arrays;

public class Baraja {
    private Carta mazo[];
    private Carta descartes[];
    private String palos[]= {"pica","treboles","corazones","diamantes"};

    public Baraja(){
        this.mazo= new Carta[48];
        int contador=0;//indica por cual posicion del mazo voy

        for(int i=0;i<this.palos.length;i++){
            for(int j=1;j<=12;j++){
                this.mazo[contador]= new Carta(j, this.palos[i]);
                contador++;
            }
        }
    }
    public void mostrar(){
        for(int i=0;i<this.mazo.length;i++){
            System.out.print(this.mazo[i]);
            if(i==11||i==23||i==35||i==47){
                System.out.println();
            }
        }
    }
    public void barajar(){
        int pos1;
        int pos2;
        Carta tmp;
        for(int i=0;i<500;i++){
            pos1=(int)(Math.random()*47);
            pos2=(int)(Math.random()*47);
            //Intercambio elementos de un array
            tmp = this.mazo[pos1];
            this.mazo[pos1] = this.mazo[pos2];
            this.mazo[pos2] = tmp;
        }
    }
}
