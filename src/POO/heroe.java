package POO;

public class heroe {

    String nombre;
    int edad;
    boolean volar;
    int fuerza;
    int vida;
    boolean rapido;
    int energia;

    public heroe(String name, int edad, boolean fly, int power, int live, boolean rap, int energy){
        this.nombre = name;
        this.edad = edad;
        this.volar = fly;
        this.fuerza = power;
        this.vida = live;
        this.energia = energy;

        if (fuerza>50){
            fuerza=50;
        }
        if (fuerza<40){
            fuerza=40;
        }
        
    }

	public void Volar() {
        if(volar==true){
            System.out.println(nombre+ " está volando");
        }
        else{
            System.out.println(nombre+  " no está volando");     

        }
	}

	public void Correr() {
        if(volar==true){
            rapido=false;
            System.out.println(nombre+ " está volando, no puede correr");
        }
        else {
            rapido=true;
            System.out.println(nombre+ " está corriendo, no puede volar");
        }
	}

	public void pelear() {
        System.out.println("Estoy dando ostias");
        energia-=50;
        }
    

	public void dormir() {
        int nueva = this.energia+40;
        if (nueva<=100){
            System.out.println("Estoy durmiendo");
            this.energia=nueva;
        }
        else{
            this.energia=100;
        }
	}
    
}
