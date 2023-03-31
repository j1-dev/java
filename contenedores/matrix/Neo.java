package contenedores.matrix;

import java.util.Date;

public class Neo extends Personaje {
  private boolean seCreeElegido;
  private int poder;

  public Neo(int id, String nombre, String ciudad, Date fechaCreacion, long horaCreacion, int edad,
      boolean seCreeElegido, int poder) {
    super(id, nombre, ciudad, fechaCreacion, horaCreacion, edad);
    this.seCreeElegido = seCreeElegido;
    this.poder = poder;
  }

  public boolean isSeCreeElegido() {
    return seCreeElegido;
  }

  public void setSeCreeElegido(boolean seCreeElegido) {
    this.seCreeElegido = seCreeElegido;
  }

  public int getPoder() {
    return poder;
  }

  public void setPoder(int poder) {
    this.poder = poder;
  }

  @Override
  public String mostrarInformacion() {
    String toStringNotClosed = (String) super.toString().subSequence(0, this.toString().length() - 1);
    return toStringNotClosed + "\tSe cree el elegido: " + seCreeElegido + "\n\t\tPoder: " + poder + "\n\t}";
  }

}
