import java.util.Arrays;

public class desordena {
  static void desordena(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      intercambia(arr, i, (int) (Math.random() * arr.length));
    }
  }

  static void intercambia(int[] arr, int pos1, int pos2) {
    int tmp = arr[pos1];
    arr[pos1] = arr[pos2];
    arr[pos2] = tmp;
  }

  public static void mergeSort(int[] array) {
    if (array.length <= 1) {
      return;
    }

    int middle = array.length / 2;
    int[] left = Arrays.copyOfRange(array, 0, middle);
    int[] right = Arrays.copyOfRange(array, middle, array.length);

    mergeSort(left);
    mergeSort(right);

    merge(array, left, right);
  }

  public static void merge(int[] array, int[] left, int[] right) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        array[k] = left[i];
        i++;
      } else {
        array[k] = right[j];
        j++;
      }
      k++;
    }

    while (i < left.length) {
      array[k] = left[i];
      i++;
      k++;
    }

    while (j < right.length) {
      array[k] = right[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    int[] array = new int[10];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 100);
    }

    Arrays.sort(array);
    System.out.println(Arrays.toString(array));

    desordena(array);

    System.out.println(Arrays.toString(array));

    mergeSort(array);

    System.out.println(Arrays.toString(array));

  }
}