import java.util.ArrayList;
import java.util.List;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

import clases.Pokedex;
import clases.Pokemon;
import utils.jsonUtils;

public class App {
  public static void main(String[] args) throws Exception {
    String filePath = "src/recursos/consultasPokemon.txt";

    try (FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
      // Leer Json que contiene 1 objeto y convertirlo en objeto

      bufferedWriter.write("====== LEYENDO POKEDEX =======================================");

      // Leer Json que contiene 1 array de objetos y convertirlo en un list<objeto>
      Pokedex pokedex = jsonUtils.ReadPokemonListFromJsonFile("src/recursos/pokemon.json");

      bufferedWriter.write("====== LECTURA COMPLETA ======================================= \n");
      bufferedWriter.write("====== 5 ULTIMOS POKEMON =======================");

      ArrayList<Pokemon> pokemons = pokedex.getPokemon();
      List<Pokemon> cincoUltimos = pokemons.subList(pokemons.size() - 5, pokemons.size());
      for (Pokemon pokemon : cincoUltimos) {
        bufferedWriter.write(pokemon.toString());
      }

      bufferedWriter.write("====== DATOS DE PIKACHU =======================");
      Pokemon pikachu = pokedex.buscarPorNombre("Pikachu");
      bufferedWriter.write(pikachu.toString());

      bufferedWriter.write("====== EVOLUCIONES DE CHARMANDER =======================");
      ArrayList<Pokemon> evolucionesCharmander = pokedex.buscarEvoluciones("Charmander");
      for (Pokemon pokemon : evolucionesCharmander) {
        bufferedWriter.write(pokemon.toString());
      }

      bufferedWriter.write("====== POKEMON TIPO FIRE =======================");
      ArrayList<Pokemon> tipoFire = pokedex.BuscarPorTipo("Fire");
      for (Pokemon pokemon : tipoFire) {
        bufferedWriter.write(pokemon.toString());
      }

      bufferedWriter.write("====== POKEMON CON DEBILIDAD WATER O ELECTRIC =======================");
      ArrayList<String> debilidades = new ArrayList<>();
      debilidades.add("Water");
      debilidades.add("Electric");
      ArrayList<Pokemon> pokemonWeakness = pokedex.buscarPorDebilidad(debilidades);
      for (Pokemon pokemon : pokemonWeakness) {
        bufferedWriter.write(pokemon.toString());
      }

      bufferedWriter.write("====== POKEMON CON MAS DEBILIDADES =======================");
      Pokemon pokemonDebil = pokedex.masDebil();
      bufferedWriter.write(pokemonDebil.toString());

      bufferedWriter.write("====== POKEMON MAS ALTO =======================");
      Pokemon pokemonAlto = pokedex.masAlto();
      bufferedWriter.write(pokemonAlto.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}