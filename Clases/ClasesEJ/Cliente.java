package Clases.ClasesEJ;

public class Cliente implements Comparable {
  private String nombre;
  private double importe;

  public Cliente(String nombre, double importe) {
    this.nombre = nombre;
    this.importe = importe;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  @Override
  public String toString() {
    return "Cliente [nombre= " + nombre + ", importe= " + importe + "]";
  }

  @Override
  public int compareTo(Object o) {
    Cliente c = (Cliente) o;
    // Ordenacion por dinero
    // Double dineroTotal = importe;
    // return (dineroTotal.compareTo(c.getImporte()));
    // Ordenacion por nombre

    String nombre = c.getNombre();
    return nombre.compareTo(c.getNombre());
  }

}
