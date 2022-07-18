package ArrayList;

public class Persona {
    
    private String dni;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private double peso;

    public Persona(String dni, String nombre, String apellido, String sexo, int edad, double peso){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.sexo=sexo;
        this.edad=edad;
        this.peso=peso;
    }

    public Persona(String dni){
        this.nombre="";
        this.apellido="";
        this.edad=0;
        this.peso=0;
    }

    public boolean equals(Persona persona) {
        if(this.nombre.equals(persona.getNombre()) && this.apellido.equals(persona.getApellido()) && this.dni.equals(persona.getDni()) && this.sexo.equals(persona.getSexo()) && this.edad==(persona.getEdad()) && this.peso==(persona.getPeso())){
            return true;
        }
        else{
            return false;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {

        String res="";

        res+="Persona: "+nombre+" "+apellido+"\n";
        res+="DNI: "+dni+"\n";
        res+="Sexo: "+sexo+"\n";
        res+="Edad: "+edad+"\n";
        res+="Peso: "+peso+"\n";

        return res;
    }
}
