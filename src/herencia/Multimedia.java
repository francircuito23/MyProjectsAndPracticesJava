package herencia;

public class Multimedia {
    protected String titulo;
    protected double duracion;
    protected String formatos[]={"mp3", "wav", "aac", "mp4", "mkv", "mov", "flv"};
    protected String formato;

    public Multimedia(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.formato = formatos[0];
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public String[] getFormatos() {
        return formatos;
    }

    public String getFormato() {
        return formato;
    }
    public boolean igual(Multimedia igual){
        if((this.formato.equals(igual.getFormato()))&&this.duracion==(igual.getDuracion())){
            System.out.println("Los objetos son iguales");
            return true;
        }
        System.out.println("Los objetos no son iguales");
        return false;
    }
    
}
