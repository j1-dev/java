package Clases.trenes.maquinaria;

import Clases.trenes.personal.Maquinista;

public class Tren {
  private static int cont;
  private int id;
  private Locomotora locomotora;
  private Maquinista maquinista;
  private Vagon[] vagones;
  private static int maxVagones = 5;

  public Tren(Locomotora locomotora, Maquinista maquinista) {
    this.locomotora = locomotora;
    this.maquinista = maquinista;
    this.vagones = new Vagon[0];
    cont++;
    id = cont;
  }

  public Locomotora getLocomotora() {
    return locomotora;
  }

  public void setLocomotora(Locomotora locomotora) {
    this.locomotora = locomotora;
  }

  public Maquinista getMaquinista() {
    return maquinista;
  }

  public void setMaquinista(Maquinista maquinista) {
    this.maquinista = maquinista;
  }

  public Vagon[] getVagones() {
    return vagones;
  }

  public void setVagones(Vagon[] vagones) {
    this.vagones = vagones;
  }

  public static int getMaxVagones() {
    return maxVagones;
  }

  public static void setMaxVagones(int maxVagones) {
    Tren.maxVagones = maxVagones;
  }

  public void enganchaVagon(int cargaMax, int cargaActual, String tipoCarga) {
    if (vagones.length < 5 && cargaActual <= cargaMax) {
      Vagon vagon = new Vagon(cargaMax, cargaActual, tipoCarga);
      vagones = insertarAlFinal(vagones, vagon);
    } else if (vagones.length >= 5) {
      System.out.println("Error - Se ha alcanzado el máximo de vagones en Tren " + id);
    } else {
      System.out.println("Error - Carga máxima del vagón alcanzada en Tren " + id);
    }
  }

  @Override
  public String toString() {
    String str = "";
    int carga = 0;
    str += locomotora + " - ";
    for (int i = 0; i < vagones.length; i++) {
      str += vagones[i] + " - ";
      carga += vagones[i].getCargaActual();
    }
    str += carga + "kgs de Carga total - ";
    str += maquinista;
    return str;
  }

  public static Vagon[] insertarAlFinal(Vagon[] arr, Vagon valor) {
    return insertarEnPosicion(arr, valor, arr.length);
  }

  public static Vagon[] insertarEnPosicion(Vagon[] arr, Vagon valor, int pos) {
    if (pos >= 0 && pos <= arr.length) {
      Vagon[] newArr = new Vagon[arr.length + 1];
      System.arraycopy(arr, 0, newArr, 0, pos);
      newArr[pos] = valor;
      System.arraycopy(arr, pos, newArr, pos + 1, arr.length - pos);

      return newArr;
    } else {
      System.out.println("Posición invalida");
      return arr;
    }
  }
}
