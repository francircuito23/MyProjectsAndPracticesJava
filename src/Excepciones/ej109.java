package Excepciones;

import java.util.Scanner;

public class ej109 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int pos=0;
        
        try {
            System.out.print("Dime la cadena: ");
            String cadena = entrada.nextLine();

            System.out.print("Dime la posición: ");
            pos = entrada.nextInt();

            System.out.println();
            System.out.println("El carácter es: "+cadena.charAt(pos));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("No existe la posición "+pos+" en la cadena");
        }
    }
}
