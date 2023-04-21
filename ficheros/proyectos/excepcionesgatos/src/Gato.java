public class Gato {
  private String nombre;
  private String raza;
  private String sexo;

  public Gato(String nombre, String raza, String sexo) {
    this.nombre = nombre;
    this.raza = raza;
    this.sexo = sexo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public Gato apareaCon(Gato g) throws ExcepcionApareamientoImposible {
    if (!this.sexo.equals(g.getSexo()))
      return new Gato(this.nombre, g.getRaza(), this.sexo);
    else
      throw new ExcepcionApareamientoImposible();
  }

  @Override
  public String toString() {
    return "Gato [nombre=" + nombre + ", raza=" + raza + ", sexo=" + sexo + "]";
  }

}
