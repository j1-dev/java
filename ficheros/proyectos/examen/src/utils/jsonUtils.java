package utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import clases.Cliente;
import clases.Venta;

public class jsonUtils {
  public static ArrayList<Cliente> ReadClientesFromJson(String path) {
    File fichero = new File(path);
    ArrayList<Cliente> lista = new ArrayList<>();

    ObjectMapper objectMapper = new ObjectMapper();

    try {
      lista = objectMapper.readValue(fichero, new TypeReference<ArrayList<Cliente>>() {
      });
    } catch (IOException e) {
      e.printStackTrace();
    }

    return lista;
  }

  public static ArrayList<Venta> ReadVentasFromJson(String path) {
    File fichero = new File(path);
    ArrayList<Venta> lista = new ArrayList<>();

    ObjectMapper objectMapper = new ObjectMapper();

    try {
      lista = objectMapper.readValue(fichero, new TypeReference<ArrayList<Venta>>() {
      });
    } catch (IOException e) {
      e.printStackTrace();
    }

    return lista;
  }
}
