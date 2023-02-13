package Clases.trenes.maquinaria;

import Clases.trenes.personal.Mecanico;

public class Locomotora {
  private String matricula;
  private int potencia;
  private int antiguedad;
  private Mecanico mecanico;

  public Locomotora(String matricula, int potencia) {
    this.matricula = matricula;
    this.potencia = potencia;
  }

  public Locomotora(String matricula, int potencia, int antiguedad) {
    this(matricula, potencia);
    this.antiguedad = antiguedad;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public int getPotencia() {
    return potencia;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }

  public int getAntiguedad() {
    return antiguedad;
  }

  public void setAntiguedad(int antiguedad) {
    this.antiguedad = antiguedad;
  }

  public Mecanico getMecanico() {
    return mecanico;
  }

  public void setMecanico(Mecanico mecanico) {
    this.mecanico = mecanico;
  }

  @Override
  public String toString() {
    return matricula + " (" + potencia + " Cv) " + (mecanico != null ? mecanico : "");
  }

}
