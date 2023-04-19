package contenedores.examenColecciones_JuanGarcia;

public interface Tienda_i {
  boolean insertarProducto(Producto producto);

  String mostrarProductosPorNombre();

  String mostrarProductosPorId();

  Producto buscarProducto(int id);

  double obtenerCuentaTotal();
}