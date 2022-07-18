package Excepciones;

public class PiscinaDeOtraForma {
    
    public final int MAXNIVEL;
    private int nivel;
    
    public PiscinaDeOtraForma(int tope){
        if (tope<0){
            tope=0;
        }

        this.MAXNIVEL = tope;

    }
    
    public int getNivel(){
        return this.nivel;

    }

    public void vaciar(int cantidad) throws PiscinaException{

        if(this.nivel - cantidad < 0){
            throw new PiscinaException("Excepción: El nivel de la piscina no puede quedar por debajo de 0");
        }
    
        else{
            this.nivel -= cantidad;
        }

    }

    public void llenar(int cantidad) throws PiscinaException{

        if(this.nivel + cantidad > this.MAXNIVEL){

            throw new PiscinaException("Excepción: La piscina no puede pasar su nivel máximo");
    
        }
    
        else{
            this.nivel += cantidad;
        }
    }
}
