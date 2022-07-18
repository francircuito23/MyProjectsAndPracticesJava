package POO;

public class mainCuenta {
    public static void main(String[] args) {
        Cuenta Cuenta1 = new Cuenta();
        Cuenta1.SetTitular("Francisco");
        System.out.println("El nombre del titular es "+Cuenta1.GetTitular());
        Cuenta1.Ingresar(-800);
    }
}
