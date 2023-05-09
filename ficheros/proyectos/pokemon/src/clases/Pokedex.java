package clases;

import java.util.ArrayList;

public class Pokedex {
  private ArrayList<Pokemon> lista;

  public Pokedex(ArrayList<Pokemon> lista) {
    this.lista = lista;
  }

  public ArrayList<Pokemon> getLista() {
    return lista;
  }

  public void setLista(ArrayList<Pokemon> lista) {
    this.lista = lista;
  }

}
