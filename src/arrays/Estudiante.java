package arrays;

public class Estudiante {
    
    private String nombre;
    private String apellidos;
    private double notas[];
    int insuficientes=0;
    int suficientes=0;
    int notables=0;
    int sobresalientes=0;
    double media=0.0;
    int i=0;


    public Estudiante(String name,String apell,int tam){
        this.nombre = name;
        this.apellidos = apell;
        this.notas = new double[tam];
        
        //inicializar notas
        for(i=0;i<notas.length;i++){
            notas[i]=-1;
        }
        
    }

	public boolean InsertarNota(double cali){
        for(i=0;i<this.notas.length;i++){
            if(this.notas[i]==-1){
                this.notas[i]=cali;
                return true;
            }
        }
        return false;
    }

	public String MostrarNotas() {
        String res="";
        for(i=0;i<this.notas.length;i++){
            res+="Nota "+i+": ";
            if(this.notas[i]!=-1){
                res+=this.notas[i]+"\n";
            }
            else{
                res+="No presentado"+"\n";
            }
        }
        return res;
    }

	public double CalcularMedia() {
        int contador=0;
        for(i=0;i<notas.length;i++){
            if(notas[i]>=0){
                media = media + notas[i];
                contador++;
            }
        }
        if(contador!=0){
            media /= contador;
        }
        else{
            media=-1;
        }
        return media;
	}

	public int[] IndicarRangos() {

        for(i=0;i<this.notas.length;i++){
            if((this.notas[i]>=0) && (this.notas[i]<=4.99)){
                insuficientes++;
            }
            else if((this.notas[i]>=5) && (this.notas[i]<=6.99)){
                suficientes++;
            }
            else if((this.notas[i]>=7) && (this.notas[i]<=8.99)){
                notables++;
            }
            else if((this.notas[i]>=9) && (this.notas[i]<=10)){
                sobresalientes++;
            }
        }
        int[] rangos={insuficientes,suficientes,notables,sobresalientes};
        return rangos;
    }
    public String toString(){
        String res="\n"+"Estudiante: "+this.nombre+" "+this.apellidos+"\n";
        res+="\n"+"Notas:"+"\n"+MostrarNotas()+"\n";
        
        res+="\n"+"Media: "+CalcularMedia()+"\n";

        int[] rangos = this.IndicarRangos();
        res+="\n"+"RANGOS:"+"\n";
        res+=rangos[0]+" Insuficientes"+"\n";
        res+=rangos[1]+" Suficientes"+"\n";
        res+=rangos[2]+" Notables"+"\n";
        res+=rangos[3]+" Sobresalientes"+"\n";
        res+="Te jodes"+"\n";

        return res;
    }
    
}
