package clases;

import java.util.ArrayList;

public class Persona {
  private String name;
  private String gender;
  private String role;
  private Double popularity;
  private ArrayList<Pelicula> filmography;

  public Persona(String name, String gender, String role, Double popularity, ArrayList<Pelicula> filmography) {
    this.name = name;
    this.gender = gender;
    this.role = role;
    this.popularity = popularity;
    this.filmography = filmography;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Double getPopularity() {
    return popularity;
  }

  public void setPopularity(Double popularity) {
    this.popularity = popularity;
  }

  public ArrayList<Pelicula> getFilmography() {
    return filmography;
  }

  public void setFilmography(ArrayList<Pelicula> filmography) {
    this.filmography = filmography;
  }

  @Override
  public String toString() {
    return "{\n\tNombre: " + name + "\n\tGenero: " + gender + "\n\tRol: " + role + "\n\tPopularidad: " + popularity
        + "\n\tConocido/a por: "
        + filmographyString(filmography) + "\n}";
  }

  public String filmographyString(ArrayList<Pelicula> filmography) {
    String filmographyString = "";
    for (Pelicula pelicula : filmography) {
      filmographyString += pelicula.getTitle() + ", ";
    }
    return filmographyString;
  }

}
