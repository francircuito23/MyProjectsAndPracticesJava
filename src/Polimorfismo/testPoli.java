package Polimorfismo;

public class testPoli {
    public static void main(String[] args) {

        Coche copito= new Coche("amarillo", 4, 250, 1600);
        Coche zea= new Coche("negro", 4, 999, 1500);
        Bicicleta bmx=new Bicicleta("rosa", 2, "deportiva");
        Bicicleta pony=new Bicicleta("rosita", 2, "urbana");
        Motocicleta chope=new Motocicleta("negrita", 2, "kawasaki", 300, 400);
        Motocicleta loser=new Motocicleta("crema", 2, "triste", 600, 300);

        Bicicleta lista[]=new Bicicleta[8];
        Camioneta otra[]= new Camioneta[8];

        Vehiculo garaje[]= new Vehiculo[8];

        garaje[0]=copito;
        garaje[1]=zea;
        garaje[2]=new Camioneta("negro mate", 6, 190, 2000, 4500);
        garaje[3]=new Camioneta("rojo", 4, 260, 1500, 4000);
        garaje[4]=bmx;
        garaje[5]=pony;
        garaje[6]=chope;
        garaje[7]=loser;

        for(int i=0;i<garaje.length;i++){
            if(garaje[i] instanceof Camioneta){//instanceof te dice si el objeto es o no es lo que le pongas delante de él
                Camioneta tmp = (Camioneta)garaje[i];
                System.out.println(tmp.carga);
            }
            else if(garaje[i] instanceof Bicicleta){
                Bicicleta pito=(Bicicleta)garaje[i];
                pito.tocarTimbre();
            }
        }
    }
}
