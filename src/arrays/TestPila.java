package arrays;

public class TestPila{

	public static void main(String[] args) {
		
		Pila pila = new Pila(5);
		System.out.println(pila);

		for(int i=0; i<7; i++){
			pila.insertar(i);
		}
		System.out.println(pila);

		while(!pila.vacia()){
			System.out.println("Extraido valor "+pila.extraer());			
		}
		System.out.println(pila);
	}

}//fin class