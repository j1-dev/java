package Clases.frioMijas_JuanGarcía.equipos;

public class Arcon extends Electrodomestico {
  private String tipoApertura;

  public Arcon(double alto, double ancho, double profundidad, int frigorias, String marca, String tipoApertura) {
    super(alto, ancho, profundidad, frigorias, marca);
    this.tipoApertura = tipoApertura;
  }

  @Override
  public double consumo() {
    return super.getFrigorias() * 2;
  }

  public String getTipoApertura() {
    return tipoApertura;
  }

  public void setTipoApertura(String tipoApertura) {
    this.tipoApertura = tipoApertura;
  }

  @Override
  public String toString() {
    return "Arcon [tipoApertura=" + tipoApertura + ", " + super.toString() + "]";
  }
}
