import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float num;
        System.out.println("Introduzca un número decimal: ");
        num = sc.nextFloat();

        System.out.println("El valor absoluto del número es: " + Math.abs(num));

        sc.close();
    }
}