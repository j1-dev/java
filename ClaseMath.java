import java.util.Scanner;
import java.lang.Math;

public class ClaseMath
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número de segundos");

        float segundos = sc.nextFloat();

        System.out.println("Se encuentra en el minuto " + Math.round(segundos)/60);

        sc.close();
    }
}