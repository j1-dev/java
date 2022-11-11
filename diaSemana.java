import java.util.Scanner;

public class diaSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduzca un numero del 1 al 7");

        num = sc.nextInt();

        sc.close();

        if(num==1)
            System.out.println("el día 1 es lunes");
        else if (num==2)
            System.out.println("el día 2 es martes");
        else if (num==3)
            System.out.println("el día 3 es miércoles");
        else if (num==4)
            System.out.println("el día 4 es jueves");
        else if (num==5)
            System.out.println("el día 5 es viernes");
        else if (num==6)
            System.out.println("el día 6 es sábado");
        else if (num==7)
            System.out.println("el día 7 es domingo");
        else
            System.out.println();

    }
}
