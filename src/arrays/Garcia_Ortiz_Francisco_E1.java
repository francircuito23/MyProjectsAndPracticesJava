package arrays;

public class Garcia_Ortiz_Francisco_E1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        //Apartado A y B
        for(int i=0;i<numeros.length;i++){
            //inicializar
            numeros[i] = -99;
            System.out.print(" ");
            System.out.print(numeros[i]);

        }
        //Apartado C
        System.out.println();
        for(int i=0;i<numeros.length;i++){
            if(i<8){
                numeros[i] = (int)(Math.random()*(20-5+1)+5);
                System.out.print(" ");
                System.out.print(numeros[i]);

            }
        }
        //Apartado D
        System.out.println();
        for(int i=numeros.length-1;i>=0;i--){
            System.out.println(numeros[i]);
        }

    }
    
}
