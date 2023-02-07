import java.util.Scanner;

public class ej15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] mesas = new int[10];
    int clientes = 0, mesa = 0;
    boolean[] comparte = new boolean[1];

    for (int i = 0; i < mesas.length; i++) {
      mesas[i] = (int) (Math.random() * 5);
    }

    imprimir(mesas);

    do {
      comparte[0] = false;
      System.out.print("Cuantos son? (Intoduzca -1 para salir del programa): ");
      clientes = sc.nextInt();
      if (clientes != -1 && clientes >= 0 && clientes <= 4) {
        mesa = buscarMesa(mesas, clientes, comparte);
        if (mesa != -1) {
          if (!comparte[0]) {
            System.out.println("Por favor, siéntese en la mesa número " + (mesa + 1));
            mesas[mesa] += clientes;
          } else {
            System.out.println("Tendrán que compartir mesa. Por favor, siéntese en la mesa " + (mesa + 1));
            mesas[mesa] += clientes;
          }
        } else {
          System.out.println("Lo siento, en estos momomentos no quea sitio");
        }
        imprimir(mesas);

      } else if (clientes < 0 || clientes > 4) {
        System.out.println("No tenemos sitio para grupos mayores de 4 personas");
      }

    } while (clientes != -1);

    System.out.println("Gracias. Hasta pronto.");
    sc.close();
  }

  static void imprimir(int[] arr) {
    System.out.print(
        "┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐\n│Mesa no  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤\n|Ocupación|");

    for (int i = 0; i < arr.length; i++) {
      System.out.print(" " + arr[i] + "  |");
    }

    System.out.println("\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘\n");
  }

  static int buscarMesa(int[] arr, int cli, boolean[] comparte) {
    int mesa = -1;

    if (cli <= 4) {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
          mesa = i;
          return mesa;
        }
      }

      for (int i = 0; i < arr.length; i++) {
        if (arr[i] + cli <= 4) {
          mesa = i;
          comparte[0] = true;
          return mesa;
        }
      }
    }

    return mesa;
  }
}