
package herencia;

public class Mamifero {
    protected int npatas;
    protected int vida;
    
    public Mamifero(int patas, int media){
        this.npatas = patas;
        this.vida = media;
    }
    
    public String comunicarse(){
        String cad="";
        return cad;
    }
    
    public void dormir(){
        System.out.println("Duermo 8 horas");
    }

    public String toString() {
        return "Mamifero:" + "npatas=" + this.npatas + ", vida=" + this.vida + '\n';
    }
    
    
}
