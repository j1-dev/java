package Clases.trenes.personal;

public class Maquinista {
  private String nombre;
  private String dni;
  private int sueldo;
  private String rango;

  public Maquinista(String nombre, String dni, int sueldo) {
    this.nombre = nombre;
    this.dni = dni;
    this.sueldo = sueldo;
  }

  public Maquinista(String nombre, String dni, int sueldo, String rango) {
    this(nombre, dni, sueldo);
    this.rango = rango;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public int getSueldo() {
    return sueldo;
  }

  public void setSueldo(int sueldo) {
    this.sueldo = sueldo;
  }

  public String getRango() {
    return rango;
  }

  public void setRango(String rango) {
    this.rango = rango;
  }

  @Override
  public String toString() {
    return nombre + " (" + rango + ")";
  }

}
