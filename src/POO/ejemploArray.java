package POO;

import java.util.Arrays;
import java.util.Scanner;

public class ejemploArray {
   public static void main(String args[]) {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Enter the length of the array:");
      int length = entrada.nextInt();
      String [] myArray = new String[length];
      System.out.println("Enter the elements of the array:");

      for(int i=0; i<length; i++){
         myArray[i] = entrada.nextLine();
      }

      System.out.println(Arrays.toString(myArray));
   }
}
