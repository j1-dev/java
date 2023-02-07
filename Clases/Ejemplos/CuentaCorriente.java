package Clases.Ejemplos;

public class CuentaCorriente {

  private String DNI;
  private double saldoInit;
  private Gestor gestor;

  public CuentaCorriente() {
    DNI = "";
    gestor = new Gestor("", "");
    saldoInit = 0.0d;
  }

  public CuentaCorriente(String DNI, String nombre) {
    this();
    this.gestor.setNombre(nombre);
    this.DNI = DNI;
  }

  public CuentaCorriente(String DNI, String nombre, double saldoInit) {
    this(DNI, nombre);
    this.saldoInit = saldoInit;
  }

  public static CuentaCorriente crearCuenta(String DNI, String nombre) {
    return new CuentaCorriente(DNI, nombre);
  }

  public void sacarDinero(double cantidad) {
    if (cantidad > saldoInit) {
      System.out.println("Cantidad a retirar inapropiada");
      return;
    }
    saldoInit -= cantidad;
  }

  public void ingresar(double cantidad) {
    saldoInit += cantidad;
  }

  public String getDNI() {
    return DNI;
  }

  public void setDNI(String dNI) {
    DNI = dNI;
  }

  public double getSaldoInit() {
    return saldoInit;
  }

  public void setSaldoInit(double saldoInit) {
    this.saldoInit = saldoInit;
  }

  public Gestor getGestor() {
    return gestor;
  }

  public void setGestor(Gestor gestor) {
    this.gestor = gestor;
  }

  public void muestra() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "CuentaCorriente [DNI=" + DNI + ", nombre=" + gestor.getNombre() + ", saldoInit=" + saldoInit + "]";
  }
}
