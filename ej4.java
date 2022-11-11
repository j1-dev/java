import java.util.Scanner;

public class ej4 
{
    public static void main(String [] args)
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        String nombre = lector.nextLine();

        System.out.println("Escriba su edad: ");
        int edad = lector.nextInt();

        System.out.println("Escriba su altura en metros: ");
        float altura = lector.nextFloat();

        System.out.println("Tu nombre es " + nombre + ", tu edad es " + edad + " años y tu estatura es " + altura + " metros.");

        lector.close();
    }
}
