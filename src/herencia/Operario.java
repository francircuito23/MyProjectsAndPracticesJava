package herencia;

public class Operario extends Empleado {//operario hereda de empleado
    private int codTrabajador;
    
    public Operario(String nombre,int cod){
        super(nombre);
        this.codTrabajador=cod;
    }
    public int getCod() {
        return this.codTrabajador;
    }
    public void setCod(int nuevoCod){
        this.codTrabajador=nuevoCod;
    }
    @Override
    public String toString() {
        return "Soy el operario "+super.getNombre()+" con el código "+this.codTrabajador;
    }
}

