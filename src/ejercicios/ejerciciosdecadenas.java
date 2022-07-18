package ejercicios;

public class ejerciciosdecadenas {
    public static void main(String[] args) {
        //1) Mostrar: la primera letra es, la ultima letra es, el primer espacio está, el ult espacio está en la posición, 
        //2) Pedir dos valores al usuario Mostrar la subcadena entre esos dos valores: La subcadena entre __ y ___ es ____
        //3) Quita y guarda el trozo "se me ha caido" Quita y guarda el trozo "quiero llorar" Crea la frase "me ha caido la gorda en programación y quiero llorar" y lo muestro en mayús.
        String frase = "Se me ha caido el movil y quiero llorar";
        int tamaño = frase.length();
        char primeraletra = frase.charAt(0);
        System.out.println("La primera letra es " + primeraletra);
        char ultimaletra = frase.charAt(38);
        System.out.println("La ultima letra es " + ultimaletra);
        



    }    

}
