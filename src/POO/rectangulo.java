package POO;

import java.util.Scanner;

public class rectangulo {
   private double base;
   private double altura;

   public rectangulo(){
       this.base=base;
       this.altura=altura;
   }
   public void Area(){
       Scanner entrada = new Scanner(System.in);
       System.out.print("Dime la base: ");
       base=entrada.nextInt();
   }
}
