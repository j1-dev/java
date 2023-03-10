package vehiculos;

public class Camion extends Vehiculo {
  private int pesoMaximo;
  private boolean peligro;

  public Camion(String matricula, int pesoMaximo) {
    super(matricula);
    this.pesoMaximo = pesoMaximo;
    peligro = false;
  }

  public String informacion() {
    String str = "";

    str += getClass().getName() + ": Matricula = " + super.getMatricula()
        + " - Propietario " + super.getPropietario().toString() + " - Peso maximo = "
        + this.pesoMaximo + " - Carga peligrosa: " + this.peligro;

    return str;
  }
}
