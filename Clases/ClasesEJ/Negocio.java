package Clases.ClasesEJ;

public abstract class Negocio {
  private String nombre;
  private String cif;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCif() {
    return cif;
  }

  public void setCif(String cif) {
    this.cif = cif;
  }

  public Negocio(String nombre, String cif) {
    this.nombre = nombre;
    this.cif = cif;
  }

  public abstract void pagar_impuesto();

}
