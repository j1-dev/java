import java.util.Scanner;

public class comparaciones2 
{
    public static void main(String[] args) 
    {
        int edad;
        final int EDAD= 18;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();

        System.out.println(edad<EDAD ? "eres menor de edad" : "eres mayor de edad");

        sc.close();
    }    
}
