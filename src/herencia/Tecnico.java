package herencia;

public class Tecnico extends Operario {

    public Tecnico(String nombre, int cod) {
        super(nombre, cod);
    }

    @Override
    public String toString() {
        return "Soy el técnico "+super.getNombre()+" con el código "+super.getCod();
    }
}
