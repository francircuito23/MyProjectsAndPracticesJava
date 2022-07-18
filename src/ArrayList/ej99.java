package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ej99 {
    public static void main(String[] args) {

        ArrayList<Integer> numeritos = new ArrayList<Integer>();
        ArrayList<Integer> numeritos2 = new ArrayList<Integer>();

        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuántos números quieres meter? ");
        int num=entrada.nextInt();

        for(int i=0; i<num; i++){
            System.out.print("Dime el número "+i+": ");
            numeritos.add(entrada.nextInt());
        }

        //a)
        for (int i = 0; i < numeritos.size(); i++) {
            System.out.println(numeritos.get(i));
        }

        //b)
        int tmp=numeritos.get(0);
        numeritos.set(0, (numeritos.get(numeritos.size()-1)));
        numeritos.set(numeritos.size()-1, tmp);


        //c)
        System.out.print("Cuántos números quieres meter? ");
        int num2=entrada.nextInt();

        for(int i=0; i<num2; i++){
            System.out.print("Dime el número "+i+": ");
            numeritos2.add(entrada.nextInt());
        }
        numeritos.addAll(numeritos2);

        for(int i=0;i<numeritos.size();i++){
            numeritos.get(i);
        }
        for (int i = 0; i < numeritos.size(); i++) {
            System.out.println(numeritos.get(i));
        }

        //d)
        int sum = 0;
        for(Integer i : numeritos){
            sum += i;
        }
        System.out.println("La suma de todos sus elementos es: "+sum);

        //e)
        double media=0;
        for(Integer i : numeritos){
            media++;
        }
        System.out.println("La media de sus elementos es: "+sum/media);

        //f)
        for(Integer i : numeritos){
            if(i<(sum/media)){
                System.out.println(i);
            }
        }
    }
}
