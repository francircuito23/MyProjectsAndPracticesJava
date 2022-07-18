package POO;

public class impresora {
    int numCartuchos;
    public String marca;
    String modelo;
    int cantidadTinta;
    public int contador;
    boolean encendida;
    boolean check;
    int cantidadPag;

    public impresora(){
        this.numCartuchos=5;
        this.marca="Epson";
        this.modelo="X";
        this.cantidadTinta=15*numCartuchos;
        this.contador=0;
        this.encendida=false;
        this.check=true;

        if((this.numCartuchos!=1) || (this.numCartuchos!=4)){
            this.numCartuchos=2;
        }
    }
    public void encender(){
        if(encendida==false){
            System.out.println("La impresora "+this.marca+" está apagada");
            System.out.println("Vamos a encenderla...");
            System.out.println("Ya está encendida");
            encendida=true;
        }else{
            System.out.println("La impresora "+this.marca+" ya está encendida");
        }
    }
    public void apagar(){
        if(encendida==true){
            System.out.println("Vamos a apagar la impresora "+this.marca+"...");
        }else{
            System.out.println("La impresora "+this.marca+" ya está apagada");
        }
    }
    public void imprimir(int cantidadPag){
        boolean salir=false;
        if(encendida==true){
            while((cantidadPag>0)&&(salir==false)){
                if(this.Check()==true){
                    System.out.println("La impresora "+this.marca+" ha imprimido "+cantidadPag+" hoja/s");
                    cantidadPag--;
                    contador++;
                    cantidadTinta--;
                }
            }
        }
        else if(encendida==false){
            System.out.println("Lo sentimos, "+this.marca+" no puede imprimir porque está apagada");
        }
        else if(this.Check()==false){
            System.out.println("Lo sentimos, "+this.marca+" no puede imprimir porque no pasa el check");
        }
        else if(cantidadPag==0){
            System.out.println("La impresora "+this.marca+" se ha quedado sin hojas");
        }
    }
    public boolean Check(){
        if((contador<50) && (numCartuchos>=1)){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        String res="Soy una impresora Epson.\n";
        res+="Mi modelo es: "+this.modelo+ "\n";
        res+="Mi cantidad de tinta es: "+this.cantidadTinta+ "\n";
        res+="Mi cantidad de hojas es: "+this.cantidadPag;
        return res;
    }
}
