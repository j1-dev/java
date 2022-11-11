import java.util.Scanner;

public class ejercicio3 {
    /*
        Realiza un programa que muestre dos números aleatorios (1 a 99) y una operación al azar (suma, resta, multiplicación). 
        EL usuario debe introducir el resultado y la aplicación indicar si el resultado ha sido correcto o no.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, op;
        char opChar;
        float resultado, resultadoCorrecto;

        num1 = (int)(Math.random()*99)+1;
        num2 = (int)(Math.random()*99)+1;
        op = (int)(Math.random()*3);

        switch (op) {
            case 0:
                opChar = '+';
                break;
            case 1:
                opChar = '-';
                break;
            case 2:
                opChar = '*';
                break;
            default:
                opChar = ' ';
                break;
        }

        System.out.println("La operación al azar es " + num1 + " " + opChar + " " + num2);
        resultado = sc.nextFloat();

        sc.close();

        switch (op) {
            case 0:
                resultadoCorrecto = num1 + num2;
                break;
            case 1:
                resultadoCorrecto = num1 - num2;
                break;
            case 2:
                resultadoCorrecto = num1 * num2;
                break;
            default:
                resultadoCorrecto = -1;
                break;
        }

        if(resultado == resultadoCorrecto){
            System.out.println("Ha acertado");
        } else {
            System.out.println("Ha fallado");
        }
    }
}
