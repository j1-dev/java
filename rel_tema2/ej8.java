import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la primera nota");
        float nota1 = sc.nextFloat();

        System.out.println("Introduzca la segunda nota");
        float nota2 = sc.nextFloat();

        System.out.println("Introduzca la tercera nota");
        float nota3 = sc.nextFloat();

        sc.close();

        float media = (nota1+nota2+nota3)/3;

        if (media < 5)
        {
            System.out.println(media + ": Suspenso");
        } 
        else if (media >= 5 && media < 7)
        {
            System.out.println(media + ": Aprobado");
        }
        else if (media >= 7 && media < 9)
        {
            System.out.println(media + ": Notable");
        }
        else if (media >= 9 && media <= 10)
        {
            System.out.println(media + ": Sobresaliente");
        }
        else 
        {
            System.out.println("wat");
        }
    }
}
