
package test1;

public class Arma {
    private String nombre;
    private int res, poder;
    
    public Arma(String n, int res, int power){
        this.nombre = n;
        this.res = res;
        this.poder = power;
    }
    
    public int getPoder(){
        return this.poder;
    }
    
    public String toString(){
        String res="";
        res += "Arma : "+this.nombre+"\n";
        res += "Poder: "+this.poder+"\n";
        res += "Resistencia: "+this.res+"\n";
        
        return res;
    }
}
