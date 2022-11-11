import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca las horas trabajadas durante la semana: ");

        int horas = sc.nextInt();
        sc.close();

        if(horas <= 40){
            System.out.println("El sueldo semanal que le corresponde es: " + horas*12);
        } else {
            System.out.println("El sueldo semanal que le corresponde es: " + (40*12 + (horas-40)*16));
        }
    }
}
