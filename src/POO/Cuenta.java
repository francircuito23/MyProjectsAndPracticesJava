package POO;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(){
        
    }
    public void SetTitular(String nuevoTitular){
        this.titular= nuevoTitular;
    }
    public String GetTitular(){
        return titular;
    }
    public void SetCantidad(double nuevaCantidad){
        this.cantidad=nuevaCantidad;
    }
    public double GetCantidad(){
        return cantidad;
    }
    public void Ingresar(double dinero){
        if(dinero<=0){
            System.out.println("Lo sentimos, el ingreso debe ser positivo");
        }
        else if(dinero>0){
            this.cantidad+=dinero;
        }
    }
    public void Retirar(double dinero){
        if((this.cantidad-dinero)<0){
            this.cantidad=0;
        }
        else{
            this.cantidad-=dinero;
        }
    }
}
