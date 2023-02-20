package Clases.ClasesEJ;

public class Rectangulo extends FiguraGeometrica {
  private double base, altura;

  public Rectangulo(double base, double altura, String color) {
    super(color);
    this.base = base;
    this.altura = altura;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public double perimetro() {
    return (2 * base + 2 * altura);
  }

  public double area() {
    return base * altura;
  }

  public String pintar() {
    String str = "";

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < base; j++) {
        str += "*";
      }
      str += "\n";
    }

    return str;
  }

  @Override
  public String toString() {
    return "Rectangulo [base= " + base + ", altura= " + altura + ", color= " + super.getColor() + "]";
  }

}
