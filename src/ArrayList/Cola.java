package ArrayList;

import java.util.ArrayList;

public class Cola {
    
    private ArrayList<Persona> cola;

    public Cola(){
        cola= new ArrayList<Persona>();
    }

    public boolean EstarVacia() {
        return cola.isEmpty();
    }

    public void Entrar(Persona ele) {
        this.cola.add(ele);
    }

    public void Salir() {
        cola.remove(Primero());
    }

    public Persona Primero() {
        return cola.get(0);
    }
    
    public String Cantidad() {
        String res="";

        res+="Hay "+this.cola.size()+" personas";

        return res;
    }
}
