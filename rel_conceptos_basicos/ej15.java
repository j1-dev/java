import java.util.Scanner;

/*
    Un Biólogo necesita calcular el número de patas de distintas especies que está estudiando y capturando:
    Hormiga -> 6 patas
    Arañas -> 8 patas
    Cochinitas -> 14 patas
    La aplicación debe preguntar por el número capturado de cada una de ellas y devolver el número total de patas.
*/

public class ej15 
{
    public static void main(String[] args) 
    {
        final int PATAS_HORMIGA = 6, PATAS_ARANIA = 8, PATAS_COCHINITA = 14;
        Scanner sc = new Scanner(System.in);
        int hormiga, arania, cochinita;

        System.out.println("Introduzca el número de hormigas: ");
        hormiga = sc.nextInt();

        System.out.println("Introduzca el número de arañas: ");
        arania = sc.nextInt();

        System.out.println("Introduzca el número de cochinitas");
        cochinita = sc.nextInt();

        int total = hormiga * PATAS_HORMIGA + arania * PATAS_ARANIA + cochinita * PATAS_COCHINITA;
        System.out.println("El número total de patas es igual a " + total + " patas.");

        sc.close();
    }
}
