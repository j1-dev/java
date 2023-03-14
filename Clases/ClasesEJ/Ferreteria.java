package Clases.ClasesEJ;

import java.util.Arrays;

import Clases.ClasesEJ.Negocio;
import Clases.Interfaces.Tienda_I;

public class Ferreteria extends Negocio implements Tienda_I {
  private int tipoIva;
  private Cliente[] cola;
  private double dineroEnCaja;

  public Ferreteria(String nombre, String cif) {
    super(nombre, cif);
    cola = new Cliente[0];
    dineroEnCaja = 100;
    tipoIva = 21;
  }

  public int getTipoIva() {
    return tipoIva;
  }

  public void setTipoIva(int tipoIva) {
    this.tipoIva = tipoIva;
  }

  public Cliente[] getCola() {
    return cola;
  }

  public void setCola(Cliente[] cola) {
    this.cola = cola;
  }

  public double getDineroEnCaja() {
    return dineroEnCaja;
  }

  public void setDineroEnCaja(double dineroEnCaja) {
    this.dineroEnCaja = dineroEnCaja;
  }

  @Override
  public void abrir() {
    System.out.println("La ferretería: " + super.getNombre() + " ha abierto");
  }

  @Override
  public void cobrar() {
    if (cola.length > 0) {
      Cliente c = cola[0];
      Cliente[] newCola = new Cliente[cola.length - 1];
      for (int i = 0; i < newCola.length; i++) {
        newCola[i] = cola[i + 1];
      }
      cola = newCola;
      System.out.println(c.getNombre() + " ha sido atendido");
      dineroEnCaja += c.getImporte();
    } else {
      System.out.println("No hay nadie");
    }
  }

  @Override
  public void ponerEnCola(Cliente c) {
    Cliente[] newCola = new Cliente[cola.length + 1];
    for (int i = 0; i < cola.length; i++) {
      newCola[i] = cola[i];
    }
    newCola[cola.length] = c;
    cola = newCola;
  }

  @Override
  public void pagar_impuesto() {
    System.out.println("Impuestos pagados");
  }

  @Override
  public String toString() {
    return "Ferreteria [tipoIva=" + tipoIva + ", cola=" + Arrays.toString(cola) + ", dineroEnCaja=" + dineroEnCaja
        + "]";
  }

}
