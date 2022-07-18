package ejerciciosplataforma;
import java.util.Scanner;

    public class ejercicio17 {
        public static void main(String[] args) {

        Scanner claves = new Scanner (System.in);
        System.out.print("Introduce la contraseña: ");
        String contraseña1 = claves.nextLine();
        System.out.print("Introduce la contraseña otra vez: ");
        String contraseña2 = claves.nextLine();
        if (contraseña1.equals(contraseña2)){
            System.out.print("Las claves son iguales");
        
        }else {
            System.out.print("Las claves no son iguales");

            claves.close();
    
}}}
