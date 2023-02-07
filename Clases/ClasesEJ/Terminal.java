package Clases.ClasesEJ;

public class Terminal {
  private String numero;
  private int segundos;

  public Terminal() {
    numero = "";
    segundos = 0;
  }

  public Terminal(String numero) {
    this();
    this.numero = numero;
  }

  public Terminal(String numero, int segundos) {
    this.numero = numero;
    this.segundos = segundos;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public int getSegundos() {
    return segundos;
  }

  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }

  public void llama(Terminal t, int segundos) {
    if (segundos > 0) {
      this.segundos += segundos;
      t.setSegundos(t.getSegundos() + segundos);
    }
  }

  @Override
  public String toString() {
    return numero + " - segundos de conversación: " + segundos + "s";
  }

}
