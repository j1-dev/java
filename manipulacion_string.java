import java.util.Scanner;

public class manipulacion_string
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String cadena = "En un lugar de la mancha.";

        char letra = cadena.charAt(0);
        System.out.println(letra);
    }
}