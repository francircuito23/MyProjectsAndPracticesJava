package Polimorfismo;

public class Coche extends Vehiculo {
    int velocidad;
    int cilindrada;

    public Coche(String color ,int ruedas ,int velocidad, int cilindrada){
        super(color, ruedas);
        this.velocidad=velocidad;
        this.cilindrada=cilindrada;
    }
    
    @Override
    public String toString() {
        return "Llego a "+this.velocidad+" km/h y tengo una cilindrada de "+this.cilindrada+"cc";
    }
}
