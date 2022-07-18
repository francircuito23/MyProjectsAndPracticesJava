package Excepciones;

public class ej116 {
    public static void main(String[] args) {
    
        int [] lista = new int[15];   
        accesoIndice(lista,15);
        
    }

    public static int accesoIndice(int[] lista, int j) throws RuntimeException {
        try{

            if ((j >= 0) && (j<lista.length)){   
                return lista[j]; 
            }
            else{
                throw new RuntimeException("El indice "+j+ " no existe en el array");
            }

        }catch(RuntimeException e){
                
            System.out.println(e.getMessage());
        }
        return lista[j];

    }
}
