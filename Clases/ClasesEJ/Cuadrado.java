package Clases.ClasesEJ;

public class Cuadrado extends FiguraGeometrica {
  private double lado;

  public Cuadrado(double lado, String color) {
    super(color);
    this.lado = lado;
  }

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  public double perimetro() {
    return 4 * lado;
  }

  public double area() {
    return lado * lado;
  }

  @Override
  public String toString() {
    return "Cuadrado [lado= " + lado + ", color= " + super.getColor() + "]";
  }

  public String pintar() {
    String str = "";

    for (int i = 0; i < lado; i++) {
      for (int j = 0; j < lado; j++) {
        str += "*";
      }
      str += "\n";
    }

    return str;
  }

}
