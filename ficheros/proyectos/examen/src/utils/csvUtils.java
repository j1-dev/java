package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import clases.ExceptionProductoSinStock;
import clases.Producto;

public class csvUtils {
  public static ArrayList<Producto> ReadProductosFromCsv(String path) {
    ArrayList<Producto> productos = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] values = line.split(";");
        if (values.length != 5) {
          System.out.println("ERROR: Numero incorrecto de campos: " + line);
          continue;
        }

        Integer codigo;
        try {
          codigo = Integer.parseInt(values[0].trim());
        } catch (NumberFormatException e) {
          System.out.println("ERROR: Codigo invalido: " + line);
          continue;
        }

        String nombre = values[1].trim();
        String descripcion = values[2].trim();

        Double precio;
        try {
          precio = Double.parseDouble(values[3].trim());
        } catch (NumberFormatException e) {
          System.out.println("ERROR: Precio invalido: " + line);
          continue;
        }

        Integer stock;
        try {
          stock = Integer.parseInt(values[4].trim());
        } catch (NumberFormatException e) {
          System.out.println("ERROR: Stock invalido: " + line);
          continue;
        }

        try {
          Producto producto = new Producto(codigo, nombre, descripcion, precio, stock);
          if (!productos.contains(producto)) {
            productos.add(producto);
          }
        } catch (ExceptionProductoSinStock e) {
          e.printStackTrace();
        }

      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return productos;
  }
}
