package clases;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Evento {
  @JsonProperty("@id")
  private String id;
  @JsonProperty("@type")
  private String type;
  private String title;
  private String description;
  private int free;
  private String price;
  private String dtstart;
  private String dtend;
  private String time;
  @JsonProperty("event-location")
  private String eventLocation;

  public Evento() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getFree() {
    return free;
  }

  public void setFree(int free) {
    this.free = free;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getDtstart() {
    return dtstart;
  }

  public void setDtstart(String dtstart) {
    this.dtstart = dtstart;
  }

  public String getDtend() {
    return dtend;
  }

  public void setDtend(String dtend) {
    this.dtend = dtend;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getEventLocation() {
    return eventLocation;
  }

  public void setEventLocation(String eventLocation) {
    this.eventLocation = eventLocation;
  }

  @Override
  public String toString() {
    return "Evento [id=" + id + ", title=" + title + "]\n";
  }

}
