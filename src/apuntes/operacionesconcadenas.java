package apuntes;

public class operacionesconcadenas {
    public static void main(String[] args) {
        String frase = "AYUDA PORFAVOR!!!";
        int tamaño = frase.length();
        System.out.println(tamaño - 1);
        frase = frase.toUpperCase();
        frase = frase.toLowerCase();
        System.out.println(frase);
        String cambio = frase.replace('a', '#');
        System.out.println(cambio);           
        


    }                   
}
