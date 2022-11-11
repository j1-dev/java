import java.util.Scanner;

public class ejercicio3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str, strBegin, strEnd;
        int nSeparar;

        System.out.println("Introduzca un texto/frase: ");
        str = sc.nextLine();

        System.out.println("Desde qué caracter quiere separar el texto? ");
        nSeparar = sc.nextInt();

        strBegin = str.substring(0, nSeparar);
        strEnd = str.substring(nSeparar, str.length());
        
        System.out.println("La primera parte de la cadena es: " + strBegin);
        System.out.println("La segunda parte de la cadena es: " + strEnd);

        sc.close();
    }
}