/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

public class Gato extends Mamifero{
    private String raza;
    private String nombre;
    private String pelajes[]={"corto","largo","semilargo"};
    private String pelaje;
    
    public Gato(String racing, String name,int patas, int vida){
        super(patas, vida);
        this.raza = racing;
        this.nombre = name;
        this.pelaje= pelajes[0];
    }
    
    /*
    comunicarse
    dormir
    cazar
    toString    
    */

    public void setPelaje(String robert) {
       
       if (!this.pelajeCorrecto(robert)){
           robert=this.pelajes[0];
       }
       this.pelaje = robert;
       
    }
    
    private boolean pelajeCorrecto(String pelaje){
        pelaje = pelaje.toLowerCase();
        
        for (int i = 0; i < this.pelajes.length; i++) {
            if(pelaje.equals(this.pelajes[i])){
                return true;
            }
        }
        return false;
    }
    
    
}
