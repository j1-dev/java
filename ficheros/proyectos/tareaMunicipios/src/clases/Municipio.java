package clases;

public class Municipio implements Comparable {
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

  @Override
  public String toString() {
    return "Municipio {nombre: " + nombre + ", poblacion: " + poblacion + ", anio: " + anio + ", codigoPostal: "
        + codigoPostal + "}\n";
  }

  @Override
  public int compareTo(Object o) {
    Municipio m = (Municipio) o;
    return this.nombre.compareTo(m.getNombre());
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    result = prime * result + poblacion;
    result = prime * result + anio;
    result = prime * result + codigoPostal;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Municipio other = (Municipio) obj;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    if (anio != other.anio)
      return false;
    return true;
  }

}
