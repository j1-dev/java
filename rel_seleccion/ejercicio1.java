import java.util.Scanner;

public class ejercicio1{

    /*
        Escribir un programa que calcule el dinero recaudado en un concierto.

        La aplicación solicitará el aforo máximo del local, el precio de las entradas y el numero de entradas vendidas.
        Hay que tener en cuenta que si el número de entradas vendidas no supera el 20% del aforo del local, el concierto se cancela.
        Si el número de entradas vendidas no supera el 50% del aforo, se realiza una rebaja del 25% del precio de la entrada
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aforoMax, entradasVendidas;
        float precioEntrada;

        System.out.println("Introduzca el aforo máximo");
        aforoMax = sc.nextInt();

        System.out.println("Introduzca el precio de la entrada");
        precioEntrada = sc.nextFloat();

        System.out.println("Indique el número de entradas vendidas");
        entradasVendidas = sc.nextInt();

        sc.close();

        if(entradasVendidas < (aforoMax*0.2f))
        {
            System.out.println("Se han vendido menos de un 20% de las entradas y se cancela el concierto");
        } 
        else if(entradasVendidas < (aforoMax*0.5f))
        {
            precioEntrada *= 0.75f;
            System.out.println("Se han recaudado en total "+ precioEntrada*entradasVendidas + " euros");

        } 
        else 
        {
            System.out.println("Se han recaudado en total "+ precioEntrada*entradasVendidas + " euros");
        }
 

    }
}