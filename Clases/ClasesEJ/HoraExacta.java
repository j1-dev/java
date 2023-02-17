package Clases.ClasesEJ;

public class HoraExacta extends Hora {
  private int segundos;

  public HoraExacta(int hora, int minutos, int segundos) {
    super(hora, minutos);
    this.segundos = segundos;
  }

  public boolean setSegundos(int segundos) {
    if (segundos < 0 || segundos > 59) {
      return false;
    } else {
      this.segundos = segundos;
      return true;
    }
  }

  public int getSegundos() {
    return segundos;
  }

  @Override
  public void inc() {
    if (segundos < 60) {
      segundos++;
    } else {
      segundos = 0;
    }
  }

  @Override
  public String toString() {
    return "[" + getHora() + ":" + getMinutos() + ":" + segundos + "]";
  }

  @Override
  public boolean equals(Object o) {
    HoraExacta h = (HoraExacta) o;
    return this.getHora() == h.getHora() && this.getHora() == h.getMinutos() && this.segundos == h.getSegundos();
  }
}
