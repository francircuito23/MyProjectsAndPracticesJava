package ejerciciosplataforma;

public class ejerciciosplataforma {
    public static void main(String[] args) {
      //3)
        final int divisor = 5;
        System.out.print("Dime el primer numero: ");
        String entrada = System.console().readLine();
        int numero1 = Integer.parseInt(entrada);
        System.out.print("Dime el segundo numero: ");
        String entrada2 = System.console().readLine();
        int numero2 = Integer.parseInt(entrada2);
        System.out.print("Dime el tercer numero: ");
        String entrada3 = System.console().readLine();
        int numero3 = Integer.parseInt(entrada3);
        System.out.print("Dime el cuarto numero: ");
        String entrada4 = System.console().readLine();
        int numero4 = Integer.parseInt(entrada4);
        System.out.print("Dime el quinto numero: ");
        String entrada5 = System.console().readLine();
        int numero5 = Integer.parseInt(entrada5);
        System.out.println("La media es: " + ((numero1 + numero2 + numero3 + numero4 + numero5) / divisor));

        //4)
        final double valor1 = 12.3;
        final int valor2 = 5;
        final int valor3 = 9;
        System.out.print("El numero m es: ");
        String n1 = System.console().readLine();
        int m = Integer.parseInt(n1);
        System.out.print("El numero n: ");
        String n2 = System.console().readLine();
        int n = Integer.parseInt(n2);
        System.out.println("El apartado a da: " + m / n* (m-n));
        System.out.println("El apartado b da: " + (valor1 / m + valor2 - n * valor3));

        //5)
        int segundos, minutos, horas;
        System.out.print("Ingrese segundos: ");
        String entrad = System.console().readLine();
        segundos = Integer.parseInt(entrad);
        
        horas = segundos/3600;
        minutos = segundos/60 - horas * 60;
        segundos = segundos - minutos*60-horas * 3600;
        System.out.print(horas + " Horas " + minutos + " Minutos " + segundos + " Segundos");





      
  
      }
  
}
