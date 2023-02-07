import java.util.Arrays;
import java.util.Scanner;

public class ej6 {
  public static void main(String[] args) {
    int[] numero = new int[15];

    rellena(numero);

    System.out.println(Arrays.toString(numero));

    rotar(numero);

    System.out.println(Arrays.toString(numero));

  }

  static void rotar(int[] arr) {
    int tmp = arr[arr.length - 1];

    for (int i = arr.length - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }

    arr[0] = tmp;
  }

  static void rellena(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 100);
    }
  }
}
