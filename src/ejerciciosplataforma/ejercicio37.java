package ejerciciosplataforma;

import java.util.Scanner;

public class ejercicio37 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int num = 0;
        int posicion=1; //me dice la posicion por la que voy
        int primer=0, ultima=0; //primera posicion del 12 y ultima posicion del 12
        final int NUMERO =12;
        do{
            System.out.print("Dame un valor: ");
            num = entrada.nextInt();
            if(num==NUMERO){ //empieza la fiesta
                if(primer==0){
                    primer=posicion;
                }
                ultima=posicion;

            }
            posicion++;

        }while (num!=0);
        entrada.close();

        System.out.println("Primera aparicion en posición: "+primer);
        System.out.println("Última aparicion en posición: "+ultima);
    }
}
