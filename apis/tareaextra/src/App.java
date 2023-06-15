import java.util.ArrayList;
import java.util.Scanner;

import clases.Pelicula;
import clases.Persona;

import utils.Printer;
import utils.Searcher;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    boolean exit = false;

    while (!exit) {
      System.out.println("1. Buscar Pelicula");
      System.out.println("2. Buscar Actor/Director");
      System.out.println("0. Salir");

      int option = validateOption(sc.nextLine());

      switch (option) {
        case 1:
          // Preguntar por el nombre de la pelicula
          System.out.println("Introduzca el nombre de la pelicula");
          String movieName = sc.nextLine();
          // Buscar pelicula
          ArrayList<Pelicula> peliculas = Searcher.searchMovies(movieName);
          // Imprimir 10 resultados
          Printer.printMovies(peliculas, 10);

          System.out.println(
              "Pulse el numero de la pelicula para ver la informacion completa o pulse 0 para volver al menu principal...");

          int movieOption = validateOption(sc.nextLine());

          if (movieOption > 0 && movieOption <= 10) {
            // Imprimir informacion de la pelicula seleccionada
            System.out.println(peliculas.get(movieOption - 1).toString());
          } else if (movieOption == 0) {
            continue;
          } else {
            System.out.println("Opcion invalida");
          }
          break;
        case 2:
          // Preguntar por el nombre del actor/actriz/director/a
          System.out.println("Introduzca el nombre del actor/director");
          String personName = sc.nextLine();
          // Buscar informacion
          ArrayList<Persona> personas = Searcher.searchPerson(personName);
          // Imprimir informacion
          Printer.printPersons(personas, 10);

          System.out.println(
              "Pulse el numero de la pelicula para ver la informacion completa o pulse 0 para volver al menu principal...");

          int personOption = validateOption(sc.nextLine());

          if (personOption > 0 && personOption <= 10) {
            // Imprimir informacion de la pelicula seleccionada
            System.out.println(personas.get(personOption - 1).toString());
          } else if (personOption == 0) {
            continue;
          } else {
            System.out.println("Opcion invalida");
          }
          break;
        case 0:
          exit = true;

          break;
        default:
          System.out.println("Opcion invalida");

          break;
      }

    }
    sc.close();
  }

  /*
   * Metodo para pasar la entrada de teclado a un entero valido
   * 
   * @param option String con la opcion introducida por el usuario
   * 
   * @return int con la opcion convertida a entero
   */
  static int validateOption(String option) {
    int optionInt;
    try {
      optionInt = Integer.parseInt(option);
    } catch (Exception e) {
      optionInt = -1;
    }
    return optionInt;
  }
}
