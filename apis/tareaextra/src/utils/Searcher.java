package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import clases.Pelicula;
import clases.Persona;

public abstract class Searcher {
  public static ArrayList<Pelicula> searchMovies(String name) throws Exception {
    URL url = new URL(
        "https://api.themoviedb.org/3/search/movie?query=" + name + "&include_adult=false&language=en-US&page=1");

    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

    conn.setRequestMethod("GET");
    conn.setRequestProperty("accept", "application/json");
    conn.setRequestProperty("Authorization",
        "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIzMzA5OWQyOWQ0ZDQwNTdjYzNmYjRjYzZhODE3ZGY4MyIsInN1YiI6IjY0ODc2MTZkMDU4MjI0MDEzODY0NGI2ZSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.q_gHIthIUKtu_JOsTArB5ccJBPlgdhDRLkffsk2UNS4");

    int responseCode = conn.getResponseCode();

    if (responseCode == HttpURLConnection.HTTP_OK) { // success
      BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String inputLine;
      StringBuffer response = new StringBuffer();

      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }

      peliculas = Mapper.mapToPeliculas(response.toString());
      in.close();

    } else {
      System.out.println("GET request did not work.");
    }

    conn.connect();
    return peliculas;
  }

  public static ArrayList<Persona> searchPerson(String name) throws Exception {
    name = name.replace(" ", "%20");

    URL url = new URL(
        "https://api.themoviedb.org/3/search/person?query=" + name + "&include_adult=false&language=en-US&page=1");

    ArrayList<Persona> personas = new ArrayList<Persona>();
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

    conn.setRequestMethod("GET");
    conn.setRequestProperty("accept", "application/json");
    conn.setRequestProperty("Authorization",
        "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIzMzA5OWQyOWQ0ZDQwNTdjYzNmYjRjYzZhODE3ZGY4MyIsInN1YiI6IjY0ODc2MTZkMDU4MjI0MDEzODY0NGI2ZSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.q_gHIthIUKtu_JOsTArB5ccJBPlgdhDRLkffsk2UNS4");

    int responseCode = conn.getResponseCode();

    if (responseCode == HttpURLConnection.HTTP_OK) { // success
      BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String inputLine;
      StringBuffer response = new StringBuffer();

      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }

      personas = Mapper.mapToPersonas(response.toString());
      in.close();

    } else {
      System.out.println("GET request did not work.");
    }

    conn.connect();
    return personas;
  }
}
