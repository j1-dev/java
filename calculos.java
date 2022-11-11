import java.util.Scanner;

public class calculos 
{
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        float num1, num2;

        /*
         * Pedir 2 operandos y hacer las operaciones básicas
         * +,-,*,/,%
         */

        System.out.println("Introduzca el primer número: ");
        num1 = lector.nextFloat();

        System.out.println("Introduzca el segundo número: ");
        num2 = lector.nextFloat();
        
        Float suma,resta,mult,div,modulo;

        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        modulo = num1 % num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es igual a: " + resta);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es igual a: " + mult);
        System.out.println("La división " + num1 + " y " + num2 + " es igual a: " + div);
        System.out.println("El módulo de " + num1 + " y " + num2 + " es igual a: " + modulo);

        lector.close();
    }    
}
