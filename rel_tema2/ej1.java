import java.util.Scanner;

public class ej1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique un día de la semana (1-5)");

        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El lunes toca lenguaje de marcas a primera");
                break;
            case 2:
                System.out.println("El martes toca Entornos de desarrollo a primera");
                break;
            case 3:
                System.out.println("El miercoles toca lenguaje de marcas a primera");
                break;
            case 4:
                System.out.println("El jueves toca base de datos a primera");
                break;
            case 5:
                System.out.println("El viernes toca programación a primera");
                break;
            default:
                System.out.println("Día invalido");
                break;
        }

        sc.close();

    }
}