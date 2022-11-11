import java.util.Scanner;

public class ejercicio7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char caracter;

        System.out.println("Introduzca un caracter: ");
        caracter = sc.nextLine().charAt(0);

        if(Character.isSpaceChar(caracter))
            System.out.println("El caracter introducido es un espacio.");
        else if(Character.isDigit(caracter))
            System.out.println("El caracter es un número.");
        else if(Character.isUpperCase(caracter))
            System.out.println("El caracter es una letra mayúscula.");
        else 
            System.out.println("Caracter no admitido");

        sc.close();
    }
}