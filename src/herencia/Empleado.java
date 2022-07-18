package herencia;

public class Empleado {
    private String nombre;

    public Empleado(String nomb){
        this.nombre=nomb;
    }
    public String getNombre() {
        return this.nombre;
    }

    public String toString() {
        return "Soy el empleado: "+this.nombre;
    }
    
    
}
