package arrays;

public class mainGuerreo {
    public static void main(String[] args) {

        Arma Garrotazo = new Arma("Garrotazo", 900.0, 2000.0);
        Guerrero Soler = new Guerrero("Soler", 100.0, 999.9, 1000.0,Garrotazo);
        Guerrero Gwyn = new Guerrero("Gwyn", 101.0, 500.9, 1500.0,Garrotazo);
        System.out.println(Soler);
        System.out.println(Gwyn);
        System.out.println(Garrotazo);
    }
    
}
