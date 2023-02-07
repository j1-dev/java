package Clases.Ejemplos;

import Clases.Enums.Puesto;

public class Gestor {
  private String nombre;
  private String nTelefono;
  private int importeMaximo;
  private Puesto puesto;

  public Gestor() {
    this.nombre = "";
    this.nTelefono = "";
    this.importeMaximo = 10000;
    this.puesto = Puesto.BECARIO;
  }

  public Gestor(String nombre, String nTelefono) {
    this();
    this.nombre = nombre;
    this.nTelefono = nTelefono;
  }

  public Gestor(String nombre, String nTelefono, int importeMaximo) {
    this(nombre, nTelefono);
    this.nombre = nombre;
    this.nTelefono = nTelefono;
    if (importeMaximo < 10000) {
      this.importeMaximo = importeMaximo;
    } else {
      this.importeMaximo = 10000;
    }
  }

  public Gestor(String nombre, String nTelefono, int importeMaximo, Puesto puesto) {
    this(nombre, nTelefono, importeMaximo);
    this.puesto = puesto;
    setImporteMaximo(importeMaximo);
  }

  public Puesto getPuesto() {
    return puesto;
  }

  public void setPuesto(Puesto puesto) {
    this.puesto = puesto;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getnTelefono() {
    return nTelefono;
  }

  public int getImporteMaximo() {
    return importeMaximo;
  }

  public void setImporteMaximo(int importeMaximo) {
    if (importeMaximo > 0) {
      switch (puesto) {
        case BECARIO:
          if (importeMaximo < 10000) {
            this.importeMaximo = importeMaximo;
          } else {
            this.importeMaximo = 10000;
          }
          break;
        case AYUDANTE:
          if (importeMaximo < 50000) {
            this.importeMaximo = importeMaximo;
          } else {
            this.importeMaximo = 50000;
          }
          break;
        case SENIOR:
          if (importeMaximo < 200000) {
            this.importeMaximo = importeMaximo;
          } else {
            this.importeMaximo = 200000;
          }
          break;
        default:
          this.importeMaximo = importeMaximo;
      }
    } else {
      System.out.println("Importe maximo erroneo");
    }
  }

}
