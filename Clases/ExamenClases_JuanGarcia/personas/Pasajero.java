package personas;

public class Pasajero {
  private String nombre;
  private String apellidos;
  private String nacionalidad;
  private Boolean tieneCamarote;
  private int codigo;
  private static int contador = 1;

  public Pasajero(String nombre, String apellidos, String nacionalidad, Boolean tieneCamarote) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.nacionalidad = nacionalidad;
    this.tieneCamarote = tieneCamarote;
    codigo = contador++;
  }

  @Override
  public boolean equals(Object object) {
    Pasajero p = (Pasajero) object;
    return (p.nombre.equals(this.nombre) &&
        p.apellidos.equals(this.apellidos) &&
        p.nacionalidad.equals(this.nacionalidad));
  }

  @Override
  public String toString() {
    return "Nombre= " + nombre + ", apellidos= " + apellidos + ", nacionalidad= " + nacionalidad
        + ", tieneCamarote= " + tieneCamarote + ", codigo= " + codigo + "]";
  }

}
