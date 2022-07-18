package ejerciciosplataforma;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el tipo de magia: ");
        int num=entrada.nextInt();
        switch(num){
            case 0:
            System.out.println("Tu personaje no usará magia");
            break;
            case 1:
            System.out.println("Tu personaje usará magia blanca");
            break;
            case 2:
            System.out.println("Tu personaje usará magia verde");
            break;
            case 3:
            System.out.println("Tu personaje usará magia azul");
            break;
            case 4:
            System.out.println("Tu personaje usará magia roja");
            break;
            case 5:
            System.out.println("Tu personaje usará magia negra");
            break;
            default:
            System.out.println("No existe el tipo de magia que has escogido");
            entrada.close();
        }
        
    }
}
