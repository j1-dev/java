package Clases.frioMijas_JuanGarcía.equipos;

public class Frigorifico extends Electrodomestico {
  public Frigorifico(double alto, double ancho, double profundidad, int frigorias, String marca) {
    super(alto, ancho, profundidad, frigorias, marca);
  }

  @Override
  public double consumo() {
    return super.getFrigorias() * 3;
  }

  @Override
  public String toString() {
    return "Frigorifico [" + super.toString();
  }

}
