package Clases.ClasesEJ;

public abstract class Publicacion {
  private String codigoISBN;
  private String titulo;
  private int anoPublicacion;

  public Publicacion(String codigoISBN, String titulo, int anoPublicacion) {
    this.codigoISBN = codigoISBN;
    this.titulo = titulo;
    this.anoPublicacion = anoPublicacion;
  }

  public String getCodigoISBN() {
    return codigoISBN;
  }

  public void setCodigoISBN(String codigoISBN) {
    this.codigoISBN = codigoISBN;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAnoPublicacion() {
    return anoPublicacion;
  }

  public void setAnoPublicacion(int anoPublicacion) {
    this.anoPublicacion = anoPublicacion;
  }

  @Override
  public String toString() {
    return "ISBN: " + codigoISBN + ", titulo: " + titulo + ", anoPublicacion: " + anoPublicacion;
  }

}
