import java.util.Scanner;

public class ej8 {
  static String[] MESES = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int[] temps = new int[12];

    System.out.println("INTRODUZCA LA TEMPERATURA QUE HA HECHO ESTE AÑO CADA MES");

    leer(temps);

    imprimir(temps);
  }

  static void leer(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(MESES[i] + ": ");
      arr[i] = sc.nextInt();
    }
  }

  static void imprimir(int[] arr) {
    System.out.println("\n**GRAFICO DE LAS TEMPERATURAS**\n");

    for (int i = 0; i < arr.length; i++) {
      System.out.print(MESES[i] + "\t");
      for (int j = 0; j < arr[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
