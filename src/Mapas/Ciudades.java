package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Ciudades {
    
    Map<String, String> datos;

    public Ciudades() {
        datos = new HashMap<>();
    }

    public void aniadirAlumno(String nombre, String ciudad){
        if(!datos.containsKey(nombre)) {

            datos.put(nombre, ciudad);

        }
        else{
            System.out.println("Ya existe el alumno");
        }
    }

    public void mostrarCiudad(String ciudad) {
        if(datos.containsValue(ciudad)){

            int contador=0;

            for(String i: datos.values()){
                if(i.equals(ciudad)){
                    contador++;
                }
            }
            System.out.println("En la ciudad: "+ciudad+ " ha/n nacido "+contador+" alumno/s");
            
        }
        else{
            System.out.println("La ciudad no existe");
        }
    }

    public int cantidadCiudades() {
        int cont=0;
        String tmp="";

        for(String i: datos.values()){
            if(!tmp.contains(i)){
                cont++;
                tmp+=i;
            }
        }
       return cont;
    }

    public String mostrarDatos() {
        String res="";

        for (String key: datos.keySet()){  
			res+="El alumno es "+ key +" Ciudad "+ datos.get(key)+"\n";
        }

        return res;
    }

    public void borrar(String nombre) {
        if(datos.containsKey(nombre)){

            datos.remove(nombre);
            
        }
        else{
            System.out.println("El alumno no está en la lista");
        }
    }

    public void borrarTodo() {

        this.datos.clear();

    }

    public String resumen() {
        Map<String, Integer> apoyo = new HashMap<>();
        
        String res="";
        int contador=0;

        for(String ciudat: this.datos.values()){
            if(!apoyo.containsKey(ciudat)){
                contador=0;
                

                for(String numAlu: this.datos.values()){

                    if(ciudat.equalsIgnoreCase(numAlu)){
                        contador++;
                    }
                }

                res+=ciudat+": "+contador+" alumnos."+"\n";
                apoyo.put(ciudat, contador);
            }
            
        }
        
        return res;
    }
}
