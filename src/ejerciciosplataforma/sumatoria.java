package ejerciciosplataforma;
import java.util.Scanner;
public class sumatoria {
    public static void main(String[] args) {
   
    Scanner ingreso = new Scanner(System.in);
    int numero, sumatoria = 0, i;
   
    System.out.print("Ingresa un numero: ");
    numero = ingreso.nextInt();
   
    for(i = 0; i <= numero; i++){
      sumatoria = sumatoria + i; 
    }

    System.out.println("La sumatoria de 1 a "+numero+ " es "+sumatoria);
    }
    
}
