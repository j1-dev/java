package contenedores.matrix;

import java.util.Date;

// Persona Generica
public class Humano extends Personaje {
  private int probMorir;

  public Humano(int id, String nombre, String ciudad, Date fechaCreacion, long horaCreacion, int edad, int probMorir) {
    super(id, nombre, ciudad, fechaCreacion, horaCreacion, edad);
    this.probMorir = probMorir;
  }

  public int getProbMorir() {
    return probMorir;
  }

  public void setProbMorir(int probMorir) {
    this.probMorir = probMorir;
  }

  @Override
  public String mostrarInformacion() {
    String toStringNotClosed = (String) super.toString().subSequence(0, this.toString().length() - 1);
    return toStringNotClosed + "\tprobMorir: " + probMorir + "\n\t}";
  }
}
