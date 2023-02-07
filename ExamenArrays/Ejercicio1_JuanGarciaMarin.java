import java.util.Arrays;

public class Ejercicio1_JuanGarciaMarin {
  public static void main(String[] args) {
    int[] array = { 4, 6, 8, 4, 2, 3, 6, 9, 11, 6, 5, 9, 10, 13, 8, 3, 6, 5, 2, 1, 6, 6, 8, 4 };
    int[] arrayFinal = new int[array.length];
    int max = maximo(array) + 1; // El proximo numero que deberemos incluir es el primer maximo mas 1

    System.out.println(max);

    for (int i = 0; i < array.length; i++) {
      int numCheck = array[i]; // numCheck sirve para ser comparado con todos los elementos que estan por
                               // delante de el
      arrayFinal[i] = numCheck; // Lo aniadimos al array final para poder empezar el segundo bucle desde i mas 1
      for (int j = i + 1; j < array.length; j++) {
        // Si el numero que estamos comprobando en el bucle interior es igual al numero
        // que estamos checkeando
        // significa que esta repetido, entonces lo cambiamos por max y le sumamos 1, si
        // no el numero se queda igual
        if (array[j] == numCheck) {
          arrayFinal[j] = max;
          max += 1;
        } else {
          arrayFinal[j] = array[j];
        }
      }
      array = arrayFinal;
      System.out.println(Arrays.toString(arrayFinal));

    }

    System.out.println(Arrays.toString(arrayFinal));

  }

  public static int maximo(int[] arr) {
    int max = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= max) {
        max = arr[i];
      }
    }

    return max;
  }
}
