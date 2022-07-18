package arrays;

public class Carta {
    private int numero;
    private String palo;

    public Carta(int num, String pa){
        this.numero=num;
        this.palo=pa.toLowerCase();
    }

    public String toString() {
        String res="";
        res+="["+this.numero+"-";
        switch (this.palo) {
            case "picas":
                res+="\u2660";
            break;                
            case "treboles":
                res+="\u2663";
            break; 
            case "corazones":
                res+="\u2665";
            break; 
            case "diamantes":
                res+="\u2666";
            break;
        }
        res+="]";
        
        return res;
    }
}
