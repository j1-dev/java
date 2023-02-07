import java.util.Scanner;

public class ej5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numero = new int[10];
    int min = 0, max = 0;

    System.out.println("Introduzca 10 elementos");
    for (int i = 0; i < numero.length; i++) {
      System.out.print(i + " -> : ");
      numero[i] = sc.nextInt();
    }

    for (int i = 0; i < numero.length; i++) {
      if (numero[i] <= numero[min])
        min = i;
      if (numero[i] >= numero[max])
        max = i;
    }

    for (int i = 0; i < numero.length; i++) {
      if (i == min) {
        System.out.println(numero[i] + " <- MINIMO");
      } else if (i == max) {
        System.out.println(numero[i] + " <- MAXIMO");
      } else {
        System.out.println(numero[i]);
      }
    }

  }
}
