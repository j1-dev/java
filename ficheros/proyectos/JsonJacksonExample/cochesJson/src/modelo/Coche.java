package modelo;

public class Coche {
  private String marca;
  private String modelo;
  private int anioFabricacion;
  private float precio;

  public Coche(String marca, String modelo, int anioFabricacion, float precio) {
    this.marca = marca;
    this.modelo = modelo;
    this.anioFabricacion = anioFabricacion;
    this.precio = precio;
  }

  public Coche() {
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAnioFabricacion() {
    return anioFabricacion;
  }

  public void setAnioFabricacion(int anioFabricacion) {
    this.anioFabricacion = anioFabricacion;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Coche [marca=" + marca + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + ", precio="
        + precio + "]";
  }

}
