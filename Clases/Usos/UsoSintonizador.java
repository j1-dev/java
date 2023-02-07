package Clases.Usos;

import Clases.Ejemplos.SintonizadorFM;

public class UsoSintonizador {
  public static void main(String[] args) {

    SintonizadorFM a, b;

    a = new SintonizadorFM(107f);

    a.up();
    a.up();
    a.up();
    a.up(); // subo a 2 MHz
    a.display(); // debe mostrar 80.5;

    b = new SintonizadorFM(80.5f);

    b.down();
    b.down();
    b.down(); // bajamos 1.5 MHz
    b.display(); // debe mostrar 107.5;

    a = new SintonizadorFM(200f); // frecuencia fuera de rango debe reajustarse;
    a.display(); // debe mostrar 108.0 MHz

  }

}
