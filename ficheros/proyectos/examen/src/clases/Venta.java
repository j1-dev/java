package clases;

import java.util.ArrayList;

public class Venta {
  private Integer codigoCliente;
  private String fecha;
  private ArrayList<Linea> lineas;

  public Venta() {
  }

  public Integer getCodigoCliente() {
    return codigoCliente;
  }

  public void setCodigoCliente(Integer codigoCliente) {
    this.codigoCliente = codigoCliente;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public ArrayList<Linea> getLineas() {
    return lineas;
  }

  public void setLineas(ArrayList<Linea> lineas) {
    this.lineas = lineas;
  }

  @Override
  public String toString() {
    return "Venta [codigoCliente=" + codigoCliente + ", fecha=" + fecha + ", lineas=" + lineas + "]";
  }

}
