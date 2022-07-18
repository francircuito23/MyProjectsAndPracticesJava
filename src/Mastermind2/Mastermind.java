package Mastermind2;

import java.util.Arrays;

public class Mastermind {
    
    private int contrasena[];

    public Mastermind(int tam) {
        this.contrasena = new int[tam];

        this.Contrasena();
    }

    public void Contrasena() {
        
        for(int i=0; i<this.contrasena.length; i++){

            this.contrasena[i]= (int) (Math.random()*10);

        }
    }

    public String Pistas(int intento[]) {
        
        String res="";
        int j=0;

        if(Arrays.equals(intento, this.contrasena)){
            System.out.println("Correcto.");
        }
        else{
            System.out.println("Incorrecto. Pistas:");
        }

        for (int i=0; i<this.contrasena.length; i++) {

            if(this.contrasena[i] == intento[i]){

                res+="*";
            }
            if(this.contrasena[i] != intento[i]){

                res+=".";
            }

            if(j>this.contrasena.length){

                if(this.contrasena[i] == intento[j]){
                    res+="-";
                }
            }
            
        }

        return res;
    }

    public boolean Adivinado(int[] intento) {  

        boolean adivinado = false;
        
        if(Arrays.equals(intento, this.contrasena)){
            adivinado=true;
        }

        return adivinado;
    }
}
