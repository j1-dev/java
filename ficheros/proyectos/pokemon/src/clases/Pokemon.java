package clases;

import java.util.ArrayList;
import java.util.HashMap;

public class Pokemon {
  private Integer id;
  private String num;
  private String name;
  private String img;
  private ArrayList<String> type;
  private String height;
  private String weight;
  private String candy;
  private Integer candyCount;
  private String egg;
  private Double spawnChance;
  private Integer avgSpawns;
  private String spawnTime;
  private ArrayList<Double> multipliers;
  private ArrayList<String> weaknesses;
  private HashMap<String, String> nextEvolution;

  public Pokemon() {
  }

  public Pokemon(Integer id, String num, String name, String img, ArrayList<String> type, String height, String weight,
      String candy, Integer candyCount, String egg, Double spawnChance, Integer avgSpawns, String spawnTime,
      ArrayList<Double> multipliers, ArrayList<String> weaknesses, HashMap<String, String> nextEvolution) {
    this.id = id;
    this.num = num;
    this.name = name;
    this.img = img;
    this.type = type;
    this.height = height;
    this.weight = weight;
    this.candy = candy;
    this.candyCount = candyCount;
    this.egg = egg;
    this.spawnChance = spawnChance;
    this.avgSpawns = avgSpawns;
    this.spawnTime = spawnTime;
    this.multipliers = multipliers;
    this.weaknesses = weaknesses;
    this.nextEvolution = nextEvolution;
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

  public Integer getCandyCount() {
    return candyCount;
  }

  public void setCandyCount(Integer candyCount) {
    this.candyCount = candyCount;
  }

  public String getEgg() {
    return egg;
  }

  public void setEgg(String egg) {
    this.egg = egg;
  }

  public Double getSpawnChance() {
    return spawnChance;
  }

  public void setSpawnChance(Double spawnChance) {
    this.spawnChance = spawnChance;
  }

  public Integer getAvgSpawns() {
    return avgSpawns;
  }

  public void setAvgSpawns(Integer avgSpawns) {
    this.avgSpawns = avgSpawns;
  }

  public String getSpawnTime() {
    return spawnTime;
  }

  public void setSpawnTime(String spawnTime) {
    this.spawnTime = spawnTime;
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

  public HashMap<String, String> getNextEvolution() {
    return nextEvolution;
  }

  public void setNextEvolution(HashMap<String, String> nextEvolution) {
    this.nextEvolution = nextEvolution;
  }

}