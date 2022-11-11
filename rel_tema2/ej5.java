import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduzca el valor de a: ");
        float a = sc.nextFloat();

        System.out.println("Ahora introduzca el valor de b: ");
        float b = sc.nextFloat();

        sc.close();

        if (a != 0){
            System.out.println("x = " + (-b/a));
        } else {
            System.out.println("Esa ecuación no tiene solución real.");
        }
    }
}
