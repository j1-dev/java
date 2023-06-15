package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import clases.Pelicula;
import clases.Persona;

public abstract class Searcher {
  /*
   * Metodo para buscar una lista de peliculas por nombre
   * 
   * @param name Nombre de la pelicula
   * 
   * @return ArrayList de peliculas
   */
  public static ArrayList<Pelicula> searchMovies(String name) throws Exception {
    name = name.replace(" ", "%20");

    URL url = new URL(
        "https://api.themoviedb.org/3/search/movie?query=" + name + "&include_adult=false&language=en-US&page=1");

    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    HttpURLConnection conn = createConnection(url);

    int responseCode = conn.getResponseCode();

    if (responseCode == HttpURLConnection.HTTP_OK) { // OK
      peliculas = Mapper.mapToPeliculas(getResponse(conn));
    } else {
      System.out.println("GET request did not work.");
    }

    conn.disconnect();
    return peliculas;
  }

  /*
   * Metodo para buscar una lista de personas por nombre
   * 
   * @param name Nombre de la persona
   * 
   * @return ArrayList de personas
   */
  public static ArrayList<Persona> searchPerson(String name) throws Exception {
    name = name.replace(" ", "%20");

    URL url = new URL(
        "https://api.themoviedb.org/3/search/person?query=" + name + "&include_adult=false&language=en-US&page=1");

    ArrayList<Persona> personas = new ArrayList<Persona>();
    HttpURLConnection conn = createConnection(url);

    int responseCode = conn.getResponseCode();

    if (responseCode == HttpURLConnection.HTTP_OK) { // OK
      personas = Mapper.mapToPersonas(getResponse(conn));
    } else {
      System.out.println("GET request did not work.");
    }

    conn.disconnect();
    return personas;
  }

  /*
   * Metodo para crear una conexion HTTP
   * 
   * @param url URL de la conexion
   * 
   * @return HttpURLConnection
   */
  public static HttpURLConnection createConnection(URL url) throws IOException {
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

    conn.setRequestMethod("GET");
    conn.setRequestProperty("accept", "application/json");
    conn.setRequestProperty("Authorization",
        "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIzMzA5OWQyOWQ0ZDQwNTdjYzNmYjRjYzZhODE3ZGY4MyIsInN1YiI6IjY0ODc2MTZkMDU4MjI0MDEzODY0NGI2ZSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.q_gHIthIUKtu_JOsTArB5ccJBPlgdhDRLkffsk2UNS4");

    return conn;
  }

  /*
   * Metodo para obtener la respuesta de una conexion HTTP
   * 
   * @param conn HttpURLConnection
   * 
   * @return String con la respuesta
   */
  public static String getResponse(HttpURLConnection conn) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();

    return response.toString();
  }
}
