package Polimorfismo;

public class Bicicleta extends Vehiculo {
    String tipo[]={"urbana", "deportiva"};
    int tipoActual;

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        for(int i=0;i<this.tipo.length;i++){
            if (tipo.equals(this.tipo[i])) {
                tipoActual=i;
                i=this.tipo.length;
            }
            tipoActual=0;
        }
    }
    
    @Override
    public String toString() {
        return "Soy una bicicleta "+super.toString()+" ademas del tipo "+this.tipo[tipoActual];
    }
    public void tocarTimbre() {
        System.out.println("Pi Pi!!");
        
    }
    

}
