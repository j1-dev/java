package Clases.Interfaces.tareainterfaces;

public class Jugador implements Comparable<Jugador> {
  private String nombreCompleto;
  private String apodo;
  private int numLicencia;
  private int numeroGoles;
  private int numeroFaltas;

  public Jugador(String nombreCompleto, String apodo, int numLicencia, int numeroGoles, int numeroFaltas) {
    this.nombreCompleto = nombreCompleto;
    this.apodo = apodo;
    this.numLicencia = numLicencia;
    this.numeroGoles = numeroGoles;
    this.numeroFaltas = numeroFaltas;
  }

  public String getNombreCompleto() {
    return nombreCompleto;
  }

  public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
  }

  public String getApodo() {
    return apodo;
  }

  public void setApodo(String apodo) {
    this.apodo = apodo;
  }

  public int getNumLicencia() {
    return numLicencia;
  }

  public void setNumLicencia(int numLicencia) {
    this.numLicencia = numLicencia;
  }

  public int getNumeroGoles() {
    return numeroGoles;
  }

  public void setNumeroGoles(int numeroGoles) {
    this.numeroGoles = numeroGoles;
  }

  public int getNumeroFaltas() {
    return numeroFaltas;
  }

  public void setNumeroFaltas(int numeroFaltas) {
    this.numeroFaltas = numeroFaltas;
  }

  @Override
  public String toString() {
    return "Jugador [nombreCompleto=" + nombreCompleto + ", apodo=" + apodo + ", numLicencia=" + numLicencia
        + ", numeroGoles=" + numeroGoles + ", numeroFaltas=" + numeroFaltas + "]";
  }

  @Override
  public boolean equals(Object o) {
    Jugador j = (Jugador) o;
    return this.numLicencia == j.getNumLicencia();
  }

  @Override
  public int compareTo(Jugador o) {
    return this.numLicencia - o.getNumLicencia();
  }

}
