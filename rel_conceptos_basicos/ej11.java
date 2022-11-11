import java.util.Scanner;

/* Ejercicio 11
    Realiza un programa que calcule la nota que hace falta sacar en el segundo
    examen de la asignatura Programación para obtener la media deseada. Hay
    que tener en cuenta que la nota del primer examen cuenta el 40% y la del
    segundo examen un 60%.
*/



public class ej11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float nota_1, nota_2, nota_objetivo;

        System.out.println("Introduce la nota del primer examen: ");
        nota_1 = sc.nextFloat();
        System.out.println("¿Qué nota quieres sacar en el trimestre? ");
        nota_objetivo = sc.nextFloat();
    
        nota_2 = (nota_objetivo - nota_1*0.4f) / 0.6f;
        System.out.println("Para tener un " + nota_objetivo + " en el trimestre necesitas sacar un " + nota_2 + " en el segundo examen.");

        sc.close();
    }
}
