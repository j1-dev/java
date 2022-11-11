import java.util.Scanner;

/*
    Realiza un programa que resuelva la pregunta de si el próximo año vas a ir de vacaciones y donde será: 
    Si tienes dinero entonces puedes ir de vacaciones, la otra opción para poder ir de vacaciones es tener 
    reserva y tener pasaporte en regla. Para saber donde irás de vacaciones es sencillo: Puedes ir a la playa 
    o la montaña y siempre iréis a la playa a no ser que tus 3 hijos quieran ir a la montaña.
 */

public class ej8 
{
    public static void main(String[] args) 
    {
        Boolean dinero, pasaporte, reserva;
        Boolean hijo1, hijo2, hijo3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Tienes dinero?");
        dinero = sc.nextBoolean();

        System.out.println("Tienes pasaporte en regla?");
        pasaporte = sc.nextBoolean();

        System.out.println("Tienes reserva?");
        reserva = sc.nextBoolean();

        if(dinero || (pasaporte && reserva))
        {
            System.out.println("Irás de vacaciones");
            System.out.println("Quiere el hijo 1 ir a la montaña(true)/playa(false)");
            hijo1 = sc.nextBoolean();
            System.out.println("Quiere el hijo 2 ir a la montaña(true)/playa(false)");
            hijo2 = sc.nextBoolean();
            System.out.println("Quiere el hijo 3 ir a la montaña(true)/playa(false)");
            hijo3 = sc.nextBoolean();
            
            if(hijo1&&hijo2&&hijo3)
            {
                System.out.println("Irás a la montaña");
            } else 
            {
                System.out.println("Irás a la playa");
            }
        } else 
        {
            System.out.println("No irás de vacaciones");
        }

        sc.close();

    }
}
