package utils;

import clases.Evento;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonUtils {
  public static ArrayList<Evento> ReadEventosFromJsonFile(String relativePath) {
    ArrayList<Evento> eventos = null;
    try {
      // Create an ObjectMapper instance
      ObjectMapper objectMapper = new ObjectMapper();

      // Read the JSON file as a JsonNode
      JsonNode rootNode = objectMapper.readTree(new File(relativePath));

      // Get the "graph" array node directly
      JsonNode graphNode = rootNode.get("@graph");

      // Deserialize the "graph" array into a List<Evento> using ObjectMapper
      eventos = objectMapper.readValue(graphNode.toString(), new TypeReference<ArrayList<Evento>>() {
      });

    } catch (IOException e) {
      e.printStackTrace();
    }
    return eventos;
  }
}