package herencia;

public class mainMamifero {
    public static void main(String[] args) {
        Perro Shiba = new Perro(4, 12, "Shiba", "Kaydy", true);
        Perro Husky = new Perro(4, 12, "Husky", "Cain", true);
        Gato Persa = new Gato(4, 10, "Persa", "Minino");
        Gato Bengala = new Gato(4, 10, "Bengala", "Khaled");

        System.out.println(Shiba);
        System.out.println(Husky);
        System.out.println(Persa);
        System.out.println(Bengala);
    }
}
