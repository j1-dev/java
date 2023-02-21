package Clases.ClasesEJ;

public class Perro extends Mamifero {
  private boolean buenAmigo;

  public boolean isBuenAmigo() {
    return buenAmigo;
  }

  public void setBuenAmigo(boolean buenAmigo) {
    this.buenAmigo = buenAmigo;
  }

  public Perro(String sonido, String color, int nPatas, String tipoPelaje, boolean buenAmigo) {
    super(sonido, color, nPatas, tipoPelaje);
    this.buenAmigo = buenAmigo;
  }

  @Override
  public String toString() {
    return "Perro [buenAmigo=" + buenAmigo + " " + super.toString() + "]";
  }

  @Override
  public String moverse() {
    return "*corre a toda hostia*";
  }

}
