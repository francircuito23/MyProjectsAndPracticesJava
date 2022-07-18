package ejercicios;

import java.util.Scanner;

public class pedirusuariosucio {
    public static void main(String[] args) {
        //1)String usuario="Gauss34" String clave ="Soyunrager"
        //a) pido el usuario y la clave por teclado y muestro "bienvenido" cuando ambos datos coincidan. Sigo pidiendo mientras no sean correctos(y saco el mensaje:Vuelve a intentarlo)
        //b) Dejo 3 intentos Si me paso de intentos:"No puedes pasar"
        Scanner entrada = new Scanner(System.in);
        String usuario = "Francisco", contraseña = "hastaluego";
        String name;
        String pass;
        int CORRECTO = 0, intentos = 0;
        do {
            System.out.print("Ingrese Usuario: ");
            name = entrada.nextLine();
            System.out.print("Ingrese contraseña: ");
            pass = entrada.nextLine();
            if (usuario.equals(name)&&(contraseña.equals(pass))) {
                System.out.println("Bienvenido!!¡¡");
                CORRECTO = 1;

            } else {
                System.out.println("Usuario o contraseña incorrectos");
                intentos++;
                if(intentos==3) {
                    System.out.println("Intentos acabados, pa tu casa");
                }
            }
        } while ((intentos!=3) && CORRECTO==0);
            entrada.close();
    }
}

              
