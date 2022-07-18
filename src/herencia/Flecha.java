package herencia;

public class Flecha {
    private int longitud;
    private String material;
    private String materiales[]={"hierro","piedra","hueso"};

    public Flecha(int longitud, String material) {
        this.longitud=longitud;
        this.material=material;
    }

    public void cambiarPunta(String nuevoMaterial) {
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

    public String toString(){
        String res="";
        res+="Flecha de "+this.longitud+" cms con punta de "+this.material+"\n";

        return res;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
