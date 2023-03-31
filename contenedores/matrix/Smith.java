package contenedores.matrix;

import java.util.Date;

public class Smith extends Personaje {
  private int poderDeInfeccion;

  public Smith(int id, String nombre, String ciudad, Date fechaCreacion, long horaCreacion, int edad,
      int poderDeInfeccion) {
    super(id, nombre, ciudad, fechaCreacion, horaCreacion, edad);
    this.poderDeInfeccion = poderDeInfeccion;
  }

  public int getpoderDeInfeccion() {
    return poderDeInfeccion;
  }

  public void setpoderDeInfeccion(int poderDeInfeccion) {
    this.poderDeInfeccion = poderDeInfeccion;
  }

  @Override
  public String mostrarInformacion() {
    String toStringNotClosed = (String) super.toString().subSequence(0, this.toString().length() - 1);
    return toStringNotClosed + "\tPoder de infección: " + poderDeInfeccion + "\n\t}";
  }

}
