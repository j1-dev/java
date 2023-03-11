package Clases.frioMijas_JuanGarcía.equipos;

public class Camara extends Electrodomestico {
  private double temperaturaMinimaMax;

  public Camara(double alto, double ancho, double profundidad, int frigorias, String marca,
      double temperaturaMinimaMax) {
    super(alto, ancho, profundidad, frigorias, marca);
    this.temperaturaMinimaMax = temperaturaMinimaMax;
  }

  @Override
  public double consumo() {
    return super.getFrigorias() * 2;
  }

  public double getTemperaturaMinimaMax() {
    return temperaturaMinimaMax;
  }

  public void setTemperaturaMinimaMax(double temperaturaMinimaMax) {
    this.temperaturaMinimaMax = temperaturaMinimaMax;
  }

  @Override
  public String toString() {
    return "Camara [temperaturaMinimaMax=" + temperaturaMinimaMax + ", " + super.toString() + "]";
  }

}
