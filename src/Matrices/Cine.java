package Matrices;

public class Cine {
    // 0 para libre, 1 para ocupado
    protected int Sala[][];
    private double precio;
    private int entradasVendidas;
    private double recaudado;

    public Cine(double precio) {
        this.precio = precio;
        this.recaudado=0;
        this.entradasVendidas=0;
        this.Sala = new int[5][10];

        for(int i=0;i<this.Sala.length;i++){
            for(int j=0;j<this.Sala[0].length;j++){
                this.Sala[i][j]=0;
            }
        }
    }

    public double CalcularEntrada(String dia, char carnet) {
        double precioFinal=0;
        if((dia.toLowerCase().equals("martes")) || dia.toLowerCase().equals("jueves")){
            precioFinal = (this.precio*0.85);
        }
        switch(carnet){
            case 'E':
            precioFinal=(precioFinal*0.75);
            break;

            case 'J':
            precioFinal=(precioFinal*0.50);
            break;

            case 'P':
            precioFinal=(precioFinal*0.25);
            break;

            default:
            precioFinal=(precioFinal*1);
            break;
        }
        return precioFinal;
    }

    public void vaciarSala() {
        for(int i=0;i<this.Sala.length;i++){
            for(int j=0;j<this.Sala[0].length;j++){
                this.Sala[i][j]=0;
            }
        }
    }

    public String mostrarDatos() {
        String res="";

        res+="El precio normal de la entrada es: "+this.precio+"\n";
        res+="Entradas vendidas: "+this.entradasVendidas+"\n";
        res+="Dinero recaudado: "+this.recaudado+"\n";

        return res;
    }
    
    public void cambiarPrecioNormal(double nuevo) {
        this.precio=nuevo;
    }

    public String mostrarSala() {
        String res="";
        for(int i=0;i<this.Sala.length;i++){
            for(int j=0;j<this.Sala[0].length;j++){
                res+=this.Sala[i][j]+" ";
            }
            res+="\n";
        }
        return res;
    }

    public int[] buscarHueco(int numPersonas) {

        int res[]= new int[2]; //array para devolver
        int posY = -1; //columna del primer asiento libre
        int numFila = 0; //fila por la que voy
        boolean encontrado=false; // True si he encontrado hueco

        while((!encontrado)&&(numFila<this.Sala.length)){ //Miro si hay hueco en la fila pro la que voy | Si hay: Siento a las personas y me salgo del while | Si no: Paso a la siguiente fila (con el While).
            posY=buscarHuecoEnFila(numFila,numPersonas);

            if(posY!=-1){
                sentarGente(numFila,posY,numPersonas);
                encontrado=true;
            }
            else{
                numFila++;
            }
        }

        //Si no encuentro hueco
        if(!encontrado){
            res[0]=-1;
            res[1]=-1;
        }
        //Si hay hueco
        else{
            res[0]=numFila;
            res[1]=posY;
        }
        return res;
    }

    private int buscarHuecoEnFila(int numFila, int numPersonas) {
        int res = -1;
        int i=0; // celda (columna) por la que voy
        int contador=0; //personas que voy sentando
        boolean todosSentados=false;

        while((!todosSentados)&&(i<this.Sala[numFila].length)){

            if(this.Sala[numFila][i]==0){
                contador++;
                res=i;
            }
            else{
                contador=0;
                res=-1;
            }

            if(contador==numPersonas){
                todosSentados=true;
            }
            else{
                i++;
            }
        }

        if(!todosSentados){
            res= -1;
        }
        else{
            res=res-numPersonas+1;
        }

        return res;
    }

    private void sentarGente(int numFila, int posY, int numPersonas) {
        for(int i=0;i<numPersonas;i++){
            this.Sala[numFila][posY] = -1;
            posY++;
        }
    }
}