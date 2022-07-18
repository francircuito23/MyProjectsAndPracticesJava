package herencia;

public class Profesor extends Persona {//profesor hereda de persona
    protected String dni;
    protected int numprofe;

    public Profesor(String dni, int numprofe, String nombre, int edad){
        super(nombre,edad);
        this.dni=dni;
        this.numprofe=numprofe;
        this.nombre=nombre;
        this.edad=edad;
        //cada vez que se cree una hija tiene que crearse un padre(constructor)
    }
    public void darClase(){
        System.out.println("Estoy dando clase");
        this.trabajo();
        super.hablar();
    }
    public void trabajo() {
        System.out.println("Pito");
        
    }
    public String toString() {
        String res=super.toString()+"\n";
        res+="Número: "+this.numprofe+"\n";
        res+="DNI: "+this.dni+"\n";
        return res;
    }    
}
