package Clases.ClasesEJ;

public abstract class Animal {
  private String sonido;
  private String color;
  private int nPatas;

  public Animal(String sonido, String color, int nPatas) {
    this.sonido = sonido;
    this.color = color;
    this.nPatas = nPatas;
  }

  public String getSonido() {
    return sonido;
  }

  public void setSonido(String sonido) {
    this.sonido = sonido;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getnPatas() {
    return nPatas;
  }

  public void setnPatas(int nPatas) {
    this.nPatas = nPatas;
  }

  @Override
  public String toString() {
    return "Animal [sonido=" + sonido + ", color=" + color + ", nPatas=" + nPatas + "]";
  }

  abstract public String moverse();
}
