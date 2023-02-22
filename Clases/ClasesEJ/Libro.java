package Clases.ClasesEJ;

public class Libro extends Publicacion implements Prestable {
  public boolean prestado;

  public Libro(String codigoISBN, String titulo, int anoPublicacion) {
    super(codigoISBN, titulo, anoPublicacion);
    prestado = false;
  }

  public void presta() {
    if (!prestado) {
      prestado = true;
    } else {
      System.out.println("Lo siento, este libro ya está prestado");
    }
  }

  public void devuelve() {
    prestado = false;
  }

  public boolean estaPrestado() {
    return prestado;
  }

  @Override
  public String toString() {
    return super.toString() + (prestado ? " (prestado)" : " (no prestado)");
  }
}
