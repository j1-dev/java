package contenedores.matrix;

import java.sql.Date;
import java.sql.Time;

public class Smith extends Personaje {
  private int infectionPower;

  public Smith(int id, String nombre, String ciudad, Date fechaCreacion, Time horaCreacion, int edad, int probMorir,
      int infectionPower) {
    super(id, nombre, ciudad, fechaCreacion, horaCreacion, edad, probMorir);
    this.infectionPower = infectionPower;
  }

  public int getInfectionPower() {
    return infectionPower;
  }

  public void setInfectionPower(int infectionPower) {
    this.infectionPower = infectionPower;
  }

  @Override
  public String mostrarInformacion() {
    // TODO Auto-generated method stub
    return super.toString() + "\n---AGENTE SMITH { Poder de infecction: " + infectionPower + " }---";
  }

}
