package ejerciciosplataforma;

import java.util.Scanner;

public class Garcia_Ortiz_Francisco_E1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double coche=0;
        int añosvida=0;
        double sumatorio=0;
        int i;
        double j;
        int year=1;

        while ((coche <=0) || (añosvida<=0)){
            System.out.print("Introduce el precio del coche, tiene que ser positivo: ");
            coche = entrada.nextDouble();
            System.out.print("Introduce los años de vida del coche: ");
            añosvida= entrada.nextInt();
        }
        for(i=1; i<=añosvida; i++){
        sumatorio +=i;
        }
        for(j=añosvida; j>=1; j--){
        double operacion = coche*(j/sumatorio);
        System.out.println("En el año " +year+ " el coche se ha reducido "+operacion+" euros");
        year++;
        }
    }
}

    


