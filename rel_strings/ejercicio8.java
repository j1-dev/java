import java.util.Scanner;

public class ejercicio8
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char caracter;

        System.out.println("Introduzca un caracter: ");
        caracter = sc.nextLine().charAt(0);

        if(caracter > 0 && caracter <= 32)
            System.out.println("El caracter introducido es un espacio.");
        else if(caracter >= 47 && caracter <=57)
            System.out.println("El caracter es un número.");
        else if(caracter >= 65 && caracter <=90)
            System.out.println("El caracter es una letra mayúscula.");
        else
            System.out.println("Caracter no admitido.");

        sc.close();
    }
}