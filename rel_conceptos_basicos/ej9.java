import java.util.Scanner;

/*
 * Realiza un programa que devuelva si un número entero introducido es par o impar.
 */

public class ej9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int numero = sc.nextInt();
        int es_par = numero % 2;

        if (es_par == 1)
            System.out.println("es impar");
        else
            System.out.println("es par");

        sc.close();
    }
}
