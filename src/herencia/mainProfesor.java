package herencia;

public class mainProfesor {
    public static void main(String[] args) {
        Profesor pepes=new Profesor("7776665454B", 23, "Pepes", 99);
        pepes.hablar();
        pepes.darClase();
        pepes.trabajo();
        System.out.println();
        System.out.println(pepes);
    }
    
}
