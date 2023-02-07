package Clases.ClasesEJ;

public class TarjetaRegalo {
  private int nTarjeta;
  double saldo;

  public TarjetaRegalo() {
    saldo = 0d;
    nTarjeta = (int) (Math.random() * 100000);
  }

  public TarjetaRegalo(double saldo) {
    this();
    this.saldo = saldo;
  }

  public void gasta(double n) {
    if (n <= saldo) {
      saldo -= n;
    } else {
      System.out.println("No tiene suficiente saldo para gastar " + n + "€");
    }
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
    double saldo1 = this.saldo;
    double saldo2 = t.getSaldo();
    this.saldo = 0;
    t.setSaldo(0);
    return new TarjetaRegalo(saldo1 + saldo2);
  }

  @Override
  public String toString() {
    return "TarjetaRegalo [nTarjeta=" + nTarjeta + ", saldo=" + saldo + "]";
  }

}
