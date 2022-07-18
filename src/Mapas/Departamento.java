package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Departamento {
    
    Map<Integer, Empleado> empresa;

    public Departamento() {
        this.empresa = new HashMap<>();
    }

    public void AniadirEmpleado(Integer dni, Empleado emple) {

        if(!empresa.containsKey(dni)){

            empresa.put(dni, emple);
        }
        else{
            System.out.println("Ya existe un empleado/a con este DNI");
        }
    }

    public void BorrarEmpleado(Integer dni) {

        if(empresa.containsKey(dni)){

            empresa.remove(dni);

            System.out.println("Empleado/a despedido/a");
            
        }
        else{
            System.out.println("No existe ningún empleado/a con este DNI");
        }
    }

    public void BuscarEmpleado(Integer dni) {
        
        if(empresa.containsKey(dni)){

            System.out.println(empresa.get(dni).toString());
            
        }
        else{
            System.out.println("No existe ningún empleado/a con este DNI");
        }
    }

    public void RevisarSueldos() {
        
        Iterator<Empleado> it = empresa.values().iterator();
        
        Empleado sueldoSubida;

        while(it.hasNext()){

            sueldoSubida = it.next();

            if(sueldoSubida.getAnosAntiguedad()>=0 && sueldoSubida.getAnosAntiguedad()<=1){

                sueldoSubida.getSueldo();
            }

            else if(sueldoSubida.getAnosAntiguedad()>=2 && sueldoSubida.getAnosAntiguedad()<=4){

                sueldoSubida.setSueldo(sueldoSubida.getSueldo()+200);

            }

            else if(sueldoSubida.getAnosAntiguedad()>=6 && sueldoSubida.getAnosAntiguedad()<=8){

                sueldoSubida.setSueldo(sueldoSubida.getSueldo()+500);

            }

            else if(sueldoSubida.getAnosAntiguedad()>=9 && sueldoSubida.getAnosAntiguedad()<=10){

                sueldoSubida.setSueldo(sueldoSubida.getSueldo()+750);

            }

            else{

                sueldoSubida.setSueldo(sueldoSubida.getSueldo()+900);

            }
        }
    }

    public void NuevoAnio(int n) {

        Iterator<Empleado> it = empresa.values().iterator();

        Empleado anoSubido;

        while(it.hasNext()){

            anoSubido = it.next();
  
            anoSubido.setAnosAntiguedad(anoSubido.getAnosAntiguedad()+n);
        }

    }

    public String toString() {
        String res="";

        for (Integer clave: empresa.keySet()) {

            res+="Datos Empleado:"+"\n";
            res+="DNI: " + clave +"\n";
            res+=empresa.get(clave).toString();
            res+="\n";
        }

        return res;

    }

    public void PalLobby() {
        
        this.empresa.clear();

    }
}
