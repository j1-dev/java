import java.util.Scanner;

/*
 * Realiza el programa que calcule la longitud y el área de una circunferencia utilizando el valor de su radio introducido por el usuario.
   (Debes de usar una constante para guardar el valor de pi)
   Longitud = 2pi * radio
   Área = pi * radio 2
 */

public class ej7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final float PI = 3.14159f;

        System.out.println("Introduzca el radio: ");
        float radio = sc.nextFloat();

        System.out.println("La longitud es: " + (2f*PI*radio));
        System.out.println("El área es: " + (PI*radio*radio));

        sc.close();

    }
}