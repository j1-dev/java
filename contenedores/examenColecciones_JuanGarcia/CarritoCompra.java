package contenedores.examenColecciones_JuanGarcia;

import java.util.ArrayList;

public class CarritoCompra {
  private ArrayList<Producto> carrito;

  public CarritoCompra() {
    this.carrito = new ArrayList<Producto>();
  }

  public ArrayList<Producto> getCarrito() {
    return carrito;
  }

  public void setCarrito(ArrayList<Producto> carrito) {
    this.carrito = carrito;
  }

  public boolean insertar(Producto prod) {
    return carrito.add(prod);
  }

  public boolean eliminar(int id) {
    boolean res = false;

    for (int i = 0; i < carrito.size() && !res; i++) {
      if (carrito.get(i).getId() == id) {
        res = true;
        carrito.remove(i);
      }
    }

    return res;
  }

  public void limpiarCarrito() {
    this.carrito = new ArrayList<Producto>();
  }

  public String mostrarPorCodigo() {
    // Sort con lambda
    carrito.sort((arg0, arg1) -> {
      return arg0.getId() - arg0.getId();
    });
    return carrito.toString();
  }

  public String mostrarPorNombre() {
    // Sort con lambda
    carrito.sort((arg0, arg1) -> {
      return arg0.getNombre().compareTo(arg1.getNombre());
    });
    return carrito.toString();
  }

}
