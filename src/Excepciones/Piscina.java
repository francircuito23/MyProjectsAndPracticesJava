package Excepciones;

public class Piscina {
    
    public final int MAXNIVEL;
    private int nivel;
    
    public Piscina(int tope){
        if (tope<0){
            tope=0;
        }

        this.MAXNIVEL = tope;

    }
    
    public int getNivel(){
        return this.nivel;

    }

    public void vaciar(int cantidad) throws Exception{
        try {

            if(this.nivel - cantidad < 0){
                throw new Exception("Excepción: El nivel de la piscina no puede quedar por debajo de 0");
            }
    
            else{
                this.nivel -= cantidad;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void llenar(int cantidad) throws Exception{
        try {

            if(this.nivel + cantidad > this.MAXNIVEL){

                throw new Exception("Excepción: La piscina no puede pasar su nivel máximo");
    
            }
    
            else{
                this.nivel += cantidad;
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
