package herencia;

public class Mamifero {
    protected int patas;
    protected int mediaVida;

    public Mamifero(int patas, int mediaVida) {
        this.patas = patas;
        this.mediaVida = mediaVida;
    }
    public String comunicar(){
        return "";
    }
    public String dormir(){
        return "Número de horas que suele dormir un mamífero: "+8;
    }
    public String toString() {
        return "Mamifero [mediaVida=" + mediaVida + ", patas=" + patas + "]";
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int nuevaPatas) {
        this.patas = nuevaPatas;
    }
    public int getMediaVida() {
        return mediaVida;
    }
    public void setMediaVida(int nuevaMediaVida) {
        this.mediaVida = nuevaMediaVida;
    }
}
