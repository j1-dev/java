package Clases.ClasesEJ;

public class Baraja {
  private Carta[] cartas;

  public Baraja() {
    cartas = new Carta[0];
    for (int i = 0; i < Palo.values().length; i++) {
      for (int j = 0; j < 12; j++) {
        Carta carta = new Carta(Palo.values()[i], j + 1);
        push(carta);
      }
    }
  }

  public void push(Carta carta) {
    Carta[] newCartas = new Carta[cartas.length + 1];
    for (int i = 0; i < cartas.length; i++) {
      newCartas[i] = cartas[i];
    }
    newCartas[newCartas.length - 1] = carta;
    cartas = newCartas;
  }

  public Carta pop() {
    Carta ret = cartas[cartas.length - 1];
    Carta[] newCartas = new Carta[cartas.length - 1];

    for (int i = 0; i < newCartas.length; i++) {
      newCartas[i] = cartas[i];
    }

    cartas = newCartas;
    return ret;
  }

  public void barajar() {
    for (int i = 0; i < cartas.length; i++) {
      swap(i, (int) (Math.random() * cartas.length));
    }
  }

  public void swap(int i, int j) {
    Carta tmp = cartas[i];
    cartas[i] = cartas[j];
    cartas[j] = tmp;
  }

  @Override
  public String toString() {
    String str = "";
    for (int i = 0; i < cartas.length; i++) {
      str += cartas[i] + "\n";
    }
    return str;
  }

}
