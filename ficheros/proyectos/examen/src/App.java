import clases.ExceptionProductoSinStock;
import clases.Ferreteria;
import clases.Linea;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;

public class App {
  public static void main(String[] args) throws IOException, ExceptionProductoSinStock {
    Ferreteria f = new Ferreteria();

    // f.getProductos().forEach(p -> System.out.println(p.toString()));
    // f.getVentas().forEach(p -> System.out.println(p.toString()));
    // f.getClientes().forEach(p -> System.out.println(p.toString()));

    f.FacturacionClientes("src/recursos/FacturacionClientes.txt");
    f.ProductosVendidos("src/recursos/ProductosVendidos.txt");
    f.FacturacionTotal("src/recursos/FacturacionTotal.txt");
  }
}
