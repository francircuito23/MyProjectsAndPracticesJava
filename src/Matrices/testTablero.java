package Matrices;

public class testTablero {
    public static void main(String[] args) {
        Tablero pito = new Tablero(5,5);

        pito.rellenarPos(0, 0);
        pito.rellenarPos(2, 0);
        pito.rellenarPos(0, 2);
        System.out.print(pito);
    }
}
