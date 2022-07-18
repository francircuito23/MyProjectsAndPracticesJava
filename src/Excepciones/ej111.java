package Excepciones;

public class ej111 {
    public static void main(String[] args) {
    
        try {

            System.out.println("Programa automático");

        } catch (RuntimeException e) {
            System.out.println("Soy una excepcion");

            throw e;

        }
        finally{
            System.out.println("Programa terminado.");
        }
    }
}
