import java.util.Scanner;

public class ejercicio11
{
    public static void main(String[] args) 
    {
        String interno = "Pepe Viyuela";
        final String ESPACIO = "ESPACIO";
        int digito;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un dígito del 0 al 9: ");
        char numero = sc.nextLine().charAt(0);

        if (Character.isDigit(numero))
        {
            digito = Integer.valueOf(numero+"");

            if(digito <= interno.length())
            {
                if(interno.charAt(digito) == ' ')
                {
                    System.out.println(ESPACIO);
                } 
                else 
                {
                    System.out.println(interno.charAt(digito));
                }
            }
        } 
        else 
        {
            System.out.println("Debe introducir un dígito");
        }
        sc.close();
    }
}