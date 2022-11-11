import java.util.Scanner;

public class diasMes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un mes en número (1-12)");
        int mes = sc.nextInt();
        sc.close();
        
        switch (mes)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("tiene 31");
                break;
            case 2:
                System.out.println("tiene 28");
                break;
            case 4: case 6: case 9: case 11:  
                System.out.println("tiene 30");
                break;    
            default:
                System.out.println("mes erroneo");

        }
    }
}
