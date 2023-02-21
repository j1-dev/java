package Clases.ClasesEJ;

public class Pinguino extends Ave {
  private boolean tieneFrio;

  public Pinguino(String sonido, String color, int nPatas, int tamanioAlas, boolean tieneFrio) {
    super(sonido, color, nPatas, tamanioAlas);
    this.tieneFrio = tieneFrio;
  }

  public boolean isTieneFrio() {
    return tieneFrio;
  }

  public void setTieneFrio(boolean tieneFrio) {
    this.tieneFrio = tieneFrio;
  }

  @Override
  public String toString() {
    return "Pinguino [tieneFrio=" + tieneFrio + " " + super.toString() + "]";
  }

  @Override
  public String moverse() {
    return "*intenta volar... pero no lo consigue*";
  }

}
