package arrays;

public class Array2Fors {
    public static void main(String[] args) {
        int tmp=0;
        int[] valores = {50,26,7,9};
        for(int i=0;i<valores.length-1;i++){
            for(int j=0;j<valores.length-i-1;j++){
                if(valores[j]>valores[j+1]){
                    tmp=valores[j];
                    valores[j]=valores[j+1];
                    valores[j+1]=tmp;
                    System.out.println(valores[i]);
                }
            }
        }
    }
}
