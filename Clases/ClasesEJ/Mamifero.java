package Clases.ClasesEJ;

public abstract class Mamifero extends Animal {
  private String tipoPelaje;

  public Mamifero(String sonido, String color, int nPatas, String tipoPelaje) {
    super(sonido, color, nPatas);
    this.tipoPelaje = tipoPelaje;
  }

  public String getTipoPelaje() {
    return tipoPelaje;
  }

  public void setTipoPelaje(String tipoPelaje) {
    this.tipoPelaje = tipoPelaje;
  }

  @Override
  public String toString() {
    return "Mamifero [tipoPelaje=" + tipoPelaje + " " + super.toString() + "]";
  }

}
