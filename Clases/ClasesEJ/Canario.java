package Clases.ClasesEJ;

public class Canario extends Ave {
  private boolean estaSano;

  public Canario(String sonido, String color, int nPatas, int tamanioAlas, boolean estaSano) {
    super(sonido, color, nPatas, tamanioAlas);
    this.estaSano = estaSano;
  }

  public boolean isEstaSano() {
    return estaSano;
  }

  public void setEstaSano(boolean estaSano) {
    this.estaSano = estaSano;
  }

  @Override
  public String toString() {
    return "Canario [estaSano=" + estaSano + " " + super.toString() + "]";
  }

  @Override
  public String moverse() {
    return "*vuela*";
  }

}
