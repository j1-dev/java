import java.util.Arrays;
import java.util.Scanner;

public class testArrayLib {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // Se debe crear una array de numero de 10 posiciones y
    // tendré que mostrar un menu con acciones que se deben realizar con el array

    int[] numeros = new int[10];
    int[] copiaNumeros = null;
    int valor = 0, pos = 0;

    boolean salir = false;
    do {
      int opcion = menu();

      switch (opcion) {
        case 1:
          limpiarArray(numeros);
          break;
        case 2:
          sc.nextLine(); // limpio buffer
          System.out.println("¿Que número desea insertar?");
          int numero = sc.nextInt();
          System.out.println("¿en que posicion?");
          int posicion = sc.nextInt();
          insertar(numeros, numero, posicion);
          break;
        case 3:
          imprimir(numeros);
          break;
        case 4:
          borrar(numeros);
          break;
        case 5:
          llenar(numeros);
          break;
        case 6:
          llenarConAleatorios(numeros);
          break;
        case 7:
          int posicionBusqueda = buscar(numeros);
          System.out.println("EL numero está en la posición: " + posicionBusqueda);
          break;
        case 8:
          ordenar(numeros);
          break;
        case 9:
          posicionBusqueda = buscarEnTablaOrdenada(numeros);
          System.out.println("EL numero está en la posición: " + posicionBusqueda);
          break;
        case 10:
          desordena(numeros);
          break;
        case 11:
          System.out.println("Indica el valor que quiere insertar");
          valor = sc.nextInt();
          numeros = insertaAlFinal(numeros, valor);
          break;
        case 12:
          System.out.println("Indica el valor que quiere insertar");
          valor = sc.nextInt();
          System.out.println("Indica la posición donde quiere insertar");
          pos = sc.nextInt();
          numeros = insertaEnPosicion(numeros, valor, pos);
          break;
        case 13:
          numeros = borrarAlFinal(numeros);
          break;
        case 14:
          System.out.println("Indica la posición donde quiere borrar");
          pos = sc.nextInt();
          numeros = borrarEnPosicion(numeros, pos);
          break;
        case 0:
          salir = true;
          sc.close();
          break;
        default:
          System.out.println("Opción no Valida");
          break;

      }

    } while (!salir);
  }

  static int menu() {
    System.out.println("---------");
    System.out.println("1- Limpiar Array");
    System.out.println("2- Almacenar nuevo número");
    System.out.println("3- Imprimir Array");
    System.out.println("4- Borrar Elemento");
    System.out.println("5- Llenar con valores fijos (10) ");

    System.out.println("6- Llenar con valores aleatorios");
    System.out.println("7- Buscar un valor- devuelve la posición en la que esta -1 si no está");
    System.out.println("8- Ordenar");
    System.out.println("9- Busqueda en tabla ordenada");
    System.out.println("10- Desordenar array");
    System.out.println("11- Insertar valor al final");
    System.out.println("12- Insertar valor en posición");
    System.out.println("13- Borrar último elemento");
    System.out.println("14- Borrar elemento en posición");

    System.out.println("0- Salir");

    System.out.println("____________________________");
    System.out.println("Indica una opción...");
    int opcion = sc.nextInt();

    return opcion;
  }

  /**
   * Borra todos los valores del array que se le pasa
   * 
   * @param tabla
   */
  static void limpiarArray(int[] tabla) {
    for (int i = 0; i < tabla.length; i++) {
      tabla[i] = 0;
    }
  }

  /**
   * Inserta en la tabla y en la posicicion indicada el nombre nuevo
   * 
   * @param tabla
   * @param nuevoNombre
   * @param posicion
   */
  static void insertar(int[] tabla, int nuevoNumero, int posicion) {
    if (tabla.length > posicion && posicion >= 0) {
      tabla[posicion] = nuevoNumero;
    } else {
      // La posicion que me indican no es posible
      System.out.println("Posicion no válida, debe indicar un numero entre 0 y " + (tabla.length - 1));
    }
  }

  static void imprimir(int[] tabla) {
    // int indice = 0;
    // for (String nombre : tabla) {
    // System.out.println(" [" + indice + "] -> " + nombre );
    // indice++;
    // }

    System.out.println(Arrays.toString(tabla));
  }

  /**
   * Borra de un array una posición en concreto
   * 
   * @param tabla
   */
  static void borrar(int[] tabla) {
    System.out.println("¿Qué posición quieres borrar?...");
    int posicion = sc.nextInt();

    if (tabla.length > posicion && posicion >= 0) {
      tabla[posicion] = 0;
      System.out.println("numero borrado correctamente");
    } else {
      // hay error de posicion
      System.out.println("ERROR - posicion fuera de rango");
    }
  }

  /**
   * Lleno la tabla con valores fijos - el valor 10
   * 
   * @param tabla
   */
  static void llenar(int[] tabla) {
    // for (int i = 0; i < tabla.length; i++) {
    // tabla [i] = "Posicion " + i;
    // }

    Arrays.fill(tabla, 10);

  }

  /**
   * Llena el array que se le pasa con valores aleatorios de 0 a 99
   * 
   * @param tabla
   */
  static void llenarConAleatorios(int[] tabla) {
    for (int aux = 0; aux < tabla.length; aux++) {
      int aleatorio = (int) (Math.random() * 100);
      tabla[aux] = aleatorio;
    }
  }

  /**
   * Buscar un valor- devuelve la posición en la que esta -1 si no está
   * 
   * @param tabla
   * @return
   */
  static int buscar(int[] tabla) {
    int resultado = -1;

    System.out.println("¿Que valor quieres buscar?...");
    int numeroBuscado = sc.nextInt();

    int indiceBusqueda = 0;
    while (resultado == -1 && indiceBusqueda < tabla.length) {
      int numeroEnPosicion = tabla[indiceBusqueda];
      if (numeroBuscado == numeroEnPosicion) {
        // si lo he encontrado entoces el resultado es la
        // posicion de busqueda en la que estoy
        resultado = indiceBusqueda;
      }
      indiceBusqueda++;
    }

    return resultado;
  }

  static void ordenar(int[] tabla) {
    Arrays.sort(tabla);
  }

  static int buscarEnTablaOrdenada(int[] tabla) {
    System.out.println("¿Que valor quieres buscar?...");
    int valorBuscado = sc.nextInt();

    int resultado = Arrays.binarySearch(tabla, valorBuscado);

    return resultado;
  }

  /**
   * Desordena el array
   * 
   * @param tabla
   */
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

  static int[] copiaArray(int[] original) {
    // Forma manual
    // int[] copia = new int[original.length];

    // for (int i = 0; i < original.length; i++) {
    // copia[i] = original[i];
    // }

    // return copia;
    return Arrays.copyOf(original, original.length);
  }

  static int[] insertaAlFinal(int[] arr, int valor) {
    int[] newArr = Arrays.copyOf(arr, arr.length + 1);
    newArr[arr.length] = valor;
    return newArr;
  }

  static int[] borrarAlFinal(int[] arr) {
    return Arrays.copyOf(arr, arr.length - 1);
  }

  static int[] insertaEnPosicion(int[] arr, int valor, int pos) {
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

  static int[] borrarEnPosicion(int[] arr, int pos) {
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
}