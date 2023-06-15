package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import clases.Pelicula;
import clases.Persona;

import java.util.ArrayList;

public class Mapper {
  // ObjectMapper mapea el Json a objetos Java
  private static ObjectMapper objectMapper = new ObjectMapper();

  /*
   * Metodo para mapear una respuesta Json a un ArrayList de peliculas
   * 
   * @param jsonResponse Respuesta Json en formato String
   * 
   * @return ArrayList de peliculas
   */
  public static ArrayList<Pelicula> mapToPeliculas(String jsonResponse) throws Exception {
    JsonNode rootNode = objectMapper.readTree(jsonResponse);
    JsonNode resultsNode = rootNode.get("results");

    if (resultsNode == null || !resultsNode.isArray() || resultsNode.size() == 0) {
      return new ArrayList<>();
    }

    ArrayList<Pelicula> peliculas = new ArrayList<>();

    for (JsonNode movieNode : resultsNode) {
      String title = getJsonNodeTextValue(movieNode, "title");
      int year = extractYearFromDate(getJsonNodeTextValue(movieNode, "release_date"));
      double rating = getJsonNodeDoubleValue(movieNode, "vote_average");
      int votes = getJsonNodeIntValue(movieNode, "vote_count");
      String summary = getJsonNodeTextValue(movieNode, "overview");

      Pelicula pelicula = new Pelicula(title, year, rating, votes, summary);
      peliculas.add(pelicula);
    }

    return peliculas;
  }

  /*
   * Metodo para mapear una respuesta Json a un ArrayList de personas
   * 
   * @param jsonResponse Respuesta Json en formato String
   * 
   * @return ArrayList de personas
   */
  public static ArrayList<Persona> mapToPersonas(String jsonResponse) throws Exception {
    JsonNode rootNode = objectMapper.readTree(jsonResponse);
    JsonNode resultsNode = rootNode.get("results");

    if (resultsNode == null || !resultsNode.isArray() || resultsNode.size() == 0) {
      return new ArrayList<>();
    }

    ArrayList<Persona> personas = new ArrayList<>();

    for (JsonNode personaNode : resultsNode) {
      String name = getJsonNodeTextValue(personaNode, "name");
      String gender = mapGender(getJsonNodeIntValue(personaNode, "gender"));
      String role = getJsonNodeTextValue(personaNode, "known_for_department");
      Double popularity = getJsonNodeDoubleValue(personaNode, "popularity");
      ArrayList<Pelicula> filmography = mapFilmography(personaNode.get("known_for"));

      Persona persona = new Persona(name, gender, role, popularity, filmography);
      personas.add(persona);
    }

    return personas;
  }

  /*
   * Metodo para mapear una respuesta un node Json de la respuesta de personas a
   * un array de peliculas
   * 
   * @param knownForNode Node Json de la respuesta de personas
   * 
   * @return ArrayList de peliculas
   */
  private static ArrayList<Pelicula> mapFilmography(JsonNode knownForNode) throws Exception {
    ArrayList<Pelicula> filmography = new ArrayList<>();

    if (knownForNode != null && knownForNode.isArray()) {
      for (JsonNode movieNode : knownForNode) {
        String title = getJsonNodeTextValue(movieNode, "title");
        int year = extractYearFromDate(getJsonNodeTextValue(movieNode, "release_date"));
        double rating = getJsonNodeDoubleValue(movieNode, "vote_average");
        int votes = getJsonNodeIntValue(movieNode, "vote_count");
        String summary = getJsonNodeTextValue(movieNode, "overview");

        Pelicula pelicula = new Pelicula(title, year, rating, votes, summary);
        filmography.add(pelicula);
      }
    }

    return filmography;
  }

  /*
   * Metodo para mapear un codigo de genero a un String
   * 
   * @param genderCode Codigo de genero
   * 
   * @return String con el genero
   */
  private static String mapGender(int genderCode) {
    switch (genderCode) {
      case 1:
        return "female";
      case 2:
        return "male";
      default:
        return "other";
    }
  }

  /*
   * Metodo para extraer el año de una fecha
   * 
   * @param date Fecha en formato String
   * 
   * @return Año de la fecha
   */
  private static int extractYearFromDate(String date) {
    if (date != null) {
      String[] parts = date.split("-");
      if (parts.length > 0) {
        String yearString = parts[0];
        if (isNumeric(yearString)) {
          return Integer.parseInt(yearString);
        }
      }
    }
    return 0;
  }

  /*
   * Metodo para comprobar si un String es un numero
   * 
   * @param str String a comprobar
   * 
   * @return true si es un numero, false si no lo es
   */
  private static boolean isNumeric(String str) {
    if (str == null) {
      return false;
    }
    try {
      Integer.parseInt(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  /*
   * Metodos para obtener el valor de un campo de un node Json de tipo String, int
   * o double
   * 
   * @param node Node Json
   * 
   * @param fieldName Nombre del campo
   * 
   * @return Valor del campo
   */

  private static String getJsonNodeTextValue(JsonNode node, String fieldName) {
    JsonNode valueNode = node.get(fieldName);
    return valueNode != null ? valueNode.asText() : null;
  }

  private static double getJsonNodeDoubleValue(JsonNode node, String fieldName) {
    JsonNode valueNode = node.get(fieldName);
    return valueNode != null ? valueNode.asDouble() : 0.0;
  }

  private static int getJsonNodeIntValue(JsonNode node, String fieldName) {
    JsonNode valueNode = node.get(fieldName);
    return valueNode != null ? valueNode.asInt() : 0;
  }
}
