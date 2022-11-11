import java.util.Scanner;

public class caracteresEscape 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();

        System.out.println("Tu nombre es \"" + nombre + "\" y has vivido \'" + (edad*365*24*60*60) + "\' segundos");

        sc.close();
    }    
}
