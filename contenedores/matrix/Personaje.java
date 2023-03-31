package contenedores.matrix;

import java.util.Date;

public abstract class Personaje {
  private int id;
  private String nombre;
  private String ciudad;
  private Date fechaCreacion;
  private long horaCreacion;
  private int edad;

  public Personaje(int id, String nombre, String ciudad, Date fechaCreacion, long horaCreacion, int edad) {
    this.id = id;
    this.nombre = nombre;
    this.ciudad = ciudad;
    this.fechaCreacion = fechaCreacion;
    this.horaCreacion = horaCreacion;
    this.edad = edad;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public Date getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(Date fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public long getHoraCreacion() {
    return horaCreacion;
  }

  public void setHoraCreacion(long horaCreacion) {
    this.horaCreacion = horaCreacion;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public String toString() {
    return id + ": -> {\n\t\tnombre: " + nombre + "\n\t\tciudad: " + ciudad + "\n\t\tfechaCreacion: " + fechaCreacion
        + "\n\t\thoraCreacion: " + horaCreacion + "\n\t\tedad: " + edad + "\n\t}";
  }

  public abstract String mostrarInformacion();
}
