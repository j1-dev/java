package clases;

public class Municipio {
  private String nombre;
  private int poblacion;
  private int anio;
  private int codigoPostal;

  public Municipio(String nombre, int poblacion, int anio, int codigoPostal) {
    this.nombre = nombre;
    this.poblacion = poblacion;
    this.anio = anio;
    this.codigoPostal = codigoPostal;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getPoblacion() {
    return poblacion;
  }

  public void setPoblacion(int poblacion) {
    this.poblacion = poblacion;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public int getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(int codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

}
