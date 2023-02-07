package Clases.Ejemplos;

public class Hora {
  private int horas; // de 0 a 23
  private int minutos; // de 0 a 59
  private int segundos; // de 0 a 59

  public Hora(int horas) {
    if (horas < 0 || horas >= 24) {
      System.out.println("hora incorrecta");
      horas = 0;
    } else {
      this.horas = horas;
      minutos = 0;
      segundos = 0;
    }
  }

  @Override
  public String toString() {
    return "Hora [horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + "]";
  }

  public Hora(int horas, int minutos) {
    this(horas);
    this.minutos = minutos;
    segundos = 0;
  }

  public Hora(int horas, int minutos, int segundos) {
    this(horas, minutos);
    this.segundos = segundos;
  }

  public int getHora() {
    return horas;
  }

  public void setHora(int horas) {
    this.horas = horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
    if (this.minutos >= 60) {
      this.minutos %= minutos;
      this.horas /= minutos;
    }
  }

  public int getSegundos() {
    return segundos;
  }

  public void setSegundos(int segundos) {
    this.segundos = segundos;
    if (this.segundos >= 60) {
      this.segundos %= segundos;
      this.minutos /= segundos;
    }
  }

  public void addHoras() {
    horas++;
    if (minutos >= 24) {
      minutos = 0;
      horas = 0;
    }
  }

  public void addMinutos() {
    minutos++;
    if (minutos >= 60) {
      minutos = 0;
      this.addHoras();
    }
  }

  public void addSegundos() {
    segundos++;
    if (segundos >= 60) {
      segundos = 0;
      this.addMinutos();
    }
  }

}
