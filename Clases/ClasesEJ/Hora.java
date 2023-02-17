package Clases.ClasesEJ;

public class Hora {
  private int hora;
  private int minutos;

  public Hora(int hora, int minutos) {
    this.hora = hora;
    this.minutos = minutos;
  }

  public int getHora() {
    return hora;
  }

  public boolean setHora(int hora) {
    if (hora < 0 || hora > 23) {
      return false;
    } else {
      this.hora = hora;
      return true;
    }
  }

  public int getMinutos() {
    return minutos;
  }

  public boolean setMinutos(int minutos) {
    if (minutos < 0 || minutos > 59) {
      return false;
    } else {
      this.minutos = minutos;
      return true;
    }
  }

  public void inc() {
    if (minutos < 60) {
      minutos++;
    } else {
      minutos = 0;
      if (hora < 24) {
        hora++;
      } else {
        hora = 0;
      }
    }
  }

  @Override
  public String toString() {
    return "[" + hora + ":" + minutos + "]";
  }

  @Override
  public boolean equals(Object o) {
    Hora h = (Hora) o;
    return this.hora == h.getHora() && this.minutos == h.getMinutos();
  }

}
