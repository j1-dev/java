package contenedores.examenColecciones_JuanGarcia;

import java.util.ArrayList;
import java.util.HashMap;

public class Tienda implements Tienda_i {
  private DescuentoPorCategoria descuentoPorCategoria;
  private CarritoCompra carritoDeCompra;
  private ArrayList<Producto> almacen;

  public Tienda() {
    descuentoPorCategoria = new DescuentoPorCategoria();
    carritoDeCompra = new CarritoCompra();
    almacen = new ArrayList<>();
  }

  public DescuentoPorCategoria getDescuentoPorCategoria() {
    return descuentoPorCategoria;
  }

  public void setDescuentoPorCategoria(DescuentoPorCategoria descuentoPorCategoria) {
    this.descuentoPorCategoria = descuentoPorCategoria;
  }

  public CarritoCompra getCarritoDeCompra() {
    return carritoDeCompra;
  }

  public void setCarritoDeCompra(CarritoCompra carritoDeCompra) {
    this.carritoDeCompra = carritoDeCompra;
  }

  public ArrayList<Producto> getAlmacen() {
    return almacen;
  }

  public void setAlmacen(ArrayList<Producto> almacen) {
    this.almacen = almacen;
  }

  @Override
  public boolean insertarProducto(Producto producto) {
    boolean res = true;

    if (!almacen.contains(producto)) {
      almacen.add(producto);
    } else {
      System.out.println("El producto " + producto.getNombre() + " ya existe");
      res = false;
    }

    return res;
  }

  @Override
  public String mostrarProductosPorNombre() {
    // Sort con lambda
    almacen.sort((arg0, arg1) -> {
      return arg0.getNombre().compareTo(arg1.getNombre());
    });
    return almacen.toString();
  }

  @Override
  public String mostrarProductosPorId() {
    // Sort con lambda
    almacen.sort((arg0, arg1) -> {
      return arg0.getId() - arg1.getId();
    });
    return almacen.toString();
  }

  @Override
  public Producto buscarProducto(int id) {
    Producto prod = null;

    for (Producto producto : almacen) {
      if (producto.getId() == id) {
        prod = producto;
      }
    }

    return prod;
  }

  @Override
  public double obtenerCuentaTotal() {
    DescuentoPorCategoria copiaDescuentos = descuentoPorCategoria;
    HashMap<String, Integer> mapaDescuentos = copiaDescuentos.getDescuentosPorCategoria();
    CarritoCompra copiaCarrito = carritoDeCompra;
    ArrayList<Producto> arrayCarrito = copiaCarrito.getCarrito();
    int descuentoTotal = 0;
    double total = 0;

    for (Producto producto : arrayCarrito) {
      if (mapaDescuentos.containsKey(producto.getCategoria())) {
        descuentoTotal += mapaDescuentos.get(producto.getCategoria());
        mapaDescuentos.remove(producto.getCategoria());
      }
    }

    for (Producto producto : arrayCarrito) {
      total += producto.getPrecio();
    }

    total *= (1.0 - (descuentoTotal / 100.0));

    return total;
  }

}
