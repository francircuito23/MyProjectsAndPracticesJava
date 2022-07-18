package ArrayList;

import java.util.ArrayList;

public class Pila {

    private ArrayList<Integer> pila;

    public Pila(){
        pila= new ArrayList<Integer>();
    }

    public void insertar(int ele){
        pila.add(ele);
    }

    public int cima(){
        int res=0;

        if(this.pila.size() > 0){
            res=pila.get(this.pila.size()-1);
        }

        return res;
    }

    public boolean vacia(){
        return pila.isEmpty();
    }

    public int extraer(){
        int res=0;
        
        if(this.pila.size() > 0){
            res=pila.remove(this.pila.size()-1);
        }

        return res;
    }

    public String toString(){
        String res="";

        for (Integer i : pila) {
            res+=i+"\n";
        }

        return res;
    }
}
