package ejercicios;

import java.util.Scanner;

public class pedirusuario {
    public static void main (String arg[]){
        //1)String usuario="Gauss34" String clave ="Soyunrager"
        //a) pido el usuario y la clave por teclado y muestro "bienvenido" cuando ambos datos coincidan. Sigo pidiendo mientras no sean correctos(y saco el mensaje:Vuelve a intentarlo)
        //b) Dejo 3 intentos Si me paso de intentos:"No puedes pasar"
        Scanner entrada = new Scanner(System.in);
        String usuario = "Francisco", contraseña = "hastaluego";
        String name;
        String pass;
        
        System.out.print("Introduzca el usuario: ");
        name = entrada.nextLine();
        System.out.print("Introduzca la clave: ");
        pass = entrada.nextLine();
        if((usuario.equals(name)&&(contraseña.equals(pass)))){
            
        }
        else{
            
        
         while((!usuario.equals(name)||(!contraseña.equals(pass)))){
            System.out.println("Datos incorrectos, vuelve a intentarlo: ");
            System.out.print("Usuario: ");
            name = entrada.nextLine();
            System.out.print("Contraseña: ");
            pass = entrada.nextLine();
            
         }
        System.out.println("Bienvenido!!!!!!!!!!!!!!!");
        entrada.close();   
        }
        
       
    }
}
