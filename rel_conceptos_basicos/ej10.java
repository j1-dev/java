import java.util.Scanner;

/*
   Escribe un programa que calcule el salario semanal de un empleado en base a
   las horas trabajadas, a razón de 12 euros la hora.
*/

public class ej10 
{
    public static void main(String[] args) 
    {
        final int RATE = 12;
        Scanner sc = new Scanner(System.in);
        int horas;

        System.out.println("Introduzca las horas trabajadas semanalmente: ");
        horas = sc.nextInt();

        System.out.println("El salario semanal es: " + horas*RATE);

        sc.close();
    }
}
