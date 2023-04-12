package contenedores.ejrepaso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class equipoFutbol {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    HashMap<Integer, Jugador> plantilla = new HashMap<>();

    Jugador j1 = new Jugador("45832965A", "Manuel Reina Rodríguez", Posicion.PORTERO, 1.85f);
    Jugador j2 = new Jugador("25324565B", "Javier Jiménez Moreno", Posicion.DEFENSA, 1.70f);
    Jugador j3 = new Jugador("83562965C", "Moussa Diarra", Posicion.DEFENSA, 1.88f);
    Jugador j4 = new Jugador("65832965D", "Genaro Rodríguez Serrano", Posicion.CENTROCAMPISTA, 1.85f);
    Jugador j5 = new Jugador("35832965E", "Junior Wakalible Lago", Posicion.DELANTERO, 1.80f);

    altaJugador(plantilla, 1, j1);
    altaJugador(plantilla, 2, j2);
    altaJugador(plantilla, 3, j3);
    altaJugador(plantilla, 4, j4);
    altaJugador(plantilla, 5, j5);

    mostrar(plantilla);
    mostrar(plantilla, "portero");

    altaJugador(plantilla, 6);
    altaJugador(plantilla, 7);

    eliminarJugador(plantilla, 2);

    mostrar(plantilla);

  }

  static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
    System.out.println("Introduzca los datos del jugador " + dorsal);
    System.out.print("DNI -> ");
    String dni = sc.nextLine();
    System.out.print("Nombre -> ");
    String nombre = sc.nextLine();
    boolean valida = true;
    Posicion posicion = null;
    do {
      System.out.print("Posicion -> ");
      String pos = sc.nextLine();
      pos = pos.toUpperCase();
      if (pos == "PORTERO" || pos == "DEFENSA" || pos == "CENTROCAMPISTA" || pos == "DELANTERO") {
        posicion = Posicion.valueOf(pos);
        valida = true;
      } else {
        valida = false;
      }
    } while (valida == false);
    System.out.print("Altura -> ");
    float altura = sc.nextFloat();

    plantilla.put(dorsal, new Jugador(dni, nombre, posicion, altura));

  }

  static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
    plantilla.put(dorsal, jugador);
  }

  static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
    return plantilla.remove(dorsal);
  }

  static void mostrar(Map<Integer, Jugador> plantilla) {
    for (Map.Entry<Integer, Jugador> e : plantilla.entrySet()) {
      System.out.println("---------------------------------------------------------------");
      System.out.println("Dorsal -> " + e.getKey());
      System.out.println("Jugador -> " + e.getValue().toString());
      System.out.println("---------------------------------------------------------------");

    }
  }

  static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
    boolean valida = true;
    Posicion posi = null;

    if (posicion == "PORTERO" || posicion == "DEFENSA" || posicion == "CENTROCAMPISTA" || posicion == "DELANTERO") {
      posi = Posicion.valueOf(posicion);
      valida = true;
    } else {
      valida = false;
    }

    if (valida) {
      for (Map.Entry<Integer, Jugador> e : plantilla.entrySet()) {
        if (e.getValue().getPosicion() == posi) {
          System.out.println("---------------------------------------------------------------");
          System.out.println("Dorsal -> " + e.getKey());
          System.out.println("Jugador -> " + e.getValue().toString());
          System.out.println("---------------------------------------------------------------");
        }
      }
    } else {
      System.out.println("Posicion introducida erronea");
    }

  }

  static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
    boolean editable = true;

    return editable;
  }
}
