
package test1;

public class Guerrero {
    private String nombre;
    private int saludMAX, ataque, escudo;
    private int saludACT;
    private boolean muerto;
    protected Arma arma;
    
    public Guerrero(String nom, int ata, int esc, Arma arma ){
        this.nombre = nom;
        this.ataque = ata;
        this.escudo = esc;
        this.arma = arma;
        
        this.saludMAX = (int)(Math.random()*100+1);
        this.saludACT = this.saludMAX;
        
        this.muerto = false;
    }
    
    public void atacar(Guerrero defensor){
        int danio=0;
        int danioTotal=0;
        int restaVida=0;
        if (!this.muerto){
            //Daño que hace el que ataca
            System.out.println(this.nombre+" ataca a "+defensor.getNombre());
            danio = this.ataque + this.arma.getPoder();
            System.out.println("Ataca con "+danio+" puntos!!!");
            //La vida que le quitamos al que DEFIENDE
            danioTotal = danio - defensor.getEscudo();
            if (danioTotal < 0){
                danioTotal = 0;
            }
            System.out.println(defensor.getNombre()+" recibe "+danioTotal+" puntos de daño");
            //Actualizo la vida del que recibe la hostia
            restaVida = defensor.getSaludAct() - danioTotal;
            System.out.println(defensor.getNombre()+" le quedan "+restaVida+" puntos de vida");
            //Actualizo la vida del defensor
            defensor.setSaludACT(restaVida);
            //miro si muere tras el ataque
            defensor.verificarMuerto();
       
        }else{
            System.out.println(this.nombre+" esta morido y no puede atacar");
        }
        
    }
    
    public int getEscudo(){
        return this.escudo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getSaludAct(){
        return this.saludACT;
    }
    
    public void setSaludACT(int nuevaVida){
        this.saludACT = nuevaVida;
    }
    
    public void verificarMuerto(){
        if (this.saludACT <= 0){
            System.out.println(this.nombre+" ha morido :(");
            this.muerto = true;
        }
    }
    
    
    public String toString(){
        String res="";
        res += "Este guerrero se llama: "+this.nombre+"\n";
        res += "Ataque: "+this.ataque+"\n";
        res += "Escudo: "+this.escudo+"\n";
        res += "Salud Actual: "+this.saludACT+"\n";
        res += "Esta usando la siguiente arma: \n";
        res += this.arma.toString();
        
        return res;
    }
    
}
