package arrays;

public class ej59 {
    public static void main(String[] args) {
        int[] flags ={0,1,0,-1,0,-1,-1,-1,0,0,-1};
        int[] tivic = flags;

        for(int i=0;i<flags.length;i++){
            if(flags[i]<0){
                flags[i]=8;
            }
            System.out.print(tivic[i]+" ");
        }

    }
    
}
