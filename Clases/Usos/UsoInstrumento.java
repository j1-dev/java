package Clases.Usos;

import Clases.ClasesEJ.Piano;
import Clases.ClasesEJ.Notas;

public class UsoInstrumento {
  public static void main(String[] args) {
    Piano piano = new Piano();

    piano.add(Notas.DO);
    piano.add(Notas.MI);
    piano.add(Notas.SOL);
    piano.add(Notas.RE);
    piano.add(Notas.FA);

    piano.interpretar();

  }
}
