import java.util.Scanner;

public class ejercicio4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int nReemplazar;
        char reemplazo;

        System.out.println("Introduzca un texto/frase: ");
        str = sc.nextLine();

        System.out.println("Introduzca un número: ");
        nReemplazar = sc.nextInt();

        System.out.println("Indique qué caracter quiere colocar en la posición " + nReemplazar + ": ");
        reemplazo = sc.next().charAt(0);

        String newString = str.replace(str.charAt(nReemplazar), reemplazo);

        System.out.println("El texto quedaría tal que así: " + newString);

        sc.close();
    }
}