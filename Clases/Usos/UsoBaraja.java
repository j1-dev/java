package Clases.Usos;

import Clases.ClasesEJ.*;

public class UsoBaraja {
  public static void main(String[] args) {
    Baraja baraja = new Baraja();
    boolean seguir = true;

    baraja.barajar();

    Carta c1, c2;
    c1 = baraja.pop();
    System.out.println(c1);
    do {
      c2 = baraja.pop();

      if (c1.getNumero() > c2.getNumero()) {
        seguir = false;
      } else {
        System.out.println(c2);
      }

      c1 = c2;
    } while (seguir);

  }

}
