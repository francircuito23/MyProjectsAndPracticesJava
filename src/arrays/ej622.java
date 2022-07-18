package arrays;

public class ej622 {
    public static void main(String[] args) {
        int[] valores = {2,4,6,8,1,3,5,7};
        int otra[]=new int [valores.length+2];
        int i=0;
        
        for(i=0;i<3;i++){
            otra[i]=valores[i];
        }
        otra[i]=200;

        for(i=3;i<5;i++){
            otra[i+1]=valores[i];
        }
        otra[i+1]=300;

        for(i=5;i<valores.length;i++){
            otra[i+2]=valores[i];
        }

        System.out.println("Nuevo array:");
        for(i=0;i<otra.length;i++){
            System.out.println("Numero "+i+": "+otra[i]);
        }
    }
}
