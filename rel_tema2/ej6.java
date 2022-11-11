import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        final float G = 9.81f;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la altura desde donde se deja caer el objeto");
        float h = sc.nextFloat();

        sc.close();

        System.out.println("Tardará " + Math.sqrt(2*h/G) + " segundos en caer.");
    }
}
