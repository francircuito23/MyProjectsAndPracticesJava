package herencia;

public class Arco {
    private int longitud;
    private int peso;
    private String material;
    private String materiales[]={"madera","metal","fibra de vidrio"};
    private Flecha carcaj[];
    private int pos;

    public Arco(String material, int tam) {
        this.material = material;
        this.carcaj = new Flecha[tam];
        this.pos=0;

        for(int i=0;i<materiales.length;i++){
            if(this.materiales[i]=="madera"){
                this.peso=300;
                this.longitud=900;
            }
            if(this.materiales[i]=="metal"){
                this.peso=530;
                this.longitud=750;
            }
            if(this.materiales[i]=="fibra de vidrio"){
                this.peso=100;
                this.longitud=1100;
            }
        }

        for(int i=0;i<this.carcaj.length;i++){
            this.carcaj[i]= new Flecha((int)(Math.random()*(40-60+1)+60), material);
        }
    }

    public void setMaterial(String nuevoMaterial) {
        if(this.materialCorrecto(nuevoMaterial)) {
            this.material=nuevoMaterial;
        }
        else{
            this.material="Material incorrecto.";
        }
    }

    private boolean materialCorrecto(String material) {
        material=material.toLowerCase();

        for(int i=0;i<this.materiales.length;i++){
            if (material.equals(this.materiales[i])){
                return true;
            }
        }
        return false;
    }
    
    public boolean llena(){
        boolean res=true;
        if(this.pos<this.carcaj.length){//comparo la posicion con el array para controlar si hay flechas o no
            res=false;
        }
        return res;
    }

    public void disparar(){
        if(!this.llena()){
            pos--;
            System.out.println("Se ha disparado una flecha.");
            for(int i=0;i<pos;i++){
                System.out.print(this.carcaj[i]);
            }

        }
        else{
            System.out.println("No se ha podido disparar, faltan flechas");
        }
    }
    public void recargar() {
        for(int i=0;i<this.carcaj.length;i++){
            this.carcaj[i]= new Flecha((int)(Math.random()*(40-60+1)+60), material);
        }
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
