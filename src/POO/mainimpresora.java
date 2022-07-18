package POO;

public class mainimpresora {
    public static void main(String[] args) {
        impresora Epson = new impresora();
        Epson.encender();
        Epson.imprimir(50);
        System.out.println(Epson);
        Epson.imprimir(2);
        System.out.println(Epson);
        Epson.apagar();
    }
}
