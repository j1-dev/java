package Clases.ClasesEJ;

public class Movil extends Terminal {
  public enum Tarifa {
    RATA, MONO, BISONTE
  } // 6,12,30 Cts por minuto

  private Tarifa tarifa;

  public Movil(String tarifa) {
    tarifa = tarifa.toUpperCase();
    Tarifa tarifaEnum = Tarifa.valueOf(tarifa);
    this.tarifa = tarifaEnum;
  }

  public Movil(String numero, String tarifa) {
    super(numero);
    tarifa = tarifa.toUpperCase();
    Tarifa tarifaEnum = Tarifa.valueOf(tarifa);
    this.tarifa = tarifaEnum;
  }

  public Movil(String numero, int segundos, String tarifa) {
    super(numero, segundos);
    tarifa = tarifa.toUpperCase();
    Tarifa tarifaEnum = Tarifa.valueOf(tarifa);
    this.tarifa = tarifaEnum;
  }

  public double totalTarificados() {
    double res = 0d;
    switch (tarifa) {
      case RATA:
        res = getSegundos() / 60 * 0.06;
        break;
      case MONO:
        res = getSegundos() / 60 * 0.12;
        break;
      case BISONTE:
        res = getSegundos() / 60 * 0.30;
        break;
      default:
        break;
    }
    return res;
  }

}
