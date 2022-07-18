package otra;

import POO.impresora;

public class mainimpresora {
    public static void main(String[] args) {
        impresora Epson = new impresora();
        Epson.encender();
        Epson.contador=0;
        System.out.println(Epson.marca);
    }
    
}
