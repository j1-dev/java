import java.util.Scanner;

public class Ejercicio1_JuanGarcía {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion = 0, numPlatos = 0;
    double precioTotal = 0;
    String comanda = "";

    // Uso 3 strings distintos para ir almacenando los pedidos de cada categoría y
    // si al final alguno está vacío no se muestra
    String comandaPrimeros = "", comandaSegundos = "", comandaPostres = "";

    final double PLATO1 = 5;
    final double PLATO2 = 4;
    final double PLATO3 = 4.5;
    final double PLATO4 = 6;
    final double PLATO5 = 8;
    final double PLATO6 = 9;
    final double PLATO7 = 5;
    final double PLATO8 = 1.5;
    final double PLATO9 = 1.25;
    final double PLATO10 = 2;

    System.out.println(" *** RESTAURANTE VEGA DE MIJAS ****");
    System.out.println(" ----------------------------------");
    System.out.println("Primeros platos");
    System.out.println(" 1. Salmorejo (5€)");
    System.out.println(" 2. Sopa picadillo (4€)");
    System.out.println(" 3. Ensalada de atún (4.5€)");
    System.out.println("Segundos platos");
    System.out.println(" 4. Paella (6€)");
    System.out.println(" 5. Salmón (8€)");
    System.out.println(" 6. Codillo al horno (9€)");
    System.out.println(" 7. Lentejas (5€)");
    System.out.println("Postres");
    System.out.println(" 8. Fruta (1.5€)");
    System.out.println(" 9. Café (1.25€)");
    System.out.println("10. Helado (2€)");
    System.out.println();
    System.out.println();
    System.out.println("0. SALIR (Imprimir Ticket + FIN) ");

    comanda += "--------------------------------\n";
    do {
      System.out.println("Selecciona la opción deseada por el cliente...");
      opcion = sc.nextInt();

      // Pregunta por la cantidad de platos solo si la opción elegida es valida
      if (opcion > 0 && opcion <= 10) {
        System.out.println("Elija el número de platos");
        numPlatos = sc.nextInt();
      }

      switch (opcion) {
        case 0:
          System.out.println("A continuación se imprimirá el ticket");
        case 1:
          comandaPrimeros += "Salmorejo x " + numPlatos + "\n";
          precioTotal += PLATO1 * numPlatos;
          break;
        case 2:
          comandaPrimeros += "Sopa picadillo x " + numPlatos + "\n";
          precioTotal += PLATO2 * numPlatos;
          break;
        case 3:
          comandaPrimeros += "Ensalada de atún x " + numPlatos + "\n";
          precioTotal += PLATO3 * numPlatos;
          break;
        case 4:
          comandaSegundos += "Paella x " + numPlatos + "\n";
          if (numPlatos > 2) {
            precioTotal += (PLATO4 - 1) * numPlatos;
          } else {
            precioTotal += PLATO4 * numPlatos;
          }
          break;
        case 5:
          comandaSegundos += "Salmón x " + numPlatos + "\n";
          if (numPlatos > 2) {
            precioTotal += (PLATO5 - 1) * numPlatos;
          } else {
            precioTotal += PLATO5 * numPlatos;
          }
          break;
        case 6:
          comandaSegundos += "Codillo al horno x " + numPlatos + "\n";
          if (numPlatos > 2) {
            precioTotal += (PLATO6 - 1) * numPlatos;
          } else {
            precioTotal += PLATO6 * numPlatos;
          }
          break;
        case 7:
          comandaSegundos += "Lentejas x " + numPlatos + "\n";
          if (numPlatos > 2) {
            precioTotal += (PLATO7 - 1) * numPlatos;
          } else {
            precioTotal += PLATO7 * numPlatos;
          }
          break;
        case 8:
          comandaPostres += "Fruta x " + numPlatos + "\n";
          precioTotal += PLATO8 * numPlatos;
          break;
        case 9:
          comandaPostres += "Café x " + numPlatos + "\n";
          precioTotal += PLATO9 * numPlatos;
          break;
        case 10:
          comandaPostres += "helado x " + numPlatos + "\n";
          precioTotal += PLATO10 * numPlatos;
          break;
        default:
          System.out.println("Opción incorrecta");
      }
    } while (opcion != 0);

    sc.close();

    if (comandaPrimeros != "") {
      comanda += "** Primeros platos \n" + comandaPrimeros + "\n";
    }
    if (comandaSegundos != "") {
      comanda += "** Segundos platos \n" + comandaSegundos + "\n";
    }
    if (comandaPostres != "") {
      comanda += "** Postres \n" + comandaPostres + "\n";
    }

    if (precioTotal >= 20 && precioTotal < 30) {
      precioTotal -= 2;
    } else if (precioTotal >= 30 && precioTotal < 50) {
      precioTotal -= 3;
    } else if (precioTotal >= 50) {
      precioTotal -= 5;
    }

    comanda += "TOTAL A PAGAR " + precioTotal + "\n";
    comanda += "--------------------------------\n";

    System.out.println(comanda);
  }
}