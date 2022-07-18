package herencia;

public class mainSenal {
    public static void main(String[] args) {

        Señal Titan = new Señal("Titan", "viento");
        System.out.println(Titan);

        Brujo Loco= new Brujo("pimp flaco", 99, "el palo", Titan);
        System.out.println(Loco);

        Loco.subirNivel();

        Señal Eren = new Señal("Titan", "fuego");
        System.out.println(Eren);
    }
}
