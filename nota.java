import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        float nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la nota");
        nota = sc.nextFloat();

        sc.close();

        if (nota < 5)
        {
            System.out.println("Suspenso");
        } 
        else if (nota >= 5 && nota < 7)
        {
            System.out.println("Aprobado");
        }
        else if (nota >= 7 && nota < 9)
        {
            System.out.println("Notable");
        }
        else if (nota >= 9 && nota <= 10)
        {
            System.out.println("Sobresaliente");
        }
        else 
        {
            System.out.println("wat");
        }

        //blablablabla
    }
}
