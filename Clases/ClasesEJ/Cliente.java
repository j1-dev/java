package Clases.ClasesEJ;

public class Cliente {
  private String nombre;
  private Accion accion;
  private double importe;

  public Cliente(String nombre, Accion accion, double importe) {
    this.nombre = nombre;
    this.accion = accion;
    this.importe = importe;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Accion getAccion() {
    return accion;
  }

  public void setAccion(Accion accion) {
    this.accion = accion;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  @Override
  public String toString() {
    return "Cliente [nombre=" + nombre + ", accion=" + accion + ", importe=" + importe + "]";
  }

}
