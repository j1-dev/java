import java.util.Scanner;

public class comparaciones
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduzca el 1er número: ");
        num1 = sc.nextInt();

        System.out.println("Introduzca el 2o número: ");
        num2 = sc.nextInt();

        System.out.println(num1 + " es mayor que " + num2 + ": " + (num1>num2));
        System.out.println(num1 + " es menor que " + num2 + ": " + (num1<num2));
        System.out.println(num1 + " es mayor o igual que " + num2 + ": " + (num1>=num2));
        System.out.println(num1 + " es menor o igual que " + num2 + ": " + (num1<=num2));
        System.out.println(num1 + " es igual que " + num2 + ": " + (num1==num2));
        System.out.println(num1 + " es distinto que " + num2 + ": " + (num1!=num2));

        sc.close();
    }
}