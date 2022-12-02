import Funciones.*;
import java.util.Scanner;

public class ej17_funciones {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un número binario para pasar a decimal");
    int num = sc.nextInt();

    while (mathJuan.aDecimal(num) == -1) {
      System.out.println("Número erróneo, introduzca un número binario");
      num = sc.nextInt();
    }

    System.out.println("El número en binario es: " + mathJuan.aDecimal(num));
  }
}