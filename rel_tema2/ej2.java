import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la hora del día (1-23)");

        int hora = sc.nextInt();
        sc.close();

        if(hora > 6 && hora <= 12){
            System.out.println("Buenos días");
        } else if(hora > 12 && hora <= 20){
            System.out.println("Buenas tardes");
        } else if(hora > 20 && hora <= 6){
            System.out.println("Buenas noches");
        } 
    }
}
