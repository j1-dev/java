package Clases.Ejemplos;

public class SintonizadorFM {
  private float frec;

  public SintonizadorFM(float frec) {
    if (frec < 80) {
      this.frec = 80;
    } else if (frec > 108) {
      this.frec = 108;
    } else {
      this.frec = frec;
    }
  }

  public void display() {
    System.out.println("Frecuencia: " + frec);
  }

  public void up() {
    frec += 0.5f;
    if (frec > 108) {
      frec = 80;
    }
  }

  public void down() {
    frec -= 0.5f;
    if (frec < 80) {
      frec = 108;
    }
  }

}
