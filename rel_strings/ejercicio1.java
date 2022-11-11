import java.util.Scanner;

public class ejercicio1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Introduzca un texto/frase: ");
        str = sc.nextLine();

        System.out.println("El texto introducido tiene: " + str.length() + " carácteres");

        sc.close();
    }
}