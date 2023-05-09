package utils;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import modelo.Coche;

public class jsonUtils {

  public static Coche LeerEmpleadoFromJsonFile(String relativePathFile) {

    // File ficheroEmpleado = new File("src/recursos/employee.txt");
    File ficheroEmpleado = new File(relativePathFile);
    // byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));

    // create ObjectMapper instance
    ObjectMapper objectMapper = new ObjectMapper();

    // convert json string to object
    Coche emp = null;
    try {
      emp = objectMapper.readValue(ficheroEmpleado, Coche.class);
    } catch (IOException e) {

      e.printStackTrace();
    }

    System.out.println("Employee Object\n" + emp);
    return emp;

  }

  public static List<Coche> LeerListEmpleadoFromJsonFile(String relativePathFile) {
    File ficheroEmpleado = new File(relativePathFile);

    ObjectMapper objectMapper = new ObjectMapper();

    List<Coche> listaEmpleados = null;
    try {
      listaEmpleados = objectMapper.readValue(ficheroEmpleado, new TypeReference<List<Coche>>() {
      });
    } catch (IOException e) {

      e.printStackTrace();
    }

    return listaEmpleados;
  }

  /**
   * Convierte un objeto en un Json
   */
  public static void convertToJson(Coche c) {
    try {
      ObjectMapper objectMapper = new ObjectMapper();
      // configure Object mapper for pretty print
      objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

      // Puedo imprimirlo por consola
      // writing to console, can write to any output stream such as file
      // StringWriter stringEmp = new StringWriter();
      // Sacar por consola el Json
      // objectMapper.writeValue(stringEmp, emp1);
      // System.out.println("Employee JSON is\n"+stringEmp);

      // Puedo guardarlo en un fichero
      File fileCoche = new File("src/recursos/coche2.json");
      objectMapper.writeValue(fileCoche, c);

    } catch (Exception ex) {
      System.out.println(ex);
    }
  }

  public static Coche createCar() {

    Coche emp = new Coche("Nissan", "Kashkai", 2022, 20000.0f);

    return emp;
  }

  /*
   * 
   * //writing to console, can write to any output stream such as file
   * StringWriter stringEmp = new StringWriter();
   * objectMapper.writeValue(stringEmp, emp1);
   * System.out.println("Employee JSON is\n"+stringEmp);
   * 
   * 
   * //converting json to Map
   * byte[] mapData = Files.readAllBytes(Paths.get("data.txt"));
   * Map<String,String> myMap = new HashMap<String, String>();
   * 
   * myMap = objectMapper.readValue(mapData, HashMap.class);
   * System.out.println("Map is: "+myMap);
   * //another way
   * myMap = objectMapper.readValue(mapData, new
   * TypeReference<HashMap<String,String>>() {});
   * System.out.println("Map using TypeReference: "+myMap);
   * 
   * //read JSON like DOM Parser
   * JsonNode rootNode = objectMapper.readTree(jsonData);
   * JsonNode idNode = rootNode.path("id");
   * System.out.println("id = "+idNode.asInt());
   * JsonNode phoneNosNode = rootNode.path("phoneNumbers");
   * Iterator<JsonNode> elements = phoneNosNode.elements();
   * while(elements.hasNext()){
   * JsonNode phone = elements.next();
   * System.out.println("Phone No = "+phone.asLong());
   * }
   * 
   * //update JSON data
   * ((ObjectNode) rootNode).put("id", 500);
   * //add new key value
   * ((ObjectNode) rootNode).put("test", "test value");
   * //remove existing key
   * ((ObjectNode) rootNode).remove("role");
   * ((ObjectNode) rootNode).remove("properties");
   * objectMapper.writeValue(new File("updated_emp.txt"), rootNode);
   */

}
