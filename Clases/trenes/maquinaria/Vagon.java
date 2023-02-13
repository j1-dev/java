package Clases.trenes.maquinaria;

class Vagon {
  private static int cont;
  private int id;
  private int cargaMax;
  private int cargaActual;
  private String tipoCarga;

  public Vagon(int cargaMax, int cargaActual, String tipoCarga) {
    this.cargaMax = cargaMax;
    this.cargaActual = cargaActual;
    this.tipoCarga = tipoCarga;
    cont++;
    id = cont;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCargaMax() {
    return cargaMax;
  }

  public void setCargaMax(int cargaMax) {
    this.cargaMax = cargaMax;
  }

  public int getCargaActual() {
    return cargaActual;
  }

  public void setCargaActual(int cargaActual) {
    this.cargaActual = cargaActual;
  }

  public String getTipoCarga() {
    return tipoCarga;
  }

  public void setTipoCarga(String tipoCarga) {
    this.tipoCarga = tipoCarga;
  }

  @Override
  public String toString() {
    return "[V" + id + " - " + cargaActual + "kgs de " + cargaMax + "kgs de " + tipoCarga + "]";
  }

}
