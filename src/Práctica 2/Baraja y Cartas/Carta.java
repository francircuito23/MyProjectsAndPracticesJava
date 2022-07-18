
package test1;


public class Carta {
    private int numero; 
    private String palo;
    
    public Carta(int n, String p){
        this.numero = n;
        this.palo = p.toLowerCase();
    }
    
    /*
    public Carta(){
        this.numero=1;
        this.palo="corazones";
    }
    */
    
    public String toString() {
        String res="";
        res +="["+this.numero+"-";
        switch (this.palo){
            case "picas":
                res +="\u2660";
                break;
            case "treboles":
                res +="\u2663";
                break;
            case "diamantes":
                res +="\u2666";
                break;
            case "corazones":
                res +="\u2665";
                break;
        }//switch
        res+="]";
        
        return res;
    }

    
    
    
    
}
