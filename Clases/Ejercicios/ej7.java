package Clases.Ejercicios;

import java.util.Scanner;

import Clases.ClasesEJ.Zona;

public class ej7 {
  static Zona principal = new Zona(1000);
  static Zona compraVenta = new Zona(200);
  static Zona vip = new Zona(25);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean seguir = true;
    int op;

    while (seguir) {
      System.out.println("Elija una opción");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender Entradas");
      System.out.println("3. Salir");
      op = sc.nextInt();

      switch (op) {
        case 1:
          mostrarEntradasLibres();
          break;
        case 2:
          System.out.println("Qué tipo de entrada quiere?");
          System.out.println("1. Principal");
          System.out.println("2. Compra Venta");
          System.out.println("3. Vip");
          op = sc.nextInt();
          System.out.println("Cuantas entradas quiere?");
          int nEntradas = sc.nextInt();
          venderEntradas(op, nEntradas);
          break;
        case 3:
          seguir = false;
          break;
        default:
          System.out.println("ERROR - Opción incorrecta");
          break;
      }
    }
    sc.close();
  }

  static void mostrarEntradasLibres() {
    System.out.println("Entradas libres para zona principal: " + principal.getEntradasPorVender());
    System.out.println("Entradas libres para zona compra venta: " + compraVenta.getEntradasPorVender());
    System.out.println("Entradas libres para zona vip: " + vip.getEntradasPorVender());
  }

  static void venderEntradas(int op, int nEntradas) {
    switch (op) {
      case 1:
        principal.vender(nEntradas);
        break;
      case 2:
        compraVenta.vender(nEntradas);
        break;
      case 3:
        vip.vender(nEntradas);
        break;
      default:
        System.out.println("ERROR - ZONA NO DISPONIBLE");
        break;
    }
  }
}
