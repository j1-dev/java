import java.util.Scanner;

public class ejercicio6
{
    public static void main(String[] args) 
    {
        final String TEXTO = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";
        final String PREGUNTA = "¿Quién estaba en casa de Juan?";
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println(TEXTO);
        System.out.println(PREGUNTA);
        str = sc.nextLine();

        if (TEXTO.toLowerCase().contains(str.toLowerCase()))
            System.out.println(str + " estaba en la casa de Juan.");
        else
            System.out.println(str + " no estaba en la casa de Juan");

        sc.close();
    }
}