package herencia;

public class Gato extends Mamifero {

    private String raza;
    private String nombre;
    private String pelajes[]={"corto","largo","semilargo"};
    private String pelaje;

    public Gato(int patas, int mediaVida, String raza, String nombre) {
        super(patas, mediaVida);
        this.raza = raza;
        this.nombre = nombre;
        this.pelaje = pelajes[0];

    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String nuevoPelaje) {
        if(this.pelajeCorrecto(nuevoPelaje)){
            this.pelaje = nuevoPelaje;
        }
        else{
            this.pelaje=this.pelajes[0];
        }
    }
    private boolean pelajeCorrecto(String pelaje){
        pelaje=pelaje.toLowerCase();

        for(int i=0; i<this.pelajes.length;i++){
            if(pelaje.equals(this.pelajes[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public String comunicar() {
        return "miau";
    }

    @Override
    public String dormir() {
        return "Soy un gato y duermo 15 horas";
    }

    public String cazar() {
        return "Mi gato de " + super.getPatas() + " está cazando";
    }

    @Override
    public String toString() {
        return "Soy un gatito de "+super.getPatas()+" patas con una media de vida de "+super.getMediaVida()+" años mi nombre es "+this.nombre+" mi raza es "+this.raza+" y mi pelaje es "+getPelaje();
    }
}
