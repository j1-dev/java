package Clases.ClasesEJ;

public class Lagarto extends Animal {
  private boolean esAnfibio;

  public Lagarto(String sonido, String color, int nPatas, boolean esAnfibio) {
    super(sonido, color, nPatas);
    this.esAnfibio = esAnfibio;
  }

  public boolean isEsAnfibio() {
    return esAnfibio;
  }

  public void setEsAnfibio(boolean esAnfibio) {
    this.esAnfibio = esAnfibio;
  }

  @Override
  public String toString() {
    return "Lagarto [esAnfibio=" + esAnfibio + " " + super.toString() + "]";
  }

  @Override
  public String moverse() {
    return "*chapotea por un charco*";
  }

}
