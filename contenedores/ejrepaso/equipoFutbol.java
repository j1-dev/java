package contenedores.ejrepaso;

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

    // System.out.println("TODOS LOS JUGADORES");
    // mostrar(plantilla);

    // System.out.println("TODOS LOS DEFENSAS");
    // mostrar(plantilla, "defensa");

    // // Existe dorsal
    // altaJugador(plantilla, 2);

    // // No Existe dorsal
    // altaJugador(plantilla, 6);

    // // Existe dorsal
    // eliminarJugador(plantilla, 2);

    // // No Existe dorsal
    // eliminarJugador(plantilla, 99);

    mostrar(plantilla);

    // Existe dorsal
    editarJugador(plantilla, 3);

    // No existe dorsal
    // editarJugador(plantilla, 99);

    mostrar(plantilla);

  }

  static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
    while (plantilla.containsKey(dorsal)) {
      System.out.println("Este dorsal ya está cogido introduzca otro");
      dorsal = sc.nextInt();
      sc.nextLine();
    }
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
      if (pos.equals("PORTERO") || pos.equals("DEFENSA") || pos.equals("CENTROCAMPISTA") || pos.equals("DELANTERO")) {
        posicion = Posicion.valueOf(pos);
        valida = true;
      } else {
        valida = false;
      }
    } while (valida == false);
    System.out.print("Altura -> ");
    float altura = sc.nextFloat();
    sc.nextLine();

    plantilla.put(dorsal, new Jugador(dni, nombre, posicion, altura));

  }

  static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
    plantilla.put(dorsal, jugador);
  }

  static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
    if (plantilla.containsKey(dorsal)) {
      return plantilla.remove(dorsal);
    } else {
      System.out.println("No existe el jugador que quiere borrar");
      return null;
    }
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
    posicion = posicion.toUpperCase();
    if (posicion.equals("PORTERO") || posicion.equals("DEFENSA") || posicion.equals("CENTROCAMPISTA")
        || posicion.equals("DELANTERO")) {
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
    Jugador j = plantilla.get(dorsal);
    if (j != null) {
      System.out.println("Va a editar al jugador " + dorsal + " (" + j.getNombre() + " )");
      System.out.println("Qué atributo quiere editar? (1: nombre, 2: posicion, 3: estatura)");
      int opcion = sc.nextInt();
      sc.nextLine();
      switch (opcion) {
        case 1:
          System.out.println("va a editar el nombre");
          String nombre = sc.nextLine();
          j.setNombre(nombre);
          break;
        case 2:
          System.out.println("va a editar la posicion");
          boolean valida = true;
          Posicion posicion = null;
          do {
            String pos = sc.nextLine();
            pos = pos.toUpperCase();
            if (pos.equals("PORTERO") || pos.equals("DEFENSA") || pos.equals("CENTROCAMPISTA")
                || pos.equals("DELANTERO")) {
              posicion = Posicion.valueOf(pos);
              valida = true;
            } else {
              valida = false;
            }
          } while (valida == false);
          j.setPosicion(posicion);
          break;
        case 3:
          System.out.println("va a editar la estatura");
          float estatura = sc.nextFloat();
          j.setEstatura(estatura);
          break;
        default:
          System.out.println("opcion incorrecta");
          editable = false;
      }
    } else {
      editable = false;
      System.out.println("El jugador con el dorsal " + dorsal + " no existe");
    }
    return editable;
  }
}
