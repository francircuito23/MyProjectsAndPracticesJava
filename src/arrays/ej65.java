package arrays;

public class ej65 {
    public static void main(String[] args) {
        int tmp=0;
        int i=0;
        int j=0;
        int[] numeros = new int[10];
        for(i=0;i<numeros.length;i++){
            numeros[i] = (int) (Math.random()*100)+1;
        }
        for(i=0;i<(numeros.length-1);i++){
            for(j=(i+1);j<numeros.length;j++){
                if(numeros[i]>numeros[j]){
                    tmp = numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=tmp;
                }
            }
        }
        System.out.println("Array ordenado:");
        for(i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }
    }   
}
