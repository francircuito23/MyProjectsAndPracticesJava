package Mapas;

public class Empleado {
    
    private String nombre;
    private String apellido;
    private boolean sexo; //true -> hombre, false -> mujer
    private int sueldo;
    private int anosAntiguedad;

    public Empleado(String nombre, String apellido, boolean sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.sueldo = 800;
        this.anosAntiguedad = (int) (Math.random()*11);
    }

    public String toString() {

        String res="";

        res+="Empleado/a: "+nombre+" "+apellido+"\n";
        res+="Sexo: "+sexo+"\n";
        res+="Sueldo: "+sueldo+"\n";
        res+="Años de antigüedad: "+anosAntiguedad+"\n";

        return res;
    }

    public boolean equals(Empleado empleado) {
        
        if(this.nombre.equals(empleado.getNombre()) && this.apellido.equals(empleado.getApellido()) && this.sexo==(empleado.isSexo()) && this.sueldo==(empleado.getSueldo()) && this.anosAntiguedad==(empleado.getAnosAntiguedad())){

            return true;
        }
        else{

            return false;
        }
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

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAnosAntiguedad() {
        return anosAntiguedad;
    }

    public void setAnosAntiguedad(int añosAntiguedad) {
        this.anosAntiguedad = añosAntiguedad;
    }

    
}
