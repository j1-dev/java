package Clases.ClasesEJ;

public class Revista extends Publicacion {
  private int numero;

  public Revista(String codigoISBN, String titulo, int anoPublicacion, int numero) {
    super(codigoISBN, titulo, anoPublicacion);
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

}
