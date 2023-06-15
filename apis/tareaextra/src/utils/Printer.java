package utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import clases.Pelicula;
import clases.Persona;

public class Printer {
  /*
   * Metodo para imprimir un JSON de forma legible
   * 
   * @param jsonResponse JSON en formato String
   */
  public static void printJson(String jsonResponse) throws Exception {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);

    JsonNode jsonNode = objectMapper.readTree(jsonResponse);
    String formattedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

    System.out.println(formattedJson);
  }

  /*
   * Metodo para imprimir las peliculas encontradas hasta un limite
   * 
   * @param peliculas ArrayList de peliculas
   * 
   * @param limit Limite de peliculas a imprimir
   */
  public static void printMovies(ArrayList<Pelicula> peliculas, int limit) {
    int size = peliculas.size();

    if (limit > size) {
      limit = size;
    }

    System.out.println("Peliculas encontradas: " + limit);
    for (int i = 0; i < limit; i++) {
      System.out.println(i + 1 + ": " + peliculas.get(i).getTitle());
    }
  }

  /*
   * Metodo para imprimir las personas encontradas hasta un limite
   * 
   * @param personas ArrayList de personas
   * 
   * @param limit Limite de personas a imprimir
   */
  public static void printPersons(ArrayList<Persona> personas, int limit) {
    int size = personas.size();

    if (limit > size) {
      limit = size;
    }

    System.out.println("Personas encontradas: " + limit);
    for (int i = 0; i < limit; i++) {
      System.out.println(i + 1 + ": " + personas.get(i).getName());
    }
  }
}
