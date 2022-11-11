import java.util.Scanner;

public class ejercicio2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float num1, num2;

        System.out.println("Introduzca dos numeros para elevar el primero por el segundo: ");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        System.out.println(num1 + " elevado a " + num2 + " es igual a " + Math.pow(num1,num2));

        sc.close();
        
    }
}
