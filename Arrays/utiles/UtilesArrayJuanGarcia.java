package utiles;

import java.util.Arrays;

public class UtilesArrayJuanGarcia {
  public static int[] limpiar(int[] array) {
    int[] newArr = new int[0];
    return newArr;
  }

  public static int[] rellenar(int[] array, int numeroElementos) {
    int[] newArray = new int[numeroElementos];
    return newArray;
  }

  public static int[] rellenar(int[] array, int numeroElementos, int valor) {
    int[] newArray = rellenar(array, numeroElementos);

    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = valor;
    }

    return newArray;
  }

  public static int[] insertarAlFinal(int[] arr, int valor) {
    return insertarEnPosicion(arr, valor, arr.length);
  }

  public static String[] insertarAlFinal(String[] arr, String valor) {
    return insertarEnPosicion(arr, valor, arr.length);
  }

  public static int[] insertarAlPrincipio(int[] arr, int valor) {
    return insertarEnPosicion(arr, valor, 0);
  }

  public static String[] insertarAlPrincipio(String[] arr, String valor) {
    return insertarEnPosicion(arr, valor, 0);
  }

  public static int[] insertarEnPosicion(int[] arr, int valor, int pos) {
    if (pos >= 0 && pos <= arr.length) {
      int[] newArr = new int[arr.length + 1];
      System.arraycopy(arr, 0, newArr, 0, pos);
      newArr[pos] = valor;
      System.arraycopy(arr, pos, newArr, pos + 1, arr.length - pos);

      return newArr;
    } else {
      System.out.println("Posición invalida");
      return arr;
    }
  }

  public static String[] insertarEnPosicion(String[] arr, String valor, int pos) {
    if (pos >= 0 && pos <= arr.length) {
      String[] newArr = new String[arr.length + 1];
      System.arraycopy(arr, 0, newArr, 0, pos);
      newArr[pos] = valor;
      System.arraycopy(arr, pos, newArr, pos + 1, arr.length - pos);

      return newArr;
    } else {
      System.out.println("Posición invalida");
      return arr;
    }
  }

  public static int[] insertarOrdenado(int[] arr, int valor) {
    int[] newArr = new int[arr.length + 1];

    if (estaOrdenado(arr)) {
      for (int i = 0; i < arr.length; i++) {
        if (valor >= arr[i]) {
          newArr[i] = arr[i];
        } else if (valor > arr[i - 1] && valor < arr[i]) {
          newArr[i] = valor;
        } else {
          newArr[i] = arr[i - 1];
        }
      }
    }
    newArr[newArr.length - 1] = arr[arr.length - 1];

    return newArr;
  }

  public static int[] eliminarUltimo(int[] arr) {
    return eliminar(arr, arr.length - 1);
  }

  public static int[] eliminarPrimero(int[] arr) {
    return eliminar(arr, 0);
  }

  public static int[] eliminar(int[] arr, int pos) {
    if (pos >= 0 && pos <= arr.length) {
      int[] newArr = new int[arr.length - 1];
      System.arraycopy(arr, 0, newArr, 0, pos);
      System.arraycopy(arr, pos + 1, newArr, pos, arr.length - pos - 1);
      return newArr;
    } else {
      System.out.println("Posición invalida");
      return arr;
    }
  }

  public static int[] desordena(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      intercambia(arr, i, (int) (Math.random() * arr.length));
    }
    return arr;
  }

  public static void intercambia(int[] arr, int pos1, int pos2) {
    int tmp = arr[pos1];
    arr[pos1] = arr[pos2];
    arr[pos2] = tmp;
  }

  public static int[] ordena(int[] array) {
    if (array.length <= 1) {
      return array;
    }

    int middle = array.length / 2;
    int[] left = Arrays.copyOfRange(array, 0, middle);
    int[] right = Arrays.copyOfRange(array, middle, array.length);

    ordena(left);
    ordena(right);

    return merge(array, left, right);
  }

  public static int[] merge(int[] array, int[] left, int[] right) {
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

    return array;
  }

  public static int[] invertir(int[] arr) {
    int[] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[arr.length - i - 1] = arr[i];
    }
    return newArr;
  }

  public static void imprimir(int[] arr) {
    System.out.println(Arrays.toString(arr));
  }

  public static boolean estaOrdenado(int[] arr) {
    boolean ordered = true;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        ordered = false;
      }
    }

    return ordered;
  }

  public static int buscar(int[] arr, int valor) {
    int pos = -1;

    for (int i = 0; i < arr.length && pos != -1; i++) {
      if (arr[i] == valor) {
        pos = i;
      }
    }

    return pos;
  }

  public static int[] partirPor(int[] arr, int posicionInicial, int posicionFinal) {
    if (posicionInicial < posicionFinal && posicionInicial >= 0 && posicionFinal <= arr.length) {
      int[] newArr = new int[posicionFinal - posicionInicial + 1];

      for (int i = posicionInicial; i <= posicionFinal; i++) {
        newArr[i - posicionInicial] = arr[i];
      }

      return newArr;
    } else {
      System.out.println("Posición inválida");
      return arr;
    }
  }

  public static boolean sonIguales(int[] arr1, int[] arr2) {
    return arr1.equals(arr2);
  }

  public static boolean elementosIguales(int[] arr1, int[] arr2, int posicionAComparar) {
    return (arr1[posicionAComparar] == arr2[posicionAComparar]);
  }

  public static void main(String[] args) {
    int[] array = { 4, 2, 5, 7, 2, 3, 4, 7 };

    System.out.println("BORRAR ARRAY");
    System.out.println("ANTES: ");
    imprimir(array);
    System.out.println("DESPUES: ");
    array = limpiar(array);
    imprimir(array);

    System.out.println("RELLENA ARRAY CON VALOR:");
    array = rellenar(array, 7, 10);
    imprimir(array);

    System.out.println("INSERTA AL FINAL:");
    array = insertarAlFinal(array, 99);
    imprimir(array);

    System.out.println("INSERTAR AL PRINCIPIO:");
    array = insertarAlPrincipio(array, 99);
    imprimir(array);

    System.out.println("INSERTAR EN POSICION X:");
    array = insertarEnPosicion(array, 99, 4);
    imprimir(array);

    System.out.println("BORRAR AL FINAL:");
    array = eliminarUltimo(array);
    imprimir(array);

    System.out.println("BORRAR AL PRINCIPIO:");
    array = eliminarPrimero(array);
    imprimir(array);

    System.out.println("BORRAR EN POSICION X:");
    array = eliminar(array, 3);
    imprimir(array);

    System.out.println("CREAR ARRAY RANDOM DE LONGITUD 10");
    array = limpiar(array);
    for (int i = 0; i < 10; i++) {
      array = insertarAlPrincipio(array, (int) (Math.random() * 100));
    }
    imprimir(array);

    System.out.println("ORDENAR:");
    array = ordena(array);
    imprimir(array);

    System.out.println("INSERTAR ORDENADO:");
    array = insertarOrdenado(array, 55);
    imprimir(array);

    System.out.println("INVERTIR:");
    array = invertir(array);
    imprimir(array);

    System.out.println("DESORDENAR:");
    array = desordena(array);
    imprimir(array);

    System.out.println("PARTIR ARRAY");
    array = partirPor(array, 1, 8);
    imprimir(array);

  }

}
