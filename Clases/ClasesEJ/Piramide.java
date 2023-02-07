package Clases.ClasesEJ;

public class Piramide {
  private int altura;
  private static int cantidad = 0;

  public Piramide(int altura) {
    this.altura = altura;
    cantidad++;
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
    Piramide.cantidad = cantidad;
  }

  @Override
  public String toString() {
    String str = "";
    int espacios = (altura / 2) + 1;
    int asteriscos = 1;
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < espacios; j++) {
        str += " ";
      }
      for (int j = 0; j < asteriscos; j++) {
        str += "*";
      }
      str += "\n";
      espacios--;
      asteriscos += 2;
    }

    return str;
  }

}
