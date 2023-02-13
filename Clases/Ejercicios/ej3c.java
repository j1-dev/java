package Clases.Ejercicios;

import Clases.ClasesEJ.Disco;
import java.util.Scanner;

public class ej3c {
  public static void main(String[] args) {
    // N determina el tamaño del array
    final int N = 100;

    // Crea el array de discos
    Disco[] discos = new Disco[N];

    // Crea todos los discos que van en cada una de las celdas del array
    for (int i = 0; i < N; i++) {
      discos[i] = new Disco();
    }

    // Carga varios discos
    Disco d1 = new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
    Disco d2 = new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46);
    Disco d3 = new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

    discos = insertarAlFinal(discos, d1);
    discos = insertarAlFinal(discos, d2);
    discos = insertarAlFinal(discos, d3);

    int opcion;
    Scanner s = new Scanner(System.in);
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int duracionIntroducida;

    do {
      System.out.println("\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
        case 1:
          System.out.println("\nLISTADO");
          System.out.println("=======");

          for (Disco d : discos) {
            if (!d.getCodigo().equals("LIBRE")) {
              System.out.println(d);
            }
          }

          break;

        case 2:
          System.out.println("\nNUEVO DISCO");
          System.out.println("===========");

          System.out.println("Por favor, introduzca los datos del disco.");
          System.out.print("Código: ");
          codigoIntroducido = s.nextLine();
          System.out.print("Autor: ");
          autorIntroducido = s.nextLine();
          System.out.print("Título: ");
          tituloIntroducido = s.nextLine();
          System.out.print("Género: ");
          generoIntroducido = s.nextLine();
          System.out.print("Duración: ");
          duracionIntroducida = Integer.parseInt(s.nextLine());
          Disco nuevo = new Disco(
              codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida);

          discos = insertarAlFinal(discos, nuevo);
          break;

        case 3:
          System.out.println("\nMODIFICAR");
          System.out.println("===========");

          System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
          codigoIntroducido = s.nextLine();

          int pos = checkCodigo(discos, codigoIntroducido);

          if (pos != -1) {
            System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

            System.out.println("Código: " + discos[pos].getCodigo());
            System.out.print("Nuevo código: ");
            codigoIntroducido = s.nextLine();
            if (!codigoIntroducido.equals("")) {
              discos[pos].setCodigo(codigoIntroducido);
            }

            System.out.println("Autor: " + discos[pos].getAutor());
            System.out.print("Nuevo autor: ");
            autorIntroducido = s.nextLine();
            if (!autorIntroducido.equals("")) {
              discos[pos].setAutor(autorIntroducido);
            }

            System.out.println("Título: " + discos[pos].getTitulo());
            System.out.print("Nuevo título: ");
            tituloIntroducido = s.nextLine();
            if (!tituloIntroducido.equals("")) {
              discos[pos].setTitulo(tituloIntroducido);
            }

            System.out.println("Género: " + discos[pos].getGenero());
            System.out.print("Nuevo género: ");
            generoIntroducido = s.nextLine();
            if (!generoIntroducido.equals("")) {
              discos[pos].setGenero(generoIntroducido);
            }

            System.out.println("Duración: " + discos[pos].getDuracion());
            System.out.print("Duración: ");
            final String duracionIntroducidaString = s.nextLine();
            if (!duracionIntroducidaString.equals("")) {
              discos[pos].setDuracion(Integer.parseInt(duracionIntroducidaString));
            }
          } else {
            System.out.println("Codigo incorrecto");
          }

          break;

        case 4:
          System.out.println("\nBORRAR");
          System.out.println("======");

          System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
          codigoIntroducido = s.nextLine();

          pos = checkCodigo(discos, codigoIntroducido);

          if (pos != -1) {
            discos = eliminar(discos, pos);
            System.out.println("Album borrado.");
          } else {
            System.out.println("Código incorrecto");
          }

          break;

        default:

      } // switch
    } while (opcion != 5);
    s.close();
  }

  public static Disco[] insertarEnPosicion(Disco[] arr, Disco valor, int pos) {
    if (pos >= 0 && pos <= arr.length) {
      Disco[] newArr = new Disco[arr.length + 1];
      System.arraycopy(arr, 0, newArr, 0, pos);
      newArr[pos] = valor;
      System.arraycopy(arr, pos, newArr, pos + 1, arr.length - pos);
      return newArr;
    } else {
      System.out.println("Posición invalida");
      return arr;
    }
  }

  public static Disco[] insertarAlFinal(Disco[] arr, Disco valor) {
    return insertarEnPosicion(arr, valor, arr.length);
  }

  public static Disco[] eliminar(Disco[] arr, int pos) {
    if (pos >= 0 && pos <= arr.length) {
      Disco[] newArr = new Disco[arr.length - 1];
      System.arraycopy(arr, 0, newArr, 0, pos);
      System.arraycopy(arr, pos + 1, newArr, pos, arr.length - pos - 1);
      return newArr;
    } else {
      System.out.println("Posición invalida");
      return arr;
    }
  }

  public static int checkCodigo(Disco[] discos, String codigo) {
    int existe = -1;

    for (int i = 0; i < discos.length && existe == -1; i++) {
      if (discos[i].getCodigo().equals(codigo)) {
        existe = i;
      }
    }

    return existe;
  }
}
