public class Alumno {
  private String sexo;
  private int edad;
  private double estatura;
  private int puntuacion1, puntuacion2;
  private String haAprobado;

  public Alumno(String sexo, int edad, double estatura, int puntuacion1, int puntuacion2, String haAprobado) {
    this.sexo = sexo;
    this.edad = edad;
    this.estatura = estatura;
    this.puntuacion1 = puntuacion1;
    this.puntuacion2 = puntuacion2;
    this.haAprobado = haAprobado;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public double getEstatura() {
    return estatura;
  }

  public void setEstatura(double estatura) {
    this.estatura = estatura;
  }

  public int getPuntuacion1() {
    return puntuacion1;
  }

  public void setPuntuacion1(int puntuacion1) {
    this.puntuacion1 = puntuacion1;
  }

  public int getPuntuacion2() {
    return puntuacion2;
  }

  public void setPuntuacion2(int puntuacion2) {
    this.puntuacion2 = puntuacion2;
  }

  public String isHaAprobado() {
    return haAprobado;
  }

  public void setHaAprobado(String haAprobado) {
    this.haAprobado = haAprobado;
  }

  @Override
  public String toString() {
    return "Alumno [sexo=" + sexo + ", edad=" + edad + ", estatura=" + estatura + ", puntuacion1=" + puntuacion1
        + ", puntuacion2=" + puntuacion2 + ", haAprobado=" + haAprobado + "]\n";
  }

}
