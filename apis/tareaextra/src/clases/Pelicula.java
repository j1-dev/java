package clases;

public class Pelicula {
  private String title;
  private int year;
  private double rating;
  private int votes;
  private String summary;

  public Pelicula(String title, int year, double rating, int votes, String summary) {
    this.title = title;
    this.year = year;
    this.rating = rating;
    this.votes = votes;
    this.summary = summary;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public int getVotes() {
    return votes;
  }

  public void setVotes(int votes) {
    this.votes = votes;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  @Override
  public String toString() {
    return "{\n\tTitulo: " + title + "\n\tAño: " + year + "\n\tPuntuacion: " + rating + "\n\tVotos :" + votes
        + "\n\tResumen: " + summary + "\n}";
  }

}