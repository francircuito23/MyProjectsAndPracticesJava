package Polimorfismo;

public class Camioneta extends Coche{
    int carga;

	public Camioneta(String color, int ruedas, int velocidad, int cilindrada, int carga) {
		super(color, ruedas, velocidad, cilindrada);
		this.carga = carga;
	}

	@Override
	public String toString() {
        return super.toString()+" ademas puedo cargar con: "+this.carga;
    }

    
    
}
