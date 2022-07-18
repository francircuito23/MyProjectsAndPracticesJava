package arrays;
//Equipo
public class Garcia_Ortiz_Francisco_E2 {

    private String nombre;
    private int numMax;
    private String nombres[];
    private int pos;

    public Garcia_Ortiz_Francisco_E2(String nomb, int numMax){
        this.nombre=nomb;
        this.numMax=0;
        this.nombres = new String[pos];
        this.pos=0;

        for(int i=0;i<this.nombres.length;i++){
            this.nombres[i]="";
        }
    }
    public boolean llena(){
        boolean res=true;
        if(this.pos<this.nombres.length){//comparo la posicion con el array para controlar si está lleno o no
            res=false;
        }
        return res;
    }
    public void aniadirJugador(String jugador){
        if(!this.llena()){
            nombres[pos]=jugador;//voy llenando el array con los jugadores pasados por el parámetro
            pos++;
            System.out.println("Jugador añadido");
        }
        else{
            System.out.println("No se pueden añadir más jugadores");
        }
    }
    public String getNombre(){//get para devolver nombre del equipo
        return this.nombre;
    }
    public void setNombre(String nuevoNombre){//set para cambiar nombre del equipo
        this.nombre=nuevoNombre;
    }
    public String mostrar(){
        String res="";
        for(int i=0;i<this.nombres.length;i++){
            if(this.nombres[i].equals("")){//equals para que si detecta un espacio se le cambie por hueco vacio
                res+="HUECO VACIO"+"\n";
            }
            else{
                res+=this.nombres[i]+"\n";//else para ir ponerle al array los jugadores que se vayan añadiendo
            }
        }
        return res;//devolver la cadena
    }
    
}
