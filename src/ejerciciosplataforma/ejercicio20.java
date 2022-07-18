package ejerciciosplataforma;
import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el primer número:");
        int primerNumero = entrada.nextInt();
        System.out.println("Dime el segundo valor:");
        int segundoNumero = entrada.nextInt();
        System.out.println("Dime el tercer valor:");
        int tercerNumero = entrada.nextInt();
        int candidato = -1;
        int otroCandidato = -1;
        if ((primerNumero < 0) && (segundoNumero < 0) && (tercerNumero < 0)) {
            System.out.println("Los números son:" + primerNumero + segundoNumero + tercerNumero);

            if (primerNumero <= candidato) {
                candidato = primerNumero;
                if (segundoNumero < candidato) {
                    candidato = segundoNumero;
                }
                if (tercerNumero <= candidato)
                    
                {
                    candidato = tercerNumero;
                }
                System.out.println("El menor es:" + candidato);

                if (primerNumero <= otroCandidato) {
                    otroCandidato = primerNumero;
                }
                if (segundoNumero > otroCandidato) {
                    otroCandidato = segundoNumero;
                }
                if (tercerNumero > otroCandidato) {
                    otroCandidato = tercerNumero;
                }
                System.out.print("El mayor es:" + otroCandidato);
            } else {
                System.out.print("Los números son mayores de 0");
            }

            entrada.close();

        }
    }


}
