package Clases.Interfaces.tareainterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class JugadoresSpain {
  // Contador nombres: almacena pares de índices para comprobar que no hay nombres
  // duplicados
  static ArrayList<Pair<Integer, Integer>> cn = new ArrayList<>();
  // Contador nombres: almacena pares de índices para comprobar que no hay apodos
  // duplicados
  static ArrayList<Pair<Integer, Integer>> ca = new ArrayList<>();
  // Contador para el número de licencia
  static int c = 0;

  public static void main(String[] args) {

    ArrayList<Jugador> jugadores = new ArrayList<>();

    // Jugador j1 = new Jugador(generaNombre(), generaApodo(), c++, (int)
    // (Math.random() * 10),
    // (int) (Math.random() * 10));
    // Jugador j2 = new Jugador(generaNombre(), generaApodo(), c++, (int)
    // (Math.random() * 10),
    // (int) (Math.random() * 10));
    // Jugador j3 = new Jugador(generaNombre(), generaApodo(), c++, (int)
    // (Math.random() * 10),
    // (int) (Math.random() * 10));
    // Jugador j4 = new Jugador(generaNombre(), generaApodo(), c++, (int)
    // (Math.random() * 10),
    // (int) (Math.random() * 10));
    // Jugador j5 = new Jugador(generaNombre(), generaApodo(), c++, (int)
    // (Math.random() * 10),
    // (int) (Math.random() * 10));

    while (c < 7) {
      jugadores.add(new Jugador(generaNombre(), generaApodo(), c++, (int) (Math.random() * 10),
          (int) (Math.random() * 10)));
    }

    // jugadores.add(j1);
    // jugadores.add(j2);
    // jugadores.add(j3);
    // jugadores.add(j4);
    // jugadores.add(j5);

    System.out.println("\n---JUGADORES ORDENADOS POR NUMERO DE LICENCIA---\n");
    // Ordenados por numero de licencia
    Collections.sort(jugadores);

    for (Jugador j : jugadores) {
      System.out.println(j);
    }

    System.out.println("\n---JUGADORES ORDENADOS POR NUMERO DE GOLES---\n");
    // Ordenados por número de goles
    jugadores.sort((arg0, arg1) -> {
      return arg0.getNumeroGoles() - arg1.getNumeroGoles();
    });

    for (Jugador j : jugadores) {
      System.out.println(j);
    }

    System.out.println("\n---JUGADORES ORDENADOS POR NUMERO DE FALTAS---\n");
    // Ordenados por número de faltas
    jugadores.sort((arg0, arg1) -> {
      return arg0.getNumeroFaltas() - arg1.getNumeroFaltas();
    });

    for (Jugador j : jugadores) {
      System.out.println(j);
    }
  }

  public static String generaNombre() {
    String[] nombres = { "Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel" };
    String[] apellidos = { "García", "Fernández", "Martínez", "González", "Pérez", "López", "Ruiz", "Sánchez",
        "Hernández", "Jiménez" };
    String n = "";

    int c1, c2;
    Pair nc;
    do {
      c1 = (int) (Math.random() * 10);
      c2 = (int) (Math.random() * 10);
      nc = new Pair(c1, c2);
    } while (cn.contains(nc));

    n += nombres[c1] + " " + apellidos[c2];

    cn.add(nc);

    return n;
  }

  public static String generaApodo() {
    String[] apodo1 = { "Grande", "Pulga", "Raton", "Mago", "La roca", "Titan", "Cabeza", "Jardinero", "Carnicero",
        "Muñeco", "Burro", "Pantera" };
    String[] apodo2 = { "de Oro", "de los mares", "de Mijas", "de Titanio", "loca", "Blanco", "Negro" };
    String a = "";

    int c1, c2;
    Pair ac;
    do {
      c1 = (int) (Math.random() * 12);
      c2 = (int) (Math.random() * 7);
      ac = new Pair(c1, c2);
    } while (ca.contains(ac));

    a += apodo1[c1] + " " + apodo2[c2];

    ca.add(ac);

    return a;
  }
}
