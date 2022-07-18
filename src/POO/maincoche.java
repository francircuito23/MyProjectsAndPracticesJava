package POO;

public class maincoche {
    public static void main(String[] args) {

        coche RX7 = new coche("Amarillo", 2.1, 2.3, 4, 4);
        System.out.println("Coche 1:");
        System.out.println("Color: "+RX7.color);
        System.out.println("Anchura: "+RX7.anchura);
        System.out.println("Altura: "+RX7.altura);
        System.out.println("Puertas: "+RX7.puertas);
        System.out.println("Ruedas: "+RX7.ruedas);
        System.out.println("Gasolina: "+RX7.gasolina);

        RX7.Arrancar();
        RX7.Parar();
        RX7.Desplazarse();

        coche Nissan= new coche("Azul", 1.5,2.2,4,4);
        System.out.println("Coche 2:");
        System.out.println("Color: "+Nissan.color);
        System.out.println("Anchura: "+Nissan.anchura);
        System.out.println("Altura: "+Nissan.altura);
        System.out.println("Puertas: "+Nissan.puertas);
        System.out.println("Ruedas: "+Nissan.ruedas);
        System.out.println("Gasolina: "+Nissan.gasolina);

        Nissan.Arrancar();
        Nissan.Parar();
        Nissan.Desplazarse();

        coche Nismo= new coche("Rainbow", 3.0,3.2,4,4);
        System.out.println("Coche 3:");
        System.out.println("Color: "+Nismo.color);
        System.out.println("Anchura: "+Nismo.anchura);
        System.out.println("Altura: "+Nismo.altura);
        System.out.println("Puertas: "+Nismo.puertas);
        System.out.println("Ruedas: "+Nismo.ruedas);
        System.out.println("Gasolina: "+Nismo.gasolina);

        Nismo.Arrancar();
        Nismo.Parar();
        Nismo.Desplazarse();
        Nismo.echargasolina(10);
        Nismo.chequear();
        Nismo.darColor();
        Nismo.pintar("Rojo");
        System.out.println(Nismo);
    }
}
