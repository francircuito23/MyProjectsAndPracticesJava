package Practica22aEvalu;

public class Elfo extends Heroe {

    public Elfo(String name){
        super(name);
        this.inteligencia=(int)(Math.random()*(12-5+1)+5);
        this.fuerza=(int)(Math.random()*(15-7+1)+7);
        this.destreza=(int)(Math.random()*(20-10+1)+10);
        this.vidaActual=(int)(Math.random()*(12-5+1)+5);
        this.vidaActual=this.vidaMax;
    }

    public void rapidez() {
        //Si quieres, comprueba que está vivo
        if(this.fuerza > 5){
            this.fuerza-=5;
            this.destreza-=4;
            System.out.println(this.nombre+" ha usado rapidez");
        }
        else{
            System.out.println(this.nombre+" no tiene fuerza para usar rapidez");
        }
    }
    @Override
    public String toString() {
        String papa= super.toString();
        return papa+ "Tipo: Elfo\n";
    }
}

