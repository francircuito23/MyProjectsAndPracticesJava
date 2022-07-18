package POO;

public class coche {

    String color;
    double anchura;
    double altura;
    int puertas;
    int ruedas;
    boolean arrancado;
    int gasolina;
    
    public coche(String col, double anch, double alt, int door, int wheels){
        this.color=col;
        this.anchura=anch;
        this.altura=alt;
        this.puertas=door;
        this.ruedas=wheels;
        this.arrancado=false;
        this.gasolina=(int) (Math.random()*50+0);

        if((this.puertas>5) || (this.puertas<3)){
            this.puertas=3;
        }
    }

	public void Arrancar() {
        boolean ok;
        ok=this.chequear();
        if((this.arrancado==false)&&(ok==true)){
            System.out.println("El coche "+color+ " está apagado o parado, vamos a arrancarlo...");
            System.out.println("El coche "+color+" está arrancado");
            this.arrancado=true;
            gasolina-=5;
        }
        else{
            System.out.println("El coche "+color+" no puede arrancarse porque ya lo está");
            gasolina-=5;
            System.out.println("Gasolina actual: "+gasolina);
        }
	}

	public void Parar() {
        if(arrancado==true){
            System.out.println("El coche "+color+" está arrancado, vamos a pararlo...");
            System.out.println("El coche "+color+" se ha parado");
            this.arrancado=false;
        }
        else{
            System.out.println("El coche "+color+" no puede pararse porque ya lo está");
        }
	}

	public void Desplazarse() {
        if(arrancado==true){
            System.out.println("El coche "+color+" está arrancado, puede moverse");
            System.out.println("El coche "+color+" se está desplazando");
            gasolina-=20;
            System.out.println("Gasolina actual: "+gasolina);
        }
        else{
            System.out.println("El coche "+color+" no puede moverse porque no está arrancado");
        }
	}

	public void echargasolina(int litros) {
        this.gasolina+=litros;
        if(this.gasolina>50){
            this.gasolina=50;
        }
	}

	public boolean chequear() {
        //verdadero, si tiene gasolina
        //falso, si no le queda gasolina
        if(this.gasolina>0){
            //devuelve true
            return true;
        }
        else{
            //devuelve false
            return false;
        }
	}

	public String darColor() {
        return this.color;

	}

	public void pintar(String nuevo) {
        this.color=nuevo;
        System.out.println(nuevo);
    }
    public String toString(){
        String res="El coche es: \n";
        res+="Color: "+this.color+"\n";
        res+="Anchura: "+this.anchura+"\n";
        return res;
    }
}
