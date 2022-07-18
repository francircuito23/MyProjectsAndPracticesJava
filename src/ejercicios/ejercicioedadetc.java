package ejercicios;

public class ejercicioedadetc {
    public static void main(String[] args) {
            //ejercicioedad                                    //double edad = Double.parseDouble(entrada)
    System.out.print("Dime tu edad: ");
    String cosa = System.console().readLine();
    int edad = Integer.parseInt(cosa);
    System.out.println("El año que viene tendrás " + (edad + 1) + " años");


    //ejercicioaño
        final int anioActual = 2020; //convertir en constante
        System.out.print("¿En qué año naciste?: "); //pedir año de nacimiento
        String entrada = System.console().readLine(); // crear una variable donde mete el dato el usuario
        int anioUsuario = Integer.parseInt(entrada); // transformar de cadena a numero
        System.out.println("Tu edad es:" + (anioActual - anioUsuario));

        // 1) Pedir un número de centímetros por teclado y mostrar su equivalencia en pulgadas
        final double centimetrosporpulgadas = 2.54;
        System.out.print("Dime los centímetros: ");
        String medidadeusuario = System.console().readLine();
        int centimetros = Integer.parseInt(medidadeusuario);
        System.out.println("Su equivalencia en pulgadas es " + (centimetros / centimetrosporpulgadas ) + " pulgadas");

        // 2) Pedir la altura y la base de un rectángulo y calcular su área (b*h) y su perímetro (2b*h)
        System.out.print("Dime la altura: ");
        String usuario = System.console().readLine();
        double altura = Double.parseDouble(usuario);
        System.out.print("Dime la base: ");
        String usuario2 = System.console().readLine();
        double base = Double.parseDouble(usuario2);
        System.out.print("El área es: " + (base*altura) + " y la altura es: " + (base*2 + altura*2));

    }
}