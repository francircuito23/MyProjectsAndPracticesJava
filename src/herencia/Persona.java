package herencia;

public class Persona {

    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void hablar() {
        System.out.println("buenos dias");
    }
    public void trabajo() {
        System.out.println("Hasta la polla");
    }
    @Override
    public String toString() {
        String res="";
        res+="Nombre: "+this.nombre+"\n";
        res+="Edad: "+this.edad+"\n";
        return res;
    }
}
