package arrays;

public class Arma {
    private String nombre;
    private double resistencia;
    private double poder;

    public Arma(String nom, double resis, double damage){
        this.nombre=nom;
        this.resistencia=resis;
        this.poder=damage;
    }
    public String toString(){
        String res="";
        res+="Nombre: "+this.nombre+"\n";
        res+="Resistencia: "+this.resistencia+"\n";
        res+="Daño: "+this.poder+"\n";
        return res;
    }
    public double getPoder(){
        return this.poder;
    }
}
