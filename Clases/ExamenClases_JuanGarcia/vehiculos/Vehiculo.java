package vehiculos;

import personas.Pasajero;

public abstract class Vehiculo {
  private String matricula;
  private Pasajero propietario;

  public Vehiculo(String matricula) {
    this.matricula = matricula;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public Pasajero getPropietario() {
    return propietario;
  }

  public void setPropietario(Pasajero propietario) {
    this.propietario = propietario;
  }

  abstract public String informacion();
}
