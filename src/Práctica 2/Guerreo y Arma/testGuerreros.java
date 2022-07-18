
package test1;

public class testGuerreros {

    public static void main(String[] args) {
    
       Arma espada = new Arma("Joan",8,5);
       Arma ak47 = new Arma("KAKA",2,8);
       
       Guerrero raluka = new Guerrero ("Robert",3,12,espada);
       Guerrero superFacu = new Guerrero("Facu",10,4,ak47);
       
       for (int i=1; i<=4; i++){
            System.out.println("\nROUND "+i+"\n");
            raluka.atacar(superFacu);
            superFacu.atacar(raluka);
            
       }
        System.out.print("\u2660");
        System.out.print("\u2663");
        System.out.print("\u2665");
        System.out.println("\u2666");
       
    }
    
}
