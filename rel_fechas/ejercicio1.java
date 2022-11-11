import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ejercicio1
{
    public static void main(String[] args) 
    {
        int dia, mes, anio;
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yy");

        System.out.println("Introduzca el día de su nacimiento: ");
        dia = sc.nextInt();

        System.out.println("Introduzca el mes de su nacimiento: ");
        mes = sc.nextInt();

        System.out.println("Introduzca el año de su nacimiento: ");
        anio = sc.nextInt();

        LocalDate fecha = LocalDate.of(anio, mes, dia);

        LocalDate hoy = LocalDate.now();

        LocalDate fechaNextCumple;

        if(fecha.getMonthValue() < hoy.getMonthValue())
        {
            fechaNextCumple = LocalDate.of(hoy.getYear()+1,fecha.getMonthValue(),fecha.getDayOfMonth());

        } else if (hoy.getMonthValue() == fecha.getMonthValue() && fecha.getDayOfMonth() < hoy.getDayOfMonth())
        {
            fechaNextCumple = LocalDate.of(hoy.getYear()+1,fecha.getMonthValue(),fecha.getDayOfMonth());
        } else 
        {
            fechaNextCumple = LocalDate.of(hoy.getYear(),fecha.getMonthValue(),fecha.getDayOfMonth());
        }

        int edad = hoy.getYear() - fecha.getYear();

        String fechaFormateada = fecha.format(formato);

        System.out.println("Su cumpleaños es el: " + fechaFormateada);
        System.out.println("Su edad es: " + edad);
        System.out.println("Quedan " + ChronoUnit.DAYS.between(hoy, fechaNextCumple)+ " días para el próximo cumpleaños");

        sc.close();
    }
}