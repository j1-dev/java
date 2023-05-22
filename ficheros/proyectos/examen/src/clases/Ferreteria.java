package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import utils.*;

public class Ferreteria {
  private ArrayList<Cliente> clientes;
  private ArrayList<Producto> productos;
  private ArrayList<Venta> ventas;

  public Ferreteria() throws ExceptionProductoSinStock {
    clientes = jsonUtils.ReadClientesFromJson("src/recursos/clientes.json");
    productos = csvUtils.ReadProductosFromCsv("src/recursos/productos.csv");
    Set<Cliente> setCliente = new HashSet<>(clientes);
    clientes = new ArrayList<>(setCliente);
    ventas = jsonUtils.ReadVentasFromJson("src/recursos/ventas.json");
    for (Venta v : ventas) {
      ArrayList<Linea> lineas = v.getLineas();
      Iterator<Linea> iterator = lineas.iterator();
      while (iterator.hasNext()) {
        Linea l = iterator.next();
        Integer codigo = l.getCodigoProducto();
        Producto productoVacio = new Producto(codigo, null, null, null, 1);
        if (!productos.contains(productoVacio)) {
          System.out.println("Procesando linea de venta: El producto con codigo " + codigo
              + " no existe entre los productos disponibles");
          iterator.remove();
        }
      }
    }
  }

  public ArrayList<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(ArrayList<Cliente> clientes) {
    this.clientes = clientes;
  }

  public ArrayList<Venta> getVentas() {
    return ventas;
  }

  public void setVentas(ArrayList<Venta> ventas) {
    this.ventas = ventas;
  }

  public ArrayList<Producto> getProductos() {
    return productos;
  }

  public void setProductos(ArrayList<Producto> productos) {
    this.productos = productos;
  }

  public void FacturacionClientes(String path) {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    try (FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
      for (Cliente cliente : clientes) {
        ArrayList<Integer> ids = new ArrayList<>();
        int id = cliente.getCodigo();
        double total = 0;
        if (!ids.contains(id)) {
          ArrayList<Linea> lineas = new ArrayList<>();
          for (Venta venta : ventas) {
            if (venta.getCodigoCliente() == id) {
              lineas.addAll(venta.getLineas());
            }
          }
          for (Linea linea : lineas) {
            int cod = linea.getCodigoProducto();
            int cant = linea.getCantidad();

            for (Producto producto : productos) {
              if (producto.getCodigo() == cod) {
                total += producto.getPrecio() * cant;
              }
            }

          }
        }
        bufferedWriter
            .write(cliente.getNombre() + " (" + cliente.getCodigo() + ") -> " + decimalFormat.format(total) + "\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void ProductosVendidos(String path) {
    try (FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
      for (Producto producto : productos) {
        int id = producto.getCodigo();
        int totalVendido = 0;
        for (Venta venta : ventas) {
          ArrayList<Linea> lineas = venta.getLineas();
          for (Linea linea : lineas) {
            if (linea.getCodigoProducto() == id) {
              totalVendido += linea.getCantidad();
            }
          }
        }
        bufferedWriter
            .write(producto.getNombre() + " (" + producto.getCodigo() + ") -> " + totalVendido + "\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void FacturacionTotal(String path) {
    try (FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
      DecimalFormat decimalFormat = new DecimalFormat("#.##");
      double total = 0;
      for (Venta venta : ventas) {
        ArrayList<Linea> lineas = venta.getLineas();
        for (Linea linea : lineas) {
          int codigoProducto = linea.getCodigoProducto();
          int cantidad = linea.getCantidad();
          for (Producto producto : productos) {
            if (producto.getCodigo() == codigoProducto) {
              total += cantidad * producto.getPrecio();
            }
          }
        }
      }
      bufferedWriter.write("El total que ha vendido la empresa es de " + decimalFormat.format(total) + " $");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
