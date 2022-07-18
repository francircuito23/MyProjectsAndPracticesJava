
package test1;


public class testProfe {

    public static void main(String[] args) {
        
       Profesor jaime = new Profesor("Jaime",54,"76123345F");
       Profesor ara = new Profesor("Araceli",19,"75345231H");
       //System.out.println(jaime);
       Profesor juanje =new Profesor(jaime);

       //System.out.println(juanje);
       
       
       Asignatura prg = new Asignatura ("Programacion",300,jaime);
       System.out.println(prg.toString());
       
       
       jaime.nombre = "Juanma";
       System.out.println(prg.toString());
       
    }
    
}
