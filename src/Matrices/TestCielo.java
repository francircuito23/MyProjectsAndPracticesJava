package Matrices;

public class TestCielo {
    public static void main(String[] args) {
        
        Cielo pito = new Cielo(18, 60);
        pito.ponerEstrellas(150);
        System.out.print(pito.mostrar());
    }
}
