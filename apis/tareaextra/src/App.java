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

      String optionString = sc.nextLine();
      int option;
      try {
        option = Integer.parseInt(optionString);
      } catch (Exception e) {
        option = -1;
      }

      switch (option) {
        case 1:
          // ask for movie name
          System.out.println("Introduzca el nombre de la pelicula");
          String movieName = sc.nextLine();
          // search movie
          ArrayList<Pelicula> peliculas = Searcher.searchMovies(movieName);
          // print movie info
          Printer.printMovies(peliculas, 10);
          break;
        case 2:
          // ask for actor/director name
          System.out.println("Introduzca el nombre del actor/director");
          String personName = sc.nextLine();
          // search actor/director
          ArrayList<Persona> personas = Searcher.searchPerson(personName);
          // print actor/director info
          Printer.printPersons(personas, option);
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
}
