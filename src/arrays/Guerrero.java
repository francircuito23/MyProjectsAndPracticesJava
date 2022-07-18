package arrays;

public class Guerrero {
    private String nombre;
    private double vidaMax;
    private double ataque;
    private double escudo;
    private double vidaAct;
    private boolean muerto;
    protected Arma arma;//Agregación
    
    public Guerrero(String nom, double lifeMax, double atack, double escu, Arma arma){
        this.nombre=nom;
        this.vidaMax=lifeMax;
        this.ataque=atack;
        this.escudo=escu;
        this.arma=arma;

        this.vidaAct=this.vidaMax;
    }
    public double atacar(Guerrero defensor){
        double danio=0;
        double danioTotal=0;
        double restaVida=0;
        if(!this.muerto){
            //Danño que hace el que ataca
            System.out.println(this.nombre+" ataca a "+defensor.getNombre());
            danio=this.ataque+this.arma.getPoder();
            //La vida que le quitamos al que defiende
            danioTotal=danio-defensor.getEscudo();
            //Actualizo la vida del que recibe la torta
            restaVida=defensor.getVidaAct()-danioTotal;
        }
        return this.ataque;
    }
    public String toString(){
        String res="";
        res+="Nombre: "+this.nombre+"\n";
        res+="Ataque: "+this.ataque+"\n";
        res+="Escudo: "+this.escudo+"\n";
        res+="Slud actual: "+this.vidaAct+"\n";
        res+="Está usando el arma: "+"\n";
        res+=this.arma.toString();

        return res;
    }
    public double getEscudo(){
        return this.escudo;
    }
    public void setVidaAct(int nuevaVida){
        this.vidaAct=nuevaVida;
    }
    public double getVidaAct(){
        return this.vidaAct;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void verificarMuerto(){
        if(this.vidaAct<=0){
            System.out.println(this.nombre+" ha morido");
            this.muerto=true;
        }
    }

}
