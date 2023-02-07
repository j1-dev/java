package Clases.ClasesEJ;

public class FichaDomino {
  private int lado1, lado2;

  public FichaDomino(int lado1) {
    this.lado1 = lado1;
    this.lado2 = 0;
  }

  public FichaDomino(int lado1, int lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  public int getLado1() {
    return lado1;
  }

  public void setLado1(int lado1) {
    this.lado1 = lado1;
  }

  public int getLado2() {
    return lado2;
  }

  public void setLado2(int lado2) {
    this.lado2 = lado2;
  }

  @Override
  public String toString() {
    return "[" + (lado1 == 0 ? " " : lado1) + "|" + (lado2 == 0 ? " " : lado2) + "]";
  }

  public FichaDomino voltea() {
    return new FichaDomino(lado2, lado1);
  }

  public boolean encaja(FichaDomino f) {
    return lado1 == f.lado1 || lado1 == f.lado2 ||
        lado2 == f.lado1 || lado2 == f.lado2;
  }
}
