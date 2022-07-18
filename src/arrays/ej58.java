package arrays;

public class ej58 {
    public static void main(String[] args) {
        double media=0.0;
        int[] notas={6,3,9,7,5,8,10,2,4,5};
        for(int i=0;i<notas.length;i++){
            media = media + notas[i];
        }
        media /= notas.length;
        System.out.print("La nota media de las notas es: "+media);
    }
    
}
