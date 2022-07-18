package Practica22aEvalu;

public class Guerrero extends Heroe {
    
    public Guerrero(String name){
        super(name);
        this.inteligencia=(int)(Math.random()*(5-3+1)+3);
        this.fuerza=(int)(Math.random()*(25-10+1)+10);
        this.destreza=(int)(Math.random()*(10-1+1)+1);
        this.vidaActual=(int)(Math.random()*(20-8+1)+8);
        this.vidaActual=this.vidaMax;
    }

    public void furia() {
        //Si quieres, comprueba que está vivo
        if(this.vidaActual > 6){
            this.fuerza+=6;
            this.vidaActual-=6;
            System.out.println(this.nombre+" ha entrado en furia");
        }
        else{
            System.out.println(this.nombre+" no tiene vida para entrar en furia");
        }
    }
    @Override
    public String toString() {
        String papa= super.toString();
        return papa+ "Tipo: Guerrero\n";
    }
}
