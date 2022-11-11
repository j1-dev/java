import java.util.Scanner;

/*
 *  Ejercicio 13
    Diseñar algoritmo que indique el tipo de usuario (normal o vip) que eres de una discoteca, 
    según una serie de premisas. Para ser vip debes de ser socio y haber pagado las cuotas. 
    también puedes ser vip si estás recomendado por otro usuario vip y además estás dentro del periodo de prueba.
    El programa debe preguntar si el usuario es usuario vip, si tiene las cuotas al día, si está recomendado por 
    alguien vip y si está dentro del periodo de prueba.  Indicando si por pantalla si el usuario es vip o no.
 */

public class ej13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Es usted socio? (true/false)");
        Boolean socio = sc.nextBoolean();

        System.out.println("Ha pagado usted las cuotas? (true/false)");
        Boolean cuotas = sc.nextBoolean();

        System.out.println("Ha sido recomendado por algún usuario vip? (true/false)");
        Boolean recomendado = sc.nextBoolean();

        System.out.println("Está dentro del periodo de prueba? (true/false)");
        Boolean prueba = sc.nextBoolean();

        if(socio && cuotas)
        {
            System.out.println("Usted es usuario vip");
        } 
        else if (recomendado && prueba) 
        {
            System.out.println("Usted es usuario vip");
        }
        else
        {
            System.out.println("Usted no es usuario vip");
        }

        sc.close();
    }    
}
