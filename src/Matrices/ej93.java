package Matrices;

import java.util.Scanner;

public class ej93 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el total de trabajadores de la empresa: ");
        int numtrabajadores = entrada.nextInt();

        int sueldoanual = 0;
        int sueldopromedioH = 0;
        int sueldopromedioM = 0;
        int contadorH = 0;
        int contadorM = 0;
        int totalH = 0;
        int totalM = 0;

        int Matriz[][] = new int [numtrabajadores][2];

        for(int i = 0; i < numtrabajadores; i ++){
            for(int j = 0; j < 1; j ++){
                System.out.print("Introduce el género: ");
                int género = entrada.nextInt();
                if((género == 0)||(género == 1)){
                    if(género == 0){
                        Matriz[i][j] = 0;
                        contadorH++;
                    }
                    else if(género == 1){
                        Matriz[i][j] = 1;
                        contadorM++;
                    }
                }
                else{
                    while((género != 0)&&(género != 1)){
                        System.out.print("Introduce el género: ");
                        género = entrada.nextInt();
                    }
                }
                System.out.print("Introduce el sueldo anual: ");
                sueldoanual=entrada.nextInt();
                Matriz[i][j+1]=sueldoanual; 

                if(Matriz[i][j]==0){
                    sueldopromedioH += Matriz[i][j + 1];
                    totalH = sueldopromedioH/contadorH;
                }
                else if(Matriz[i][j] == 1){
                    sueldopromedioM += Matriz[i][j+1];
                    totalM = sueldopromedioM / contadorM;
                }
            }
        }
        System.out.println(" ");
        for(int i = 0; i < numtrabajadores; i ++){
            for(int j = 0; j < Matriz[i].length; j ++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("El promedio del sueldo de los hombres es: " + totalH + " €");
        System.out.println("El promedio del sueldo de las mujeres es: " + totalM + " €");
        System.out.println(" ");

        entrada.close();
    }
}