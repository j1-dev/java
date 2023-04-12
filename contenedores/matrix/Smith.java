package contenedores.matrix;

import java.util.Date;

public class Smith extends Personaje {
  private int poderDeInfeccion;

  public Smith(int id, String nombre, String ciudad, Date fechaCreacion, long horaCreacion, int edad,
      int poderDeInfeccion) {
    super(id, nombre, ciudad, fechaCreacion, horaCreacion, edad);
    this.poderDeInfeccion = poderDeInfeccion;
  }

  public Smith(Humano h, int poderDeInfeccion) {
    super(h.getId(), h.getNombre(), h.getCiudad(), h.getFechaCreacion(), h.getHoraCreacion(), h.getEdad());
    this.poderDeInfeccion = poderDeInfeccion;
  }

  public int getpoderDeInfeccion() {
    return poderDeInfeccion;
  }

  public void setpoderDeInfeccion(int poderDeInfeccion) {
    this.poderDeInfeccion = poderDeInfeccion;
  }

  public Smith infectar(Humano h) {
    return new Smith(h, 3);
  }

  @Override
  public String mostrarInformacion() {
    String toStringNotClosed = (String) super.toString().subSequence(0, this.toString().length() - 1);
    return toStringNotClosed + "\tPoder de infección: " + poderDeInfeccion + "\n\t}";
  }

}
