package ArrayList;

import java.util.ArrayList;

public class Agenda{

    ArrayList <Persona> lista = new ArrayList< >();

    public void AniadirPersona(Persona persona){
        lista.add(persona);
    }

    public void BorrarPersona(String dni){
        boolean found=false;

        for(int i=0;i<lista.size()&& !found;i++){
            if(dni == lista.get(i).getDni()){
                lista.remove(lista.get(i));
                found=true;
            }

        }
    }

    public void BuscarPersona(String dni){
        boolean found=false;

        for(int i=0;i<lista.size() && found==false;i++){
            if(dni == lista.get(i).getDni()){
                System.out.println(lista.get(i).toString());
                found=true;
            }
        }
        if(!found){
            System.out.println("No existe ninguna persona con ese DNI");
        }

    }

    public String toString(){
        String res="";

        for(int i=0;i<lista.size();i++){

            res+=lista.get(i).toString();
            res+="---------------------";
        }
        return res;
    }

    public void OrdenarAgenda() {
        
        
    }
}