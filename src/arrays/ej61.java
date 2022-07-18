package arrays;
import java.util.Arrays; 


public class ej61 {
    public static void main(String[] args) {
        int[] malaga ={0,1,0,-1,0,-1,-1,-1,0,0,-1};
        int[] sevilla ={1,1,1,1,1,1,1,1,1,1,1};
        int[] malaga2 ={0,1,0,-1,0,-1,-1,-1,0,0,-1};
        int[] kaydycain ={23,23,23,-23,23,-23,-23,-23,23,23,-23};

        if (Arrays.equals(malaga, kaydycain)){
            System.out.println("IGUALES");
        }
        else{
            System.out.println("NO IGUALES");
        }
        
    }
}
