import java.util.Scanner;

public class ejercicio2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String nombreAt, nombreDef;
        int aciertoDeDos, aciertoDeTres, eficaciaDefensa, tipoTiro;
        double  aciertoFormula, eficaciaFormula;
        Boolean encesta;

        System.out.println("Introduzca el nombre del atacante: ");
        nombreAt = sc.nextLine();

        System.out.println("Introduzca el nombre del defensor: ");
        nombreDef = sc.nextLine();

        System.out.println("Introduzca el porcentaje de aciertos de 2 de " + nombreAt);
        aciertoDeDos = sc.nextInt();

        System.out.println("Introduzca el porcentaje de aciertos de 3 de " + nombreAt);
        aciertoDeTres = sc.nextInt();

        System.out.println("Introduzca la eficacia de " + nombreDef);
        eficaciaDefensa = sc.nextInt();

        System.out.println("El atacante tirará de 2 o de 3? (introduzca un número)");
        tipoTiro = sc.nextInt();

        if (tipoTiro == 2)
        {
            aciertoFormula = (Math.random()*aciertoDeDos);
            eficaciaFormula = (Math.random()*eficaciaDefensa*10);
            encesta = aciertoFormula > eficaciaFormula;

            System.out.println(encesta ? "El jugador " + nombreAt + " ha encestado de 2 (" + aciertoFormula + " > " + eficaciaFormula + ")"
                                       : "El jugador " + nombreAt + " NO ha encestado (" + aciertoFormula + " < " + eficaciaFormula + ")");

        } else if (tipoTiro == 3)
        {
            aciertoFormula = (Math.random()*aciertoDeTres);
            eficaciaFormula = (Math.random()*eficaciaDefensa*10);
            encesta = aciertoFormula > eficaciaFormula;

            System.out.println(encesta ? "El jugador " + nombreAt + " ha encestado de 3 (" + aciertoFormula + " > " + eficaciaFormula + ")"
                                       : "El jugador " + nombreAt + " NO ha encestado (" + aciertoFormula + " < " + eficaciaFormula + ")");
        } else {
            System.out.println("TIPO INCORRECTO");
        }

        sc.close();
    }    
}
