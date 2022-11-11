import java.util.Scanner;

/*
    Diseñar algoritmo que nos indique si podemos salir a la calle. Debemos tener en cuenta 
    para tomar esa decisión los siguientes aspectos: Si esta lloviendo o no, si hemos terminado 
    nuestras tareas. Existe una opción en la que indistintamente de lo anterior, podemos salir a la
    calle, es que vayamos a ir a la biblioteca ( a realizar algún trabajo o estudiar). 
    El programa debe pedir al usuario si llueve, si ha finalizado las tareas y si necesita ir a 
    la biblioteca y mostrar si puede o no ir a la biblioteca.
*/

public class ej12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean llueve, fin_tareas, ir_biblioteca;

        System.out.println("Esta lloviendo?");
        llueve = sc.nextBoolean();

        System.out.println("Has terminado las tareas?");
        fin_tareas = sc.nextBoolean();

        System.out.println("Tienes que ir a la biblioteca?");
        ir_biblioteca = sc.nextBoolean();

        System.out.println((ir_biblioteca || (!llueve && fin_tareas)) ? "Puedes salir" : "No puedes salir");

        sc.close();
    }    
}
