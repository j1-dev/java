import java.util.Scanner;

/*
    Empresa de un parque de atracciones quiere una aplicación que les ayude al cobro de entradas a las 
    familias que sacan las entradas. Existen las entradas infantiles a 15,50€ y de adultos a 20€. 
    En caso de que el importe sea mayor a 100€ se aplicará un descuento del 5%.
*/

public class ej16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int entradas_menor, entradas_adulto;
        final int THRESHOLD_PRECIO = 100;
        final float PRECIO_MENOR = 15.50f, PRECIO_ADULTO = 20f, DESCUENTO = 0.95f;

        System.out.println("Introduzca el número de entradas de niños: ");
        entradas_menor = sc.nextInt();

        System.out.println("Introduzca el número de entradas de adulto: ");
        entradas_adulto = sc.nextInt();

        float total = entradas_menor*PRECIO_MENOR + entradas_adulto*PRECIO_ADULTO; 

        if(total > THRESHOLD_PRECIO)
        {
            total *= DESCUENTO;
        }

        System.out.println("El precio de las entradas es igual a: " + total + " €");

        sc.close();
    }    
}
