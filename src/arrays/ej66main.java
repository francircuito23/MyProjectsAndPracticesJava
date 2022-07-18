package arrays;

public class ej66main {
    public static void main(String[] args) {
        
        Estudiante Alumno1 =  new Estudiante("Vero", "Sanz Ballester", 4);
        boolean conseguido;
        conseguido=Alumno1.InsertarNota(4.99);
        if(conseguido){
            System.out.println("Nota insertada con éxito");
        }
        else{
            System.out.println("Nota incorrecta");;
        }
        Estudiante Alumno2 =  new Estudiante("Kaydy", "Cain", 4);
        Estudiante Alumno3 =  new Estudiante("Yung", "Beef", 4);
        Estudiante Alumno4 =  new Estudiante("Marko", "Italia", 4);
        Estudiante Alumno5 =  new Estudiante("Ayax", "Pedrosa", 4);

        System.out.println(Alumno1.toString());
    }
    
}
