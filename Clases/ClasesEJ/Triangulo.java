package Clases.ClasesEJ;

public class Triangulo extends FiguraGeometrica {
  private double base, altura;

  public Triangulo(double base, double altura, String color) {
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

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double perimetro() {
    return base + (2 * (Math.sqrt(base * base + altura * altura)));
  }

  @Override
  public String toString() {
    return "Triangulo [base= " + base + ", altura= " + altura + ", color= " + super.getColor() + "]";
  }

}
