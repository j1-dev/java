package Clases.Ejemplos;

public class Persona {

  // Definir atributos de clase;

  private String DNI;
  private String nombre;
  private String apellidos;
  private int edad;
  private double estatura;

  public Persona() {
    this.DNI = "";
    this.nombre = "";
    this.apellidos = "";
    this.edad = 0;
    this.estatura = 0.0d;
  }

  public Persona(String nombre) {
    this();
    this.nombre = nombre;
  }

  public Persona(String DNI, String nombre, int edad, double estatura) {
    this(nombre);
    this.DNI = DNI;
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
  }

  public Persona(String DNI, String nombre, String apellidos, int edad, double estatura) {
    this(DNI, nombre, edad, estatura);
    this.apellidos = apellidos;
  }

  public String getDNI() {
    return DNI;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public int getEdad() {
    return edad;
  }

  public double getEstatura() {
    return estatura;
  }

  public void setDNI(String dNI) {
    DNI = dNI;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setEstatura(double estatura) {
    this.estatura = estatura;
  }

  @Override
  public String toString() {
    return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", estatura="
        + estatura + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
    result = prime * result + edad;
    long temp;
    temp = Double.doubleToLongBits(estatura);
    result = prime * result + (int) (temp ^ (temp >>> 32));
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
    Persona other = (Persona) obj;
    if (DNI == null) {
      if (other.DNI != null)
        return false;
    } else if (!DNI.equals(other.DNI))
      return false;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    if (apellidos == null) {
      if (other.apellidos != null)
        return false;
    } else if (!apellidos.equals(other.apellidos))
      return false;
    if (edad != other.edad)
      return false;
    if (Double.doubleToLongBits(estatura) != Double.doubleToLongBits(other.estatura))
      return false;
    return true;
  }

}