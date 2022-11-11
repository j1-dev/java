import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;

        System.out.println("Introduzca tres números (a,b,c)");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        sc.close();

        if((b*b-4*a*c) <= 0)
        {
            System.out.println("Error: raiz negativa.");
        } else {
            float x1 = (-b + (float)Math.sqrt(b*b-4*a*c)) / 2*a*c;
            float x2 = (-b - (float)Math.sqrt(b*b-4*a*c)) / 2*a*c;

            System.out.println("La primera solución es x = " + x1);
            System.out.println("La segunda solución es x = " + x2);
        }

    }
}
