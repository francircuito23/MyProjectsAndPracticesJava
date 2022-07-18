package POO;

public class mainpersona {
    public static void main(String[] args) {
        
        persona chica = new persona("Eustaquia", 2.10, 73, true, 90, true);

        chica.dormir();

        System.out.println(chica.nombre);
        persona juan = new persona("ivan", 3.52, 85, false, 90, false);

        juan.caminar();
        juan.dormir();

    }
    
}
