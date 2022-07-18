package herencia;

public class Señal {
    private String nombre;
    protected double danio;
    private double energia;
    private double nivel;
    private String tipoSenal[]={"quinetica","fuego","viento","hipnotica"};
    private String senal;

    public Señal(String nombre, String senal) {
        this.nombre = nombre;
        this.senal = senal;
        this.nivel=1;
        this.energia=(int)(Math.random()*(15-5+1)+5);
        this.energia=this.energia*(this.nivel/10);
 
        for(int i=0;i<tipoSenal.length;i++){
            if(this.tipoSenal[i].equals("fuego")){
                this.danio=(double)(Math.random()*(100-50+1)+50);

            }

            if(this.tipoSenal[i].equals("viento")){
                this.danio=(double)(Math.random()*(50-25+1)+25)*this.nivel/100;

            }

            if(this.tipoSenal[i].equals("quinetica")&&this.tipoSenal[i].equals("hipnotica")){
                this.danio=0;

            }
        }
    }
    //Apartado C
    public void Senal(String senal) {
        if(this.senalCorrecta(senal)){
            this.senal = senal;
        }
        else{
            this.senal=this.tipoSenal[4];
        }
    }
    private boolean senalCorrecta(String senal){
        senal=senal.toLowerCase();

        for(int i=0; i<this.tipoSenal.length;i++){
            if(senal.equals(this.tipoSenal[i])){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String res="";
        res+="Señal: "+this.nombre+"\n";
        res+="Daño: "+this.danio+"\n";
        res+="Energia: "+this.energia+"\n";
        res+="Nivel: "+this.nivel+"\n";
        res+="Tipo: "+this.senal+"\n";

        return res;
    }
    public void Subir() {
        this.nivel++;
        System.out.println(this.nivel);
    }
}
