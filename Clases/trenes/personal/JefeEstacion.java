package Clases.trenes.personal;

import java.time.LocalDate;

public class JefeEstacion {
  private String nombre;
  private String dni;
  private LocalDate fechaNombrado;

  public JefeEstacion(String nombre, String dni) {
    this.nombre = nombre;
    this.dni = dni;
  }

  public JefeEstacion(String nombre, String dni, LocalDate fechaNombrado) {
    this(nombre, dni);
    this.fechaNombrado = fechaNombrado;
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

  public LocalDate getFechaNombrado() {
    return fechaNombrado;
  }

  public void ModificarFechaCargo(int año, int mes, int dia) {
    LocalDate f = LocalDate.of(año, mes, dia);
    fechaNombrado = f;
  }

  @Override
  public String toString() {
    return "nombre: " + nombre + ", dni: " + dni + " (" + fechaNombrado + ")";
  }

}
