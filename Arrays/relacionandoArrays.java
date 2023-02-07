
import java.util.Arrays;
import java.util.Scanner;

import utiles.UtilesArrayJuanGarcia;

public class relacionandoArrays {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String[] nombres = new String[0];
    int[] edades = new int[0];
    boolean salir = false;
    char op = ' ';

    do {
      System.out.println("--------------------------");
      System.out.println("------MENU DE ALUMNOS-----");
      System.out.println("---a) Añadir alumno ------");
      System.out.println("---b) Mostrar alumnos ----");
      System.out.println("---c) Mostrar alumno mayor");
      System.out.println("---x) Salir --------------");
      System.out.println("--------------------------");

      op = sc.nextLine().toLowerCase().charAt(0);

      switch (op) {
        case 'a':
          System.out.println("Introduzca el nombre");
          String nombre = sc.nextLine();
          System.out.println("Introduzca la edad de " + nombre);
          int edad = sc.nextInt();
          edades = UtilesArrayJuanGarcia.insertarAlFinal(edades, edad);
          nombres = UtilesArrayJuanGarcia.insertarAlFinal(nombres, nombre);
          sc.nextLine();
          break;
        case 'b':
          imprimirAlumno(nombres, edades);
          break;
        case 'c':
          encuentraMayorEdad(nombres, edades);
          break;
        case 'x':
          salir = true;
          break;
        default:
          break;
      }
    } while (!salir);
  }

  static void aniadirAlumno(String[] nombres, int[] edades) {
    String nombre;
    int edad = 0;

    System.out.println("Introduzca el nombre del alumno");
    nombre = sc.nextLine();
    System.out.println("Introduzca la edad de " + nombre + " (-1 para parar)");
    edad = sc.nextInt();
    System.out.println(edad);
    while (edad != -1) {
      edades = UtilesArrayJuanGarcia.insertarAlFinal(edades, edad);
      nombres = UtilesArrayJuanGarcia.insertarAlFinal(nombres, nombre);
      imprimirAlumno(nombres, edades);
      sc.nextLine();
      System.out.println("Introduzca el nombre del alumno");
      nombre = sc.nextLine();
      System.out.println("Introduzca la edad de " + nombre + " (-1 para parar)");
      edad = sc.nextInt();
    }
  }

  static void imprimirAlumno(String[] nombres, int[] edades) {
    for (int i = 0; i < edades.length; i++) {
      System.out.println(nombres[i] + ":\t" + edades[i] + " años");
    }
  }

  static void encuentraMayorEdad(String[] nombres, int[] edades) {
    int max = edades[0];

    for (int i = 1; i < edades.length; i++) {
      if (edades[i] >= max) {
        max = i;
      }
    }

    System.out.println("El alumno mayor es " + nombres[max] + " (" + edades[max] + " años)");
  }
}
