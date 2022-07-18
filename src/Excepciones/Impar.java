package Excepciones;

public class Impar {
    
    private int numero;

    public Impar(int numero) {
        this.numero = numero;

        try {
            if (numero % 2 != 0) {
                this.numero = numero;

            } else {
                throw new Exception("El número no es impar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String toString() {
        return "Impar [numero=" + numero + "]";
    }
}
