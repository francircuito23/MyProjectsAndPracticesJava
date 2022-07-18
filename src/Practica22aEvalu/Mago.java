package Practica22aEvalu;

public class Mago extends Heroe {
    
    public Mago(String name){
        super(name);
        this.inteligencia=(int)(Math.random()*(20-10+1)+10);
        this.fuerza=(int)(Math.random()*(8-3+1)+3);
        this.destreza=(int)(Math.random()*(12-5+1)+5);
        this.vidaActual=(int)(Math.random()*(10-2+1)+2);
        this.vidaActual=this.vidaMax;
    }

    public void curarse() {
        if(!this.muerto){
            this.vidaActual+=3;
            if(this.vidaActual > this.vidaMax){
                this.vidaActual=this.vidaMax;
            }
        }
        else{
            System.out.println("Un muerto no puede curarse");
        }
    }

    @Override
    public String toString() {
        String papa= super.toString();
        return papa+ "Tipo: Mago\n";
    }
}
