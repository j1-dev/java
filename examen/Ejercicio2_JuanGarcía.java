import java.util.Scanner;

public class Ejercicio2_JuanGarcía {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca la cadena");
    String cadena = sc.nextLine();

    System.out.println("Introduzca la altura");
    int altura = sc.nextInt();
    int anchura = cadena.length() + 4; // la anchura será el ancho de la cadena + 4 (2 X por cada lado)

    sc.close();

    // Bucle que imprime el cuadrilátero A-H
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < anchura; j++) {
        if (i % 2 == 0) {
          System.out.print("A");
        } else {
          System.out.print("H");
        }
      }
      System.out.println();
    }

    // Se imprime la cadena con 2 x a cada lado
    System.out.println("XX" + cadena + "XX");

    // Se vuelve a imprimir el cuadrilátero igual que al principio (se podría usar
    // una función)
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < anchura; j++) {
        if (i % 2 != 0) {
          System.out.print("A");
        } else {
          System.out.print("H");
        }
      }
      System.out.println();
    }

  }
}
