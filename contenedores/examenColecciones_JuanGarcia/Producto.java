package contenedores.examenColecciones_JuanGarcia;

public class Producto {
  private int id;
  private String nombre;
  private String descripcion;
  private double precio;
  private String categoria;

  static private int contador = 0;

  public Producto(String nombre, String descripcion, double precio, String categoria) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.categoria = categoria;
    contador++;
    id = contador;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public static int getContador() {
    return contador;
  }

  public static void setContador(int contador) {
    Producto.contador = contador;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  @Override
  public String toString() {
    return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
        + ", categoria=" + categoria + "]\n";
  }

  @Override
  public boolean equals(Object obj) {
    Producto p = (Producto) obj;
    return this.nombre.equals(p.getNombre());
  }

}
