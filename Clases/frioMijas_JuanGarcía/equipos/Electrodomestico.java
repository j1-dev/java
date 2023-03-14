package Clases.frioMijas_JuanGarcía.equipos;

public abstract class Electrodomestico {
<<<<<<< HEAD
  private double alto;
  private double ancho;
  private double profundidad;
  private int frigorias;
  private String marca;

  public Electrodomestico(double alto, double ancho, double profundidad, int frigorias, String marca) {
    this.alto = alto;
    this.ancho = ancho;
    this.profundidad = profundidad;
    this.frigorias = frigorias;
    this.marca = marca;
  }

  public double getAlto() {
    return alto;
  }

  public void setAlto(double alto) {
    this.alto = alto;
  }

  public double getAncho() {
    return ancho;
  }

  public void setAncho(double ancho) {
    this.ancho = ancho;
  }

  public double getProfundidad() {
    return profundidad;
  }

  public void setProfundidad(double profundidad) {
    this.profundidad = profundidad;
  }

  public int getFrigorias() {
    return frigorias;
  }

  public void setFrigorias(int frigorias) {
    this.frigorias = frigorias;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  @Override
  public String toString() {
    String str = "";

    str += "alto: " + alto + ",\n";
    str += "ancho: " + ancho + ",\n";
    str += "profundidad: " + profundidad + ",\n";
    str += "frigorias: " + frigorias + ",\n";
    str += "marca: " + marca + ",\n";

    return str;
  }

  public double volumen() {
    return (alto * ancho * profundidad);
  }

  public abstract double consumo();
=======
  
>>>>>>> 45571ae (14 mar. (PI day :tada:))
}
