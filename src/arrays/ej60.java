package arrays;

public class ej60 {
    public static void main(String[] args) {
        
        int[] numeros = new int[100];
        for(int i=0;i<numeros.length;i++){
            numeros[i] = (int) (Math.random()*100)+1;
        }
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]%5==0){
                System.out.println("Estos son los multiplos de 5: "+numeros[i]);
            }
        }
        int mayor=numeros[0];
        int posicion=0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>mayor){
                mayor=numeros[i];
                posicion=i;
            }
        }
        System.out.println("El mayor es "+mayor+" y está en la posicion "+posicion);

        for(int i=0;i<numeros.length;i++){
            if(numeros[i]%2==0){
                System.out.println("Estos son los multiplos de 2: "+numeros[i]);
            }
        }
    }
}
