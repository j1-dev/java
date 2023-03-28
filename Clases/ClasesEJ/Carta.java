package Clases.ClasesEJ;

public class Carta implements Comparable<Carta> {
  private int numero;
  private Palo palo;

  public Carta(Palo palo, int numero) {
    this.palo = palo;
    this.numero = numero;
  }

  public Palo getPalo() {
    return palo;
  }

  public void setPalo(Palo palo) {
    this.palo = palo;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  @Override
  public String toString() {
    String num;
    switch (numero) {
      case 1:
        num = "as";
        break;
      case 2:
        num = "dos";
        break;
      case 3:
        num = "tres";
        break;
      case 4:
        num = "cuatro";
        break;
      case 5:
        num = "cinco";
        break;
      case 6:
        num = "seis";
        break;
      case 7:
        num = "siete";
        break;
      case 8:
        num = "sota";
        break;
      case 9:
        num = "caballo";
        break;
      case 10:
        num = "rey";
        break;
      default:
        num = "";
        break;
    }
    return num + " de " + palo.toString().toLowerCase();
  }

  @Override
  public int compareTo(Carta o) {
    int val = Palo.valueOf(this.palo.toString()).ordinal() - Palo.valueOf(o.getPalo().toString()).ordinal();
    if (val == 0) {
      val = this.getNumero() - o.getNumero();
    }
    return val;
  }

}
