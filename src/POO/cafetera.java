package POO;

public class cafetera {
    int capacidadMax;
    int cantidadActual;
    int numInvitados;
    int capacidadTaza;

    public cafetera(){
        this.capacidadMax=1000;
        this.cantidadActual=0;
        this.numInvitados=10;
        this.capacidadTaza=33;

    }

    public void echarCafe(int cafelito){
        cantidadActual+=cafelito;
        if(cafelito>1000){
            cantidadActual=capacidadMax;
        }
        else if(cafelito<=0){
            cantidadActual=1;
        }
    }
    public void llenarCafetera(){
        cantidadActual=capacidadMax;
    }
    public void VaciarCafetera(){
        cantidadActual=0;
    }
    public void servirTaza(int capacidadTaza){
        if(cantidadActual>capacidadTaza){
            cantidadActual-=capacidadTaza;
        }
        else if(cantidadActual<capacidadTaza){
            System.out.println("La cafetera no puede servir la taza");
        }
        else if(cantidadActual==capacidadTaza){
            cantidadActual-=capacidadTaza;
            System.out.println("Sirviendo taza...");
        }
    }
    public String cantidadCafe(){
        return "Queda "+cantidadActual+" cc de café en la cafetera";
    }
    public String toString(){
        String res="Soy una cafeterra dolcegusto.\n";
        res+="Mi capacidad máxima es de "+this.capacidadMax+ " cc.\n";
        res+="Me quedan "+this.cantidadActual+ " cc de café.\n";
        res+= this.cantidadCafe();
        return res;
    }
}
