package Excepciones;

public class mainPiscina {
    public static void main(String[] args){
        
        int random1 = (int) (Math.random()*100+1);
        PiscinaDeOtraForma pito = new PiscinaDeOtraForma(random1);
        
        int random2 = (int) (Math.random()*25+1);

        for(int i=1; i<6; i++){

            try {

                pito.llenar(random2);
                
            } catch (PiscinaException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Nivel de la piscina actual "+i+": "+pito.getNivel());
        }

        System.out.println();

        for(int i=1; i<6; i++){

            try {

                pito.vaciar(random2);

            } catch (PiscinaException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Nivel de la piscina actual "+i+": "+pito.getNivel());
        }
    }
}
