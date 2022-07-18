
package test1;

public class Profesor {
    String nombre;
    int edad;
    private String dni;
    
    public Profesor(String n, int e, String d){
        this.nombre = n;
        this.edad = e;
        this.dni = d;
    }
    
    //Constructor de copia
    public Profesor(Profesor p){
        this.nombre = p.nombre;
        this.edad = p.edad;
        this.dni = p.dni;
    }
    
    public String toString(){
        String res="";
        res = "Profesor: "+this.nombre+" de "+this.edad+" años y con DNI: "+this.dni;
        return res;
    }
}
