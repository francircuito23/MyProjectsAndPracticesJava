package Matrices;

public class mainMapaJuego {
    public static void main(String[] args) {
        
        MapaJuego pito = new MapaJuego(3);
        System.out.print(pito);
        pito.moverProta(2, 2);
        System.out.print(pito);
        
    }
}
