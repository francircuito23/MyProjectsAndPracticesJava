package herencia;

public class Directivo extends Empleado {

    public Directivo(String nomb) {
        super(nomb);

    }
    @Override
    public String toString() {
        return "Soy "+super.getNombre()+" directivo de la empresa";
    }
}
