package contenedores.clases;

public class Academico implements Comparable<Academico> {
  private String nombre;
  private int anioIngreso;

  public Academico(String nombre, int anioIngreso) {
    this.nombre = nombre;
    this.anioIngreso = anioIngreso;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getAnioIngreso() {
    return anioIngreso;
  }

  public void setAnioIngreso(int anioIngreso) {
    this.anioIngreso = anioIngreso;
  }

  @Override
  public String toString() {
    return "Academico [nombre=" + nombre + ", anioIngreso=" + anioIngreso + "]";
  }

  @Override
  public int compareTo(Academico a) {
    int val = 0;
    val = this.nombre.compareTo(a.nombre);
    if (val == 0) {
      return this.anioIngreso - a.getAnioIngreso();
    } else {
      return val;
    }
  }

}
