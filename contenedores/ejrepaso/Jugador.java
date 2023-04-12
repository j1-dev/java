package contenedores.ejrepaso;

public class Jugador {
  private String dni;
  private String nombre;
  private Posicion posicion;
  private float estatura;

  public Jugador(String dni, String nombre, Posicion posicion, float estatura) {
    this.dni = dni;
    this.nombre = nombre;
    this.posicion = posicion;
    this.estatura = estatura;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Posicion getPosicion() {
    return posicion;
  }

  public void setPosicion(Posicion posicion) {
    this.posicion = posicion;
  }

  public float getEstatura() {
    return estatura;
  }

  public void setEstatura(float estatura) {
    this.estatura = estatura;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((dni == null) ? 0 : dni.hashCode());
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
    result = prime * result + Float.floatToIntBits(estatura);
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
    Jugador other = (Jugador) obj;
    if (dni == null) {
      if (other.dni != null)
        return false;
    } else if (!dni.equals(other.dni))
      return false;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    if (posicion != other.posicion)
      return false;
    if (Float.floatToIntBits(estatura) != Float.floatToIntBits(other.estatura))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Jugador [dni=" + dni + ", nombre=" + nombre + ", posicion=" + posicion + ", estatura=" + estatura + "]";
  }

}
