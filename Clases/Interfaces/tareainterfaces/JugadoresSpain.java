package Clases.Interfaces.tareainterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class JugadoresSpain {
  static ArrayList<Integer> cn1 = new ArrayList<>();
  static ArrayList<Integer> cn2 = new ArrayList<>();
  static ArrayList<Integer> ca1 = new ArrayList<>();
  static ArrayList<Integer> ca2 = new ArrayList<>();
  static int c = 0;

  public static void main(String[] args) {
    Jugador j1 = new Jugador(generaNombre(), generaApodo(), c++, (int) (Math.random() * 10),
        (int) (Math.random() * 10));
    Jugador j2 = new Jugador(generaNombre(), generaApodo(), c++, (int) (Math.random() * 10),
        (int) (Math.random() * 10));
    Jugador j3 = new Jugador(generaNombre(), generaApodo(), c++, (int) (Math.random() * 10),
        (int) (Math.random() * 10));
    Jugador j4 = new Jugador(generaNombre(), generaApodo(), c++, (int) (Math.random() * 10),
        (int) (Math.random() * 10));
    Jugador j5 = new Jugador(generaNombre(), generaApodo(), c++, (int) (Math.random() * 10),
        (int) (Math.random() * 10));

    ArrayList<Jugador> jugadores = new ArrayList<>();

    jugadores.add(j1);
    jugadores.add(j2);
    jugadores.add(j3);
    jugadores.add(j4);
    jugadores.add(j5);

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

    int c1;
    do {
      c1 = (int) (Math.random() * 10);
    } while (cn1.contains(c1));

    int c2;
    do {
      c2 = (int) (Math.random() * 10);
    } while (cn2.contains(c2));

    n += nombres[c1] + " " + apellidos[c2];

    cn1.add(c1);
    cn2.add(c2);

    return n;
  }

  public static String generaApodo() {
    String[] apodo1 = { "Grande", "Pulga", "Raton", "Mago", "La roca", "Titan", "Cabeza", "Jardinero", "Carnicero",
        "Muñeco", "Burro", "Pantera" };
    String[] apodo2 = { "de Oro", "de los mares", "de Mijas", "de Titanio", "loca", "Blanco", "Negro" };
    String a = "";

    int c1;
    do {
      c1 = (int) (Math.random() * 12);
    } while (ca1.contains(c1));

    int c2;
    do {
      c2 = (int) (Math.random() * 7);
    } while (ca2.contains(c2));

    a += apodo1[c1] + " " + apodo2[c2];

    ca1.add(c1);
    ca2.add(c2);

    return a;
  }
}
