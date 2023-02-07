package Clases.ClasesEJ;

public class Linea {
  private Punto p1, p2;

  public Linea(Punto p1, Punto p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  @Override
  public String toString() {
    return "Linea formada por los puntos: " + p1 + " y " + p2;
  }

}
