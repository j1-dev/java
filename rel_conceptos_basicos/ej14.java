import java.util.Scanner;

/*
    Ejercicio 14
    Dada la siguiente función:     y = ax2 + bx + c
    Crea un programa que pida los coeficientes a, b y c, así como el valor 
    de x y calcule el valor resultante de y.
*/

public class ej14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float a, b, c, x;

        System.out.println("introduzca los coeficientes a, b, c y x para resolverla siguiente ecuación: y = ax^2 + bx + c ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        x = sc.nextFloat();
        float y = a*x*x + b*x + c;

        System.out.println("el valor de y es igual a " + y );

        sc.close();
    }
}
