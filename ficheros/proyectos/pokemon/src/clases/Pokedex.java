package clases;

import java.util.ArrayList;

public class Pokedex {
  private ArrayList<Pokemon> pokemon;

  public Pokedex() {
  }

  public Pokedex(ArrayList<Pokemon> lista) {
    this.pokemon = lista;
  }

  public ArrayList<Pokemon> getLista() {
    return pokemon;
  }

  public void setLista(ArrayList<Pokemon> lista) {
    this.pokemon = lista;
  }

}
