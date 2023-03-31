package contenedores.matrix;

import java.sql.Time;
import java.sql.Date;

public abstract class Personaje {
  private int id;
  private String nombre;
  private String ciudad;
  private Date fechaCreacion;
  private Time horaCreacion;
  private int edad;
  private int probMorir;

  public Personaje(int id, String nombre, String ciudad, Date fechaCreacion, Time horaCreacion, int edad,
      int probMorir) {
    this.id = id;
    this.nombre = nombre;
    this.ciudad = ciudad;
    this.fechaCreacion = fechaCreacion;
    this.horaCreacion = horaCreacion;
    this.edad = edad;
    this.probMorir = probMorir;
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

  public Time getHoraCreacion() {
    return horaCreacion;
  }

  public void setHoraCreacion(Time horaCreacion) {
    this.horaCreacion = horaCreacion;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getProbMorir() {
    return probMorir;
  }

  public void setProbMorir(int probMorir) {
    this.probMorir = probMorir;
  }

  @Override
  public String toString() {
    return id + ": -> [\n\tnombre=" + nombre + "\n\tciudad=" + ciudad + "\n\tfechaCreacion=" + fechaCreacion
        + "\n\thoraCreacion=" + horaCreacion + "\n\tedad=" + edad + "\n\tprobMorir=" + probMorir + "\n]";
  }

  public abstract String mostrarInformacion();
}
