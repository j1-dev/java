package Clases.frioMijas_JuanGarcía.equipos;

public class Minibar extends Electrodomestico {
  private int nBaldas;

  public Minibar(double alto, double ancho, double profundidad, int frigorias, String marca, int nBaldas) {
    super(alto, ancho, profundidad, frigorias, marca);
    this.nBaldas = nBaldas;
  }

  @Override
  public double consumo() {
    return super.getFrigorias() * 2;
  }

  public int getnBaldas() {
    return nBaldas;
  }

  public void setnBaldas(int nBaldas) {
    this.nBaldas = nBaldas;

  }

  @Override
  public String toString() {
    return "Minibar [nBaldas=" + nBaldas + ", " + super.toString();
  }
}
