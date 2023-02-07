import java.util.Scanner;

public class Ejercicio2_JuanGarciaMarin {
  static Scanner sc = new Scanner(System.in);
  static String[] frutasArray = new String[0];
  static double[] preciosArray = new double[0];
  static double[] cantidadVendidaArray = new double[0];

  public static void main(String[] args) {

    String opcion = "";
    String fruta;
    double precio;
    double cantidad;
    boolean seguir = true;

    do {
      opcion = menu();
      switch (opcion) {
        case "a":
          System.out.println("Introduzca el nombre de la fruta");
          fruta = sc.nextLine().toLowerCase();
          insertarFruta(fruta);
          break;
        case "b":
          System.out.println("Que fruta ha vendido?");
          fruta = sc.nextLine().toLowerCase();
          System.out.println("Cuanta fruta ha vendido?");
          cantidad = sc.nextDouble();
          sc.nextLine();
          anadirCompra(fruta, cantidad);
          break;
        case "c":
          System.out.println("A que fruta le gustaria cambiar el precio?");
          fruta = sc.nextLine().toLowerCase();
          System.out.println("Que precio le quiere poner?");
          precio = sc.nextDouble();
          sc.nextLine();
          modificarPrecioFruta(fruta, precio);
          break;
        case "d":
          System.out.println("Precios modificados");
          modificarPreciosConMedia();
          break;
        case "e":
          informe();
          break;
        case "x":
          seguir = false;
          break;

      }
      System.out.println();
    } while (seguir);

  }

  // Metodo que muestra el menu

  static String menu() {
    System.out.println("a - Insertar fruta");
    System.out.println("b - Añadir compra");
    System.out.println("c - modificar precio fruta");
    System.out.println("d - Modificar todos los precios");
    System.out.println("e - mostrar informe");
    System.out.println("x - salir");
    System.out.println("---------------------------------------------");
    System.out.println(" Indique opción...");
    System.out.println();
    String opcion = sc.nextLine();
    return opcion;
  }

  // Metodo para insertar frutas utilizando los metodos de utilidad

  static void insertarFruta(String fruta) {
    frutasArray = insertarAlFinal(frutasArray, fruta);
    preciosArray = insertarAlFinal(preciosArray, 1);
    cantidadVendidaArray = insertarAlFinal(cantidadVendidaArray, 0);
  }

  // Metodo para anadir fruta aniadida al array

  static void anadirCompra(String fruta, double cantidad) {
    for (int i = 0; i < frutasArray.length; i++) {
      if (frutasArray[i].equals(fruta)) {
        cantidadVendidaArray[i] += cantidad;
      }
    }
  }

  // Metodo para modificar el precio de una fruta en especifico

  static void modificarPrecioFruta(String fruta, double precio) {
    for (int i = 0; i < frutasArray.length; i++) {
      if (frutasArray[i].equals(fruta)) {
        preciosArray[i] = precio;
      }
    }
  }

  // Metodo para modificar el precio segun la media

  static void modificarPreciosConMedia() {
    double media = media(cantidadVendidaArray);
    for (int i = 0; i < cantidadVendidaArray.length; i++) {
      if (cantidadVendidaArray[i] > media) {
        preciosArray[i] += 0.25d;
      } else {
        preciosArray[i] -= 0.15d;
      }
    }
  }

  // Metodo para imprimir el informe

  static void informe() {
    double media = media(cantidadVendidaArray);
    double totalCantidad = 0, totalGanancia = 0;
    String indicador = "";

    System.out.println("\t\tPrecio\tCantidad\tGanancia");
    for (int i = 0; i < frutasArray.length; i++) {
      if (cantidadVendidaArray[i] > media) {
        indicador = "(+)";
      } else if (cantidadVendidaArray[i] < media) {
        indicador = "(-)";
      } else {
        indicador = "(=)";
      }
      System.out.println("Fruta: " + frutasArray[i] + "\t" + preciosArray[i] + "\t" + cantidadVendidaArray[i] + "\t\t"
          + cantidadVendidaArray[i] * preciosArray[i] + " " + indicador);
      totalCantidad += cantidadVendidaArray[i];
      totalGanancia += cantidadVendidaArray[i] * preciosArray[i];
    }
    System.out.println("---------------------------------------------");

    System.out.println("\t\t\t" + totalCantidad + "\t\t" + totalGanancia);
  }

  // Metodo para calcular la media

  static double media(double[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum / arr.length;
  }

  // METODOS DE UTILIDAD PARA INSERTAR

  public static String[] insertarAlFinal(String[] arr, String valor) {
    return insertarEnPosicion(arr, valor, arr.length);
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

  public static double[] insertarAlFinal(double[] arr, double valor) {
    return insertarEnPosicion(arr, valor, arr.length);
  }

  public static double[] insertarEnPosicion(double[] arr, double valor, int pos) {
    if (pos >= 0 && pos <= arr.length) {
      double[] newArr = new double[arr.length + 1];
      System.arraycopy(arr, 0, newArr, 0, pos);
      newArr[pos] = valor;
      System.arraycopy(arr, pos, newArr, pos + 1, arr.length - pos);

      return newArr;
    } else {
      System.out.println("Posición invalida");
      return arr;
    }
  }

}
