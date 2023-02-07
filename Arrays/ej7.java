import java.util.Scanner;

public class ej7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numero = new int[100];
    int reemplazado, aReemplazar;

    generaAleatorios(numero);

    System.out.println("\nIntroduzca dos valores");
    reemplazado = sc.nextInt();
    aReemplazar = sc.nextInt();

    boolean[] modificados = modificarArray(numero, reemplazado, aReemplazar);

    imprimir(numero, modificados);
  }

  static void generaAleatorios(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 20 + 1);
      System.out.print(arr[i] + " ");
    }
  }

  static boolean[] modificarArray(int[] arr, int numeroBuscado, int numeroNuevo) {
    boolean[] mod = new boolean[arr.length];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == numeroBuscado) {
        arr[i] = numeroNuevo;
        mod[i] = true;
      }
    }
    return mod;
  }

  static void imprimir(int[] arr, boolean[] mod) {
    for (int i = 0; i < arr.length; i++) {
      if (mod[i]) {
        System.out.print("\"" + arr[i] + "\" ");
      } else {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
  }
}
