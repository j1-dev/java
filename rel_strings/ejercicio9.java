import java.util.Scanner;

public class ejercicio9
{
    public static void main(String[] args) 
    {
        String texto = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";
        final String PREGUNTA = "¿Quién mas estaba en casa de Juan?";
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println(texto);
        System.out.println(PREGUNTA);
        str = sc.nextLine();

        int indice = texto.indexOf(" y Mario");
        System.out.println(indice);
        String nuevaCadena = texto.substring(0,indice) + ", " + str + texto.substring(indice);

        System.out.println(nuevaCadena);


        sc.close();
    }
} 

