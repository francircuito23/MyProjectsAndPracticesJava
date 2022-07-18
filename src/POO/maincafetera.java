package POO;

public class maincafetera {
    public static void main(String[] args) {
        int numInvitados=10;
        cafetera dolcegusto = new cafetera();
        dolcegusto.llenarCafetera();
        System.out.println(dolcegusto);
        for(int i=1; i<=numInvitados; i++){
            dolcegusto.servirTaza(33);
            System.out.println("Sirviendo taza "+i+ "...");
        }
        System.out.println(dolcegusto);
        dolcegusto.VaciarCafetera();
        dolcegusto.llenarCafetera();

        int capacidadTaza = (int) (Math.random()*(75-25+1)+25);
        cafetera gustoça = new cafetera();
        gustoça.llenarCafetera();
        System.out.println(gustoça);
        for(int i=1;i<=numInvitados; i++){
            gustoça.servirTaza(capacidadTaza);
            System.out.println("Sirviendo taza "+capacidadTaza+ "...");
        }
        System.out.println(gustoça);
        gustoça.VaciarCafetera();
        gustoça.llenarCafetera();


    }
}
