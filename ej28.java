import java.util.Scanner;

public class ej28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Turno1: Introduzca piedra, papel o tijeras:");
        String respuesta1 = sc.nextLine();

        String [] respuestas = {"piedra", "papel", "tijeras"};
        int respRandom = (int)(Math.random()*3);

        String respuesta2 = respuestas[respRandom];
        System.out.println("Turno2: Introduzca piedra, papel o tijeras: " + respuesta2);

        sc.close();

        if(respuesta1.equals("piedra")){

            if(respuesta2.equals("piedra"))
            {
                System.out.println("empate");
            } 
            else if(respuesta2.equals("papel"))
            {
                System.out.println("gana el jugador 2");
            } 
            else if(respuesta2.equals("tijeras"))
            {
                System.out.println("gana el jugador 1");
            }
        } 
        else if(respuesta1.equals("papel"))
        {
            if(respuesta2.equals("piedra"))
            {
                System.out.println("gana el jugador 1");
            } 
            else if(respuesta2.equals("papel"))
            {
                System.out.println("empate");
            } 
            else if(respuesta2.equals("tijeras"))
            {
                System.out.println("gana el jugador 2");
            }
        } 
        else if(respuesta1.equals("tijeras"))
        {
            if(respuesta2.equals("piedra"))
            {
                System.out.println("gana el jugador 2");
            } 
            else if(respuesta2.equals("papel"))
            {
                System.out.println("gana el empate 1");
            } 
            else if(respuesta2.equals("tijeras"))
            {
                System.out.println("empate 2");
            }
        }
    }
}