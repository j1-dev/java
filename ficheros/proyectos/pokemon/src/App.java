import java.util.ArrayList;
import java.util.List;

import clases.Pokedex;
import clases.Pokemon;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, JSon!");

        // Leer Json que contiene 1 objeto y convertirlo en objeto

        System.out.println("==============================================");

        // Leer Json que contiene 1 array de objetos y convertirlo en un list<objeto>
        Pokemon[] listaPokemon = jsonUtils.ReadPokemonListFromJsonFile("src/recursos/pokemon.json");
        // ArrayList<Pokemon> nuevaListaPokemon = new ArrayList<>(listaPokemon);

        // Pokedex pokedex = new Pokedex(nuevaListaPokemon);

        System.out.println("====== ARRAY EMPLEADOS =======================");

        for (Pokemon pokemon : listaPokemon) {
            System.out.println(pokemon);
        }

        System.out.println("==============================================");

        // Convertir objeto a Json
    }
}