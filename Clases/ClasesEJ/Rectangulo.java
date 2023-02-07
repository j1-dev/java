package Clases.ClasesEJ;

public class Rectangulo {
  private int base, altura;
  private static int cantidad = 0;

  public Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    cantidad++;
  }

  public int getBase() {
    return base;
  }

  public void setBase(int base) {
    this.base = base;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public static int getCantidad() {
    return cantidad;
  }

  public static void setCantidad(int cantidad) {
    Rectangulo.cantidad = cantidad;
  }

  @Override
  public String toString() {
    String str = "";

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < base; j++) {
        str += "*";
      }
      str += "\n";
    }

    return str;
  }

}
