package ejerciciosplataforma;

import java.util.Scanner;

public class ejerciciosplataforma2 {

    public static void main(String[] args) {

        //13)
        Scanner habitacion = new Scanner (System.in);
        System.out.print("Ancho: ");
        double ancho = habitacion.nextDouble();
        System.out.print("Largo: ");
        double largo = habitacion.nextDouble();
        System.out.print("Lado de cada baldosa: ");
        double baldosa = habitacion.nextDouble();
        System.out.print("Precio de cada baldosa: ");
        double precio = habitacion.nextDouble();
        double ladometros = baldosa/100;
        double baldosasAncho = ancho/ladometros;
        double baldosasLargo = largo/ladometros;
        double baldosasTotales = baldosasAncho*baldosasLargo;
        double precioTotal = baldosasTotales*precio;
        System.out.print("Hay que colocar " + baldosasTotales + " y su precio a invertir es: " + precioTotal);
        habitacion.close();

    }
}