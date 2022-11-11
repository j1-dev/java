import java.util.Scanner;

public class sonMultiplos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("introduzca el primer número");
        num1 = sc.nextInt();

        System.out.println("Introduzca el segundo número");
        num2 = sc.nextInt();

        if(Math.max(num1,num2) % Math.min(num1,num2) == 0)
        {
            System.out.println("Son múltiplos");
        } 
        else 
        {
            System.out.println("No son múltiplos");
        }

        sc.close();
    }
}