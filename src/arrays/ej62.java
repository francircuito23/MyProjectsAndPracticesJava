package arrays;

public class ej62 {
    public static void main(String[] args) {
        int ultimo;
        int[] valores = {2,4,6,8,1,3,5,7};

        ultimo = valores[7];
        
        for(int i=0;i<valores.length;i++){
            if(valores[i]==3){
                valores[i]=300;
            }
            else if(valores[i]==6){
                valores[i]=200;
            }
        }

        for(int i=6;i>=0;i--){
            valores[i+1] = valores[i];
        }
        
        valores[0]= ultimo;

        System.out.println("Nuevo array:");
        for(int i=0;i<8;i++){
            System.out.println("Numero "+i+": "+valores[i]);
        }
    }
    
}
