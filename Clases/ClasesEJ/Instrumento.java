package Clases.ClasesEJ;

import java.util.LinkedList;

public abstract class Instrumento {
  LinkedList<Notas> notas;

  Instrumento() {
    notas = new LinkedList<Notas>();
  }

  public void add(Notas nota) {
    notas.addLast(nota);
  }

  abstract void interpretar();
}
