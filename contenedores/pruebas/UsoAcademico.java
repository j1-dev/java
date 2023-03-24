package contenedores.pruebas;

import contenedores.clases.Academico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class UsoAcademico {
  public static void main(String[] args) {
    Academico a1 = new Academico("Pepe", 1975);
    Academico a2 = new Academico("Javier", 1980);
    Academico a3 = new Academico("Manolo", 1973);
    Academico a4 = new Academico("Luis", 1981);
    Academico a5 = new Academico("Juan", 1982);

    HashMap<Character, Academico> mapaAcademicos = new HashMap<>();
    ArrayList<Academico> arrayAcademicos = new ArrayList<>();

    // Insercion academicos

    nuevoAcademico(mapaAcademicos, 'e', a5);
    nuevoAcademico(mapaAcademicos, 'd', a4);
    nuevoAcademico(mapaAcademicos, 'c', a3);
    nuevoAcademico(mapaAcademicos, 'a', a1);
    nuevoAcademico(mapaAcademicos, 'b', a2);

    arrayAcademicos.addAll(mapaAcademicos.values());

    // Listado ordenado por nombre sin letra

    Collections.sort(arrayAcademicos);

    System.out.println(arrayAcademicos);

    // Listado ordenado por año de ingreso

    Collections.sort(arrayAcademicos, (arg0, arg1) -> {
      return arg0.getAnioIngreso() - arg1.getAnioIngreso();
    });

    System.out.println(arrayAcademicos);

    // Listado ordenado por letra
    ArrayList<Character> listaLetras = new ArrayList<>();
    listaLetras.addAll(mapaAcademicos.keySet());
    Collections.sort(listaLetras);

    for (Character c : listaLetras) {
      System.out.println(c + " -> " + mapaAcademicos.get(c));
    }

    // TreeMap<Character, Academico> tree = new TreeMap<>(mapaAcademicos)

  }

  static boolean nuevoAcademico(HashMap<Character, Academico> academia, Character letra, Academico ac) {
    boolean res = false;
    Character l = Character.toLowerCase(letra);
    if (!academia.containsKey(l) && l >= 97 && l <= 122) {
      academia.put(letra, ac);
      res = true;
    }

    if (!res)
      System.out.println("ya existe ese academico");

    return res;
  }

}
