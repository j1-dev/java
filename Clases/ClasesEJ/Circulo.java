package Clases.ClasesEJ;

public class Circulo extends FiguraGeometrica {
  private double radio;

  public Circulo(double radio, String color) {
    super(color);
    this.radio = radio;
  }

  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  public double perimetro() {
    return 2 * Math.PI * radio;
  }

  public double area() {
    return Math.PI * radio * radio;
  }

  @Override
  public String toString() {
    return "Circulo [radio= " + radio + ", color= " + super.getColor() + "]";
  }

}
