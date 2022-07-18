package Polimorfismo;

public class Motocicleta extends Bicicleta {
    int velocidad;
    int cilindrada;

    public Motocicleta(String color, int ruedas, String tipo, int velocidad, int cilindrada){
        super(color, ruedas, tipo);
        this.cilindrada=cilindrada;
        this.velocidad=velocidad;
    }

    @Override
    public String toString() {
        return "Soy una motocicleta tengo "+this.getRuedas()+" ruedas y soy del color "+this.getColor()+" mi velocidad es de "+this.velocidad+" y mi cilindrada es de: "+this.cilindrada+"cc";
    }


    
}
