import java.util.Scanner;

/*
    Escribe un programa que calcule el volumen de un cono según la fórmula 
    V =⅓ πr2h 
    El usuario debe introducir el valor de r y h
*/

public class ej17 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float radio, altura, volumen;
        final float PI = 3.14159f;

        System.out.println("Introduzca el radio del cono: ");
        radio = sc.nextFloat();

        System.out.println("Introduzca la altura del cono: ");
        altura = sc.nextFloat();

        volumen = (1f/3f)*PI*radio*radio*altura;

        System.out.println("El volumen del cono será: " + volumen);

        sc.close();
    }
}
