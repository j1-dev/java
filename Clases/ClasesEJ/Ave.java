package Clases.ClasesEJ;

public abstract class Ave extends Animal {
  private int tamanioAlas;

  public Ave(String sonido, String color, int nPatas, int tamanioAlas) {
    super(sonido, color, nPatas);
    this.tamanioAlas = tamanioAlas;
  }

  public int getTamanioAlas() {
    return tamanioAlas;
  }

  public void setTamanioAlas(int tamanioAlas) {
    this.tamanioAlas = tamanioAlas;
  }

  @Override
  public String toString() {
    return "Ave [tamanioAlas=" + tamanioAlas + " " + super.toString() + "]";
  }

}
