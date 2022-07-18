

package herencia;


public class testMamifero {

    public static void main(String[] args) {
        Perro pipo = new Perro("yorkshire", "Pipo",4, 14);
        Perro indi = new Perro("Border Collie del Robert", "Indira",4,12 );
        
        indi.setMezcla(true);
        System.out.println(indi);
        
        System.out.println(pipo.comunicarse());
        System.out.println(pipo);
    }

}
