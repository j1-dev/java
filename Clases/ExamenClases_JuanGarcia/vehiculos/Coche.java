package vehiculos;

public class Coche extends Vehiculo {
  private int numPlazas;
  private Boolean esParticular;

  public Coche(String matricula, int numPlazas, Boolean esParticular) {
    super(matricula);
    this.numPlazas = numPlazas;
    this.esParticular = esParticular;
  }

  public String informacion() {
    String str = "";

    str += getClass().getName() + ": Matricula = " + super.getMatricula()
        + " - Propietario " + super.getPropietario().toString() + " - num. Plazas = "
        + this.numPlazas + " - es particular: " + this.esParticular;

    return str;
  }
}
