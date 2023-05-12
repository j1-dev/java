import java.util.ArrayList;
import java.util.List;

import clases.Pokedex;
import clases.Pokemon;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, JSon!");

        // Leer Json que contiene 1 objeto y convertirlo en objeto

        System.out.println("====== LEYENDO POKEDEX =======================================");

        // Leer Json que contiene 1 array de objetos y convertirlo en un list<objeto>
        Pokedex pokedex = jsonUtils.ReadPokemonListFromJsonFile("src/recursos/pokemon.json");

        System.out.println("====== LECTURA COMPLETA ======================================= \n");
        System.out.println("====== 5 ULTIMOS POKEMON =======================");

        ArrayList<Pokemon> pokemons = pokedex.getPokemon();
        List<Pokemon> cincoUltimos = pokemons.subList(pokemons.size() - 5, pokemons.size());
        for (Pokemon pokemon : cincoUltimos) {
            System.out.println(pokemon);
        }

        System.out.println("====== DATOS DE PIKACHU =======================");
        Pokemon pikachu = pokedex.buscarPorNombre("Pikachu");
        System.out.println(pikachu);

        System.out.println("====== EVOLUCIONES DE CHARMANDER =======================");
        ArrayList<Pokemon> evolucionesCharmander = pokedex.buscarEvoluciones("Charmander");
        for (Pokemon pokemon : evolucionesCharmander) {
            System.out.println(pokemon);
        }

        System.out.println("====== POKEMON TIPO FIRE =======================");
        ArrayList<Pokemon> tipoFire = pokedex.BuscarPorTipo("Fire");
        for (Pokemon pokemon : tipoFire) {
            System.out.println(pokemon);
        }

        System.out.println("====== POKEMON CON DEBILIDAD WATER O ELECTRIC =======================");
        ArrayList<String> debilidades = new ArrayList<>();
        debilidades.add("Water");
        debilidades.add("Electric");
        ArrayList<Pokemon> pokemonWeakness = pokedex.buscarPorDebilidad(debilidades);
        for (Pokemon pokemon : pokemonWeakness) {
            System.out.println(pokemon);
        }

        System.out.println("====== POKEMON CON MAS DEBILIDADES =======================");
        Pokemon pokemonDebil = pokedex.masDebil();
        System.out.println(pokemonDebil);

        System.out.println("====== POKEMON MAS ALTO =======================");
        Pokemon pokemonAlto = pokedex.masAlto();
        System.out.println(pokemonAlto);
    }
}