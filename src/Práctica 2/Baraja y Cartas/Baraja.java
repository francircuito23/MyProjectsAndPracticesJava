
package test1;
public class Baraja {
    
    private Carta mazo[];
    
    private String palos[] = {"picas","treboles","corazones","diamantes"};
    
    public Baraja(){
        this.mazo = new Carta[48];
        int contador = 0;
        
        for (int p = 0; p < this.palos.length; p++) {   
            for (int i = 1; i <= 12; i++) {
                this.mazo[contador] = new Carta(i, this.palos[p]);
                contador++;
            }
        }
    }
    public void mostrar(){
        for (int i = 0; i < this.mazo.length; i++) {
            System.out.print(this.mazo[i].toString());
            if (i==11||i==23||i==35||i==47){
                System.out.println();
            }
        }
        System.out.println();
    }
    
    
    public void barajar(){
        int pos1, pos2;
        Carta tmp;
        for (int i = 0; i < 500; i++) {
            pos1 = (int)(Math.random()*47);
            pos2 = (int)(Math.random()*47);
            tmp = this.mazo[pos1];
            this.mazo[pos1] = this.mazo[pos2];
            this.mazo[pos2] = tmp;
            
        }
    }
    
}
