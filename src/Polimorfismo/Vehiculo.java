package Polimorfismo;

public class Vehiculo {
    private String color;
    private int ruedas;

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public int getRuedas() {
        return ruedas;
    }    

    @Override
    public String toString() {
        return "Tengo "+this.ruedas+" ruedas y soy del color "+this.color;
    }
}
