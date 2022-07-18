
package herencia;

public class Perro extends Mamifero{
    private String raza;
    private String nombre;
    private boolean mezcla;
    
    public Perro(String racing, String name,int patas, int vida){
        super(patas, vida);
        this.raza = racing;
        this.nombre = name;
        this.mezcla = false;
    }
    
    @Override
    public String comunicarse(){
        String cad="Guau!! guau!! monstro!!";
        return cad;
    }
    
    @Override
    public void dormir(){
        System.out.println("Duermo 18 horas");
    }

    @Override
    public String toString() {
        String cad="PERRO\n";
        cad+="-----\n";
        cad+="Nombre: "+this.nombre+"\n";
        cad+="Raza: "+this.raza+"\n";
        if (this.mezcla){
            cad+= "No es un perro puro.\n";
        }
        else{
            cad+="Es de pura raza.\n";
        }
        cad+="Patas: "+this.npatas+"\n";
        cad+="Este tipo de bicho suele durar unos "+this.vida+" años\n";
        return cad;
    }
    
    public void jugar(){
        System.out.println(this.nombre+"está jugando.");
    }

    public void setMezcla(boolean nueva) {
        this.mezcla = nueva;
    }

    public boolean getMezcla() {
        return this.mezcla;
    }
    
    
    
}
