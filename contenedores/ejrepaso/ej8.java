package contenedores.ejrepaso;

import java.util.ArrayList;

import Clases.ClasesEJ.Baraja;
import Clases.ClasesEJ.Carta;

public class ej8 {
  public static void main(String[] args) {
    int numCartas = 10;
    Baraja baraja = new Baraja();
    ArrayList<Carta> mazo = new ArrayList<>();
    baraja.barajar();
    for (int i = 0; i < numCartas; i++) {
      mazo.add(baraja.pop());
    }
    System.out.println(mazo.toString());
  }
}
