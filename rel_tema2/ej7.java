import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la primera nota");
        float nota1 = sc.nextFloat();

        System.out.println("Introduzca la segunda nota");
        float nota2 = sc.nextFloat();

        System.out.println("Introduzca la tercera nota");
        float nota3 = sc.nextFloat();

        sc.close();

        System.out.println("La media es " + (nota1+nota2+nota3)/3 );
    }
}
