package Mastermind2;

public class Mastermind2 {
    
    private String contrasena;

    public Mastermind2() {
        this.contrasena = "12345";
    }

    public String Pistas(String intento) {

        String res="";

        int pos;

        if(this.contrasena.equals(intento)){
            System.out.println("Correcto.");
        }
        else{
            System.out.println("Incorrecto. Pistas:");
        }

        for(int i=0; i<this.contrasena.length(); i++){

            pos = this.contrasena.indexOf(intento.charAt(i));

            if(intento.charAt(i) == this.contrasena.charAt(i)){
                res+="*";
            }
                    
            else if(pos!=-1){
                res+="-";
            }

            else{
                res+=" ";
            }
        }

        return res;
    }
        
    public boolean Adivinado(String contraIntento) {

        boolean adivinado = false;;
            
        if(this.contrasena.equals(contraIntento)){
            adivinado=true;
        }

        return adivinado;
    }
}

