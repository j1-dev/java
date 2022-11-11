import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        float nota1, nota2, notaMedia;
        String apto = "";
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nota del primer control: ");
        nota1 = sc.nextFloat();

        System.out.printf("Nota del segundo control: ");
        nota2 = sc.nextFloat();

        notaMedia = (nota1+nota2)/2;
        
        if (notaMedia < 5){
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            apto = sc.next();
        }

        System.out.printf("Tu nota de Programación es: ");
        System.out.println((apto.equals("apto")) ? "5" : notaMedia);

        sc.close();
    }
}
