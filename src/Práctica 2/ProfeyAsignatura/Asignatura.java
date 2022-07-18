
package test1;

public class Asignatura {
    String nombre;
    int horas;
    Profesor profe;
    
    public Asignatura(String n, int h, Profesor p){
        this.nombre = n;
        this.horas = h;
        //ATENCION
        //this.profe = p;
        this.profe = new Profesor(p);
    }
    
    public String toString(){
        String res="";
        res += "Asignatura: "+this.nombre+" con "+this.horas+" horas\n";
        res += this.profe.toString();
        
        return res;
    }
    
}
