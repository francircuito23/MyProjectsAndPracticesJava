package apuntes;

import java.util.Scanner;

public class condicionales {

    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        leer.close();
        if (num > 0){
            System.out.println("Este es positivo");
        }
        else{
        }
            System.out.println("No se ha cumplido");


    }
    
}
