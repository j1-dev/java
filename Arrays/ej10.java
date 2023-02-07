import java.util.Arrays;

public class ej10 {
  public static void main(String[] args) {
    int[] nums = new int[20];
    int[] pares = new int[20];
    int[] impares = new int[20];
    int par = 0, impar = 0;

    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 101);
      if (esPrimo(nums[i])) {
        pares[par] = nums[i];
        par++;
      } else {
        impares[impar] = nums[i];
        impar++;
      }
    }

    System.out.println(Arrays.toString(nums));
    System.out.println(par);
    System.out.println(impar);

    for (int i = 0; i < par; i++) {
      nums[i] = pares[i];
    }

    for (int i = 0; i < impar; i++) {
      nums[par + i - 1] = impares[i];
    }

    System.out.println(Arrays.toString(nums));

  }

  public static Boolean esPrimo(int numero) {
    Boolean primo = true;
    int divisores = 0;
    for (int i = 1; i < numero; i++) {
      if (numero % i == 0) {
        divisores++;
      }
    }
    if (divisores > 1) {
      primo = false;
    }
    return primo;
  }
}
