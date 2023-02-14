package Clases.ClasesEJ;

public class Caja {
  private double importe;

  public Caja(double importe) {
    this.importe = importe;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  public void dar(double importe) {
    if (importe > this.importe) {
      System.out.println("No hay suficiente dinero");
    } else {
      this.importe -= importe;
    }
  }

  public void ingresar(double importe) {
    if (importe > 0) {
      this.importe += importe;
    }
  }

  public double saldo() {
    return getImporte();
  }

  public void atiende(Cliente cliente) {
    if (cliente.getAccion() == Accion.SACAR) {
      this.dar(cliente.getImporte());
    } else {
      this.ingresar(cliente.getImporte());
    }
  }

}
