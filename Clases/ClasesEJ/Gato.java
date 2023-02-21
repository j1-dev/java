package Clases.ClasesEJ;

public class Gato extends Mamifero {
  private boolean tieneDuenio;

  public Gato(String sonido, String color, int nPatas, String tipoPelaje, boolean tieneDuenio) {
    super(sonido, color, nPatas, tipoPelaje);
    this.tieneDuenio = tieneDuenio;
  }

  public boolean isTieneDuenio() {
    return tieneDuenio;
  }

  public void setTieneDuenio(boolean tieneDuenio) {
    this.tieneDuenio = tieneDuenio;
  }

  @Override
  public String toString() {
    return "Gato [tieneDuenio=" + tieneDuenio + " " + super.toString() + "]";
  }

  @Override
  public String moverse() {
    return "*camina lentamente*";
  }

}
