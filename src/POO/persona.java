package POO;

public class persona {
    //Atributos
    String nombre;
    double altura;
    int peso;
    int edad;
    boolean sexo;
    boolean ocupado;

    //métodos de clase

    public persona(String name, double alt, int edad, boolean sex, int ps, boolean ocup){
        this.nombre = name;
        this.altura = alt;
        this.peso = ps;
        this.edad = edad;
        this.sexo = sex;
        this.ocupado = ocup;

        System.out.println("Acabo de nacer: "+nombre);

	    
    }

	public void dormir() {
        if (ocupado==false){
            System.out.println("ESTOY DURMIENDO");
            ocupado=true;
        }
        else{
            System.out.println("No puedo dormir porque estoy ocupado");
        }
	}

	public void caminar() {
        if(this.peso>50){
            System.out.println("nacion");
        }
        else{
            System.out.println("Loca");
        }
	} 
}
