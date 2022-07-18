package ejerciciosplataforma;
import java.util.Scanner;

    public class ejercicio19 {
        public static void main(String[] args) {
        int candidato= -1;
        int otroCandidato = -1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el primer número:");
        int n1 = entrada.nextInt();
        System.out.println("Dime el segundo valor:");
        int n2 = entrada.nextInt();
        System.out.println("Dime el tercer valor:");
        int n3 = entrada.nextInt();
        System.out.println("Dime el cuarto valor:");
        int n4 = entrada.nextInt();
        System.out.println("Dime el quinto valor:");
        int n5 = entrada.nextInt();

        if (n1 > candidato) {
            candidato = n1;
            if (n2 < candidato) {
                candidato = n2;
            }
            if (n3 <= candidato) {
                candidato = n3;
            }
            if (n4 <= candidato) {
                candidato = n4;
            }
            if (n5 > otroCandidato) {
                otroCandidato = n5;
            }
           
        }
    }
}
