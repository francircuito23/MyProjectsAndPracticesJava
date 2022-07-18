package Practica22aEvalu;

public abstract class Heroe {
    protected String nombre;
    protected int inteligencia;
    protected int fuerza;
    protected int destreza;
    protected int vidaMax;
    protected int vidaActual;
    protected boolean muerto;

    public Heroe(String name){
        this.nombre=name;
        this.muerto=false;
    }

    public void atacar(Heroe defensor) {
        if(defensor.esquivar()){
            System.out.println(defensor.nombre+" ha esquivado");
        }
        else{
            defensor.vidaActual -= this.fuerza/2;
            System.out.println(defensor.nombre+" se ha llevado una hostia guapa");
        }
    }
    
    public boolean esquivar() {
        int ale= (int)(Math.random()*40+1);
        if(ale<this.destreza){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString() {
        String res="";
        res+= "Nombre: "+this.nombre+"\n";
        res+= "Inteligencia: "+this.inteligencia+"\n";
        res+= "Fuerza: "+this.fuerza+"\n";
        res+= "Destreza: "+this.destreza+"\n";
        res+= "Vida: "+this.vidaActual+"\n";
        return res;
    }
}
