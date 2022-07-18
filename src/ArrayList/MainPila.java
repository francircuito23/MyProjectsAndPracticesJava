package ArrayList;

public class MainPila {
    public static void main(String[] args) {

        Pila pila = new Pila();

        System.out.println(pila);

		for(int i=0; i<7; /* En la condición del for se mete el número que quieras*/ i++){
			pila.insertar(i);
		}
		System.out.println(pila);

		while(!pila.vacia()){
			System.out.println("Extraido valor "+pila.extraer());			
		}
        System.out.println(pila);
	
    }
}
