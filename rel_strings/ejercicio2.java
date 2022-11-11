import java.util.Scanner;

public class ejercicio2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int nCaracter;

        System.out.println("Introduzca un texto/frase: ");
        str = sc.nextLine();

        System.out.println("Introduzca un número: ");
        nCaracter = sc.nextInt();

        System.out.println("El carácter en la posición "+ nCaracter +" es: " + str.charAt(nCaracter));

        sc.close();
    }
}