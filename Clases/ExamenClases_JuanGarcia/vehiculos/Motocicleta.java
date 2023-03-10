package vehiculos;

public class Motocicleta extends Vehiculo {
  private int cilindrada;
  private Boolean necesitaCarnet;

  public Motocicleta(String matricula, int cilindrada, Boolean necesitaCarnet) {
    super(matricula);
    this.cilindrada = cilindrada;
    this.necesitaCarnet = necesitaCarnet;
  }

  public String informacion() {
    String str = "";

    str += getClass().getName() + ": Matricula = " + super.getMatricula()
        + " - Propietario " + super.getPropietario().toString() + " - Cilindrada = "
        + this.cilindrada + " - ConCarnet: " + this.necesitaCarnet;

    return str;
  }
}
