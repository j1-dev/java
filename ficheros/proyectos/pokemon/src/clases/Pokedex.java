package clases;

import java.util.ArrayList;

public class Pokedex {
  private ArrayList<Pokemon> pokemon;

  public Pokedex() {
  }

  public Pokedex(ArrayList<Pokemon> lista) {
    this.pokemon = lista;
  }

  public ArrayList<Pokemon> getPokemon() {
    return pokemon;
  }

  public void setPokemon(ArrayList<Pokemon> lista) {
    this.pokemon = lista;
  }

  public Pokemon buscarPorNombre(String nombre) {
    for (Pokemon pok : pokemon) {
      if (pok.getName().equals(nombre)) {
        return pok;
      }
    }
    return null;
  }

  public ArrayList<Pokemon> buscarEvoluciones(String nombre) {
    Pokemon pok = buscarPorNombre(nombre);
    return pok.getNext_evolution();
  }

  public ArrayList<Pokemon> BuscarPorTipo(String tipo) {
    ArrayList<Pokemon> newPokemon = new ArrayList<>();

    for (Pokemon pok : pokemon) {
      ArrayList<String> tipos = pok.getType();
      if (tipos.contains(tipo)) {
        newPokemon.add(pok);
      }
    }

    return newPokemon;
  }

  public ArrayList<Pokemon> buscarPorDebilidad(ArrayList<String> debilidades) {
    ArrayList<Pokemon> newPokemon = new ArrayList<>();

    for (Pokemon pok : pokemon) {
      ArrayList<String> newDebilidades = pok.getWeaknesses();
      for (String deb : newDebilidades) {
        if (debilidades.contains(deb)) {
          newPokemon.add(pok);
          break;
        }
      }
    }

    return newPokemon;
  }

  public Pokemon masDebil() {
    int contDebilidades = 0;
    Pokemon p = null;

    for (Pokemon pok : pokemon) {
      int contInterno = pok.getWeaknesses().size();
      if (contInterno > contDebilidades) {
        contDebilidades = contInterno;
        p = pok;
      }
    }

    return p;
  }

  public Pokemon masAlto() {
    double altura = 0.0;
    Pokemon p = null;

    for (Pokemon pok : pokemon) {
      String alturaString = pok.getHeight();
      alturaString = alturaString.replace("m", " ").trim();
      double alturaInterna = Double.parseDouble(alturaString);
      if (alturaInterna > altura) {
        altura = alturaInterna;
        p = pok;
      }
    }

    return p;
  }

}
