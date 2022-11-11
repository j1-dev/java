import java.util.Scanner;

public class numLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un número");
        int num = sc.nextInt();
        
        if(num > 0 && num <= 9)

            System.out.println(num + " tiene una cifra");

        else if (num >= 10 && num <= 99)

            System.out.println(num + " tiene 2 cifras");

        else if (num >= 100 && num <= 999)

            System.out.println(num + " tiene 3 cifras");

        else if (num >= 1000 && num <= 9999)

            System.out.println(num + " tiene 4 cifras");

        else if (num >= 10000 && num <= 99999)

            System.out.println(num + " tiene 5 cifras");

        else if (num >= 100000 && num <= 999999)

            System.out.println(num + " tiene 6 cifras");

        else 
        
            System.out.println("Número fuera de rango");

    }
}
