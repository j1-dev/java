public class ejercicio7
{
    public static void main(String[] args) 
    {
        double min = 0.0, max = 0.0;
        double jugador1= Math.round(Math.random()*6+1);
        min = jugador1;
        max = jugador1;
        System.out.println("El jugador 1 ha sacado un " + jugador1);

        double jugador2= Math.floor(Math.random()*6+1);
        min = (jugador2 < min) ? jugador2 : min;
        max = (jugador2 > max) ? jugador2 : max;
        System.out.println("El jugador 2 ha sacado un " + jugador2);

        double jugador3= Math.floor(Math.random()*6+1);
        min = (jugador3 < min) ? jugador3 : min;
        max = (jugador3 > max) ? jugador3 : max;
        System.out.println("El jugador 3 ha sacado un " + jugador3);

        System.out.println("La tirada más baja ha sido un: " + min);
        System.out.println("La tirada más alta ha sido un: " + max);
    }
}