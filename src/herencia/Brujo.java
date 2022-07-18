package herencia;

public class Brujo {
    private String nombre;
    private int edad;
    private String lugarNacim;
    private Señal senal;

    public Brujo(String nombre, int edad, String lugarNacim, Señal senal) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugarNacim = lugarNacim;
        this.senal = senal;
    }
    public String toString(){
        String res="";
        res+="Brujo: "+this.nombre+"\n";
        res+="Edad: "+this.edad+"\n";
        res+="Lugar de nacimiento: "+this.lugarNacim+"\n";
        res+=this.senal.toString();

        return res;
    }
    private void nivelSenal(){
        this.senal.Subir();
    }
    public void subirNivel() {
        nivelSenal();
    }
}
