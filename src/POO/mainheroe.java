package POO;

public class mainheroe {
    public static void main(String[] args) {
        
        heroe batman = new heroe("Batman", 99, true, 100, (int) (Math.random()*100+1), false,100);


        System.out.println("Datos Heroe 1: ");
        System.out.print("Nombre: "+batman.nombre);
        System.out.print(" Edad: "+batman.edad);
        System.out.print(" Fuerza: "+batman.fuerza);
        System.out.println(" Vida: "+batman.vida);

        batman.Volar();
        batman.Correr();
        batman.pelear();
        batman.dormir();

        heroe superman = new heroe("Superman", 5233, false, 49, (int) (Math.random()*100+1), true,100);

        System.out.println("Datos Heroe 2: ");
        System.out.print("Nombre: "+superman.nombre);
        System.out.print(" Edad: "+superman.edad);
        System.out.print(" Fuerza: "+superman.fuerza);
        System.out.println(" Vida: "+superman.vida);

        superman.Volar();
        superman.Correr();
        superman.pelear();
        superman.dormir();

    }
    
}
