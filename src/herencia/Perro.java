package herencia;

public class Perro extends Mamifero {
    private String raza;
    private String nombre;
    private boolean mezcla;

    public Perro(int patas, int mediaVida, String raza, String nombre, boolean mezcla) {
        super(patas, mediaVida);
        this.raza = raza;
        this.nombre = nombre;
        this.mezcla = mezcla;
    }
    @Override
    public String comunicar() {
        return "WOF";
    }
    @Override
    public String dormir() {
        return "Soy un perro y duermo 18 horas";
    }
    public String jugar(){
        return this.nombre+" está jugando";
    }
    public boolean getMezcla() {
        return mezcla;
    }
    public void setMezcla(boolean nuevaMezcla) {
        this.mezcla = nuevaMezcla;
    }
    public String puraRaza(){
        if(this.mezcla==true){
            return "Soy de pura raza";
        }
        else{
            return "No soy de pura raza";
        }
    }
    @Override
    public String toString() {
        String res="PERRO\n";
        res+="-----\n";
        res+="Nombre: "+this.nombre+"\n";
        res+="Raza: "+this.raza+"\n";
        res+=puraRaza()+"\n";
        res+="Patas: "+this.patas+"\n";
        res+="Mi media de vida es de "+this.mediaVida+" años\n";
        res+=dormir()+"\n";
        return res;
    }
}
