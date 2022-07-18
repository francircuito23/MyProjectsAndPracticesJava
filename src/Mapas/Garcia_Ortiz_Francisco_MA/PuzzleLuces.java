package Mapas.Garcia_Ortiz_Francisco_MA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PuzzleLuces {
    
    private Map<Integer, String> puzzle;
    private int n;

    public PuzzleLuces(int n) {
        this.n = n;
        this.puzzle = new HashMap<>();

        this.Inicializar();
    }

    public void Inicializar() {

        for(int i=1; i<n+1; i++){
            puzzle.put(i, ".");
        }
    }

    public void apagarLuces() {
        
        Iterator<String> it = puzzle.values().iterator();

        String luces;

        while(it.hasNext()){

            luces = it.next();

            for (Integer clave: puzzle.keySet()){

                if(luces.equals("*")){
                    puzzle.replace(clave, ".");
                }
            }  
        }
    }

    public void tocarPulsador(int pulsador) {

        if(puzzle.get(pulsador) == "." && puzzle.get(pulsador+1) == "." && puzzle.get(pulsador-1) == "."){
            puzzle.replace(pulsador+1, "*");
            puzzle.replace(pulsador-1, "*");
        }
        
        else if(puzzle.get(pulsador) == "." && puzzle.get(pulsador+1) == "*" && puzzle.get(pulsador-1) == "*"){
            puzzle.replace(pulsador+1, ".");
            puzzle.replace(pulsador-1, ".");
        }

        else if(puzzle.get(pulsador) == "." && puzzle.get(pulsador+1) == "*" && puzzle.get(pulsador-1) == "."){
            puzzle.replace(pulsador-1, "*");
        }

        else if(puzzle.get(pulsador) == "." && puzzle.get(pulsador+1) == "." && puzzle.get(pulsador-1) == "*"){
            puzzle.replace(pulsador+1, "*");
            puzzle.replace(pulsador-1, "*");
        }

        else if(puzzle.get(pulsador) == "*" && puzzle.get(pulsador+1) == "." && puzzle.get(pulsador-1) == "."){
            puzzle.replace(pulsador+1, "*");
            puzzle.replace(pulsador-1, "*");
        }

        else if(puzzle.get(pulsador) == "*" && puzzle.get(pulsador+1) == "." && puzzle.get(pulsador-1) == "*"){
            puzzle.replace(pulsador+1, "*");
            puzzle.replace(pulsador-1, "*");
        }

        else if(puzzle.get(pulsador) == "*" && puzzle.get(pulsador+1) == "*" && puzzle.get(pulsador-1) == "*"){
            puzzle.replace(pulsador, ".");
            puzzle.replace(pulsador+1, ".");
            puzzle.replace(pulsador-1, ".");
        }

        else if(puzzle.get(pulsador) == "*" && puzzle.get(pulsador+1) == "*" && puzzle.get(pulsador-1) == "."){
            puzzle.replace(pulsador+1, "*");
            puzzle.replace(pulsador-1, "*");
        }

        else if(puzzle.get(pulsador) == "." && puzzle.get(pulsador+1) == null && puzzle.get(pulsador-1) == "."){
            puzzle.replace(pulsador-1, "*");
        }

        else if(puzzle.get(pulsador) == "*" && puzzle.get(pulsador+1) == null && puzzle.get(pulsador-1) == "*"){
            puzzle.replace(pulsador-1, ".");
        }

        else if(puzzle.get(pulsador) == "." && puzzle.get(pulsador+1) == null && puzzle.get(pulsador-1) == "*"){
            puzzle.replace(pulsador-1, "*");
        }

        else if(puzzle.get(pulsador) == "*" && puzzle.get(pulsador+1) == null && puzzle.get(pulsador-1) == "."){
            puzzle.replace(pulsador-1, "*");
        }

        else if(puzzle.get(pulsador) == "." && puzzle.get(pulsador+1) == "*" && puzzle.get(pulsador-1) == null){
            puzzle.replace(pulsador+1, ".");
        }

        else if(puzzle.get(pulsador) == "*" && puzzle.get(pulsador+1) == "*" && puzzle.get(pulsador-1) == null){
            puzzle.replace(pulsador+1, ".");
        }

        else if(puzzle.get(pulsador) == "." && puzzle.get(pulsador+1) == "." && puzzle.get(pulsador-1) == null){
            puzzle.replace(pulsador+1, "*");
        }

        else if(puzzle.get(pulsador) == "*" && puzzle.get(pulsador+1) == "." && puzzle.get(pulsador-1) == null){
            puzzle.replace(pulsador+1, "*");
        }

        else if(puzzle.get(pulsador) == "*" && puzzle.get(pulsador+1) == "." && puzzle.get(pulsador-1) == "."){
            puzzle.replace(pulsador, ".");
        }

        else{
            System.out.println("No existe ese pulsador.");
        }
    }

    public boolean comprobarSolucion() {
        
        boolean luz=false;

        Map<Integer, String> copia = new HashMap<>();

        for(int i=1; i<n+1; i++){
            copia.put(i, "*");
        }

        if(puzzle.equals(copia)){
            luz = true;
        }
        else{
            luz= false;
        }

        return luz;
    }

    public String toString() {

        String res="";

        for (Integer clave: puzzle.keySet()) {

            res+=puzzle.get(clave)+" ";

        }

        res+="\n";

        for (Integer clave: puzzle.keySet()){

            res+=clave+" ";
        }

        return res;

    }

    private boolean EncenderLuces() { // Enciende todas las luces
        
        Iterator<String> it = puzzle.values().iterator();

        String luces;
        boolean encendidas=false;

        while(it.hasNext()){

            luces = it.next();

            for (Integer clave: puzzle.keySet()){

                if(luces.equals(".")){
                    puzzle.replace(clave, "*");

                    encendidas=true;
                }
            }      
        }

        return encendidas;
    }
}
