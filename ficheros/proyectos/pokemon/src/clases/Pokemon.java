package clases;

import java.util.ArrayList;

public class Pokemon {
  private Integer id;
  private String num;
  private String name;
  private String img;
  private ArrayList<String> type;
  private String height;
  private String weight;
  private String candy;
  private Integer candy_count;
  private String egg;
  private Double spawn_chance;
  private Integer avg_spawns;
  private String spawn_time;
  private ArrayList<Double> multipliers;
  private ArrayList<String> weaknesses;
  private ArrayList<Pokemon> prev_evolution;
  private ArrayList<Pokemon> next_evolution;

  public Pokemon() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNum() {
    return num;
  }

  public void setNum(String num) {
    this.num = num;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public ArrayList<String> getType() {
    return type;
  }

  public void setType(ArrayList<String> type) {
    this.type = type;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  public String getCandy() {
    return candy;
  }

  public void setCandy(String candy) {
    this.candy = candy;
  }

  public Integer getCandy_count() {
    return candy_count;
  }

  public void setCandy_count(Integer candy_count) {
    this.candy_count = candy_count;
  }

  public String getEgg() {
    return egg;
  }

  public void setEgg(String egg) {
    this.egg = egg;
  }

  public Integer getAvg_spawns() {
    return avg_spawns;
  }

  public void setAvg_spawns(Integer avg_spawns) {
    this.avg_spawns = avg_spawns;
  }

  public String getSpawn_time() {
    return spawn_time;
  }

  public void setSpawn_time(String spawn_time) {
    this.spawn_time = spawn_time;
  }

  public ArrayList<Double> getMultipliers() {
    return multipliers;
  }

  public void setMultipliers(ArrayList<Double> multipliers) {
    this.multipliers = multipliers;
  }

  public ArrayList<String> getWeaknesses() {
    return weaknesses;
  }

  public void setWeaknesses(ArrayList<String> weaknesses) {
    this.weaknesses = weaknesses;
  }

  public ArrayList<Pokemon> getPrev_evolution() {
    return prev_evolution;
  }

  public void setPrev_evolution(ArrayList<Pokemon> prev_evolution) {
    this.prev_evolution = prev_evolution;
  }

  public ArrayList<Pokemon> getNext_evolution() {
    return next_evolution;
  }

  public void setNext_evolution(ArrayList<Pokemon> next_evolution) {
    this.next_evolution = next_evolution;
  }

  public Double getSpawn_chance() {
    return spawn_chance;
  }

  public void setSpawn_chance(Double spawn_chance) {
    this.spawn_chance = spawn_chance;
  }

  public Pokemon(Integer id, String num, String name, String img, ArrayList<String> type, String height, String weight,
      String candy, Integer candy_count, String egg, Double spawn_chance, Integer avg_spawns, String spawn_time,
      ArrayList<Double> multipliers, ArrayList<String> weaknesses, ArrayList<Pokemon> prev_evolution,
      ArrayList<Pokemon> next_evolution) {
    this.id = id;
    this.num = num;
    this.name = name;
    this.img = img;
    this.type = type;
    this.height = height;
    this.weight = weight;
    this.candy = candy;
    this.candy_count = candy_count;
    this.egg = egg;
    this.spawn_chance = spawn_chance;
    this.avg_spawns = avg_spawns;
    this.spawn_time = spawn_time;
    this.multipliers = multipliers;
    this.weaknesses = weaknesses;
    this.prev_evolution = prev_evolution;
    this.next_evolution = next_evolution;
  }

  @Override
  public String toString() {
    return "{\n\tid: " + id + "\n\tname: " + name + "\n\tnum: " + num + "\n\ttype: " + type +
        "\n\theight: " + height + "\n\tweight: " + weight + "\n\tweaknesses: " + weaknesses + "\n}";

  }

}