package herencia;

public class Oficial extends Operario {

    public Oficial(String nombre, int cod) {
        super(nombre, cod);
    }

    @Override
    public String toString() {
        return "Soy el oficial "+super.getNombre()+ " con el código "+super.getCod();
    }
    
}
