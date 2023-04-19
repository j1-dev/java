package contenedores.examenColecciones_JuanGarcia;

import java.util.HashMap;
import java.util.Map;

public class DescuentoPorCategoria {
  private HashMap<String, Integer> descuentosPorCategoria;

  public DescuentoPorCategoria() {
    this.descuentosPorCategoria = new HashMap<>();
  }

  public HashMap<String, Integer> getDescuentosPorCategoria() {
    return descuentosPorCategoria;
  }

  public void setDescuentosPorCategoria(HashMap<String, Integer> descuentosPorCategoria) {
    this.descuentosPorCategoria = descuentosPorCategoria;
  }

  public boolean insertar(String categoria, int descuento) {
    boolean res = true;

    if (!descuentosPorCategoria.containsKey(categoria)) {
      descuentosPorCategoria.put(categoria, descuento);
    } else {
      System.out.println("La categoria " + categoria + " ya se ha insertado");
      res = false;
    }

    return res;
  }

  public boolean modificar(String categoria, int nuevoDescuento) {
    boolean res = true;

    if (descuentosPorCategoria.containsKey(categoria)) {
      descuentosPorCategoria.remove(categoria);
      descuentosPorCategoria.put(categoria, nuevoDescuento);
    } else {
      System.out.println("La categoria " + categoria + " no existe");
      res = false;
    }

    return res;
  }

  public boolean eliminar(String categoria) {
    boolean res = true;

    if (descuentosPorCategoria.containsKey(categoria)) {
      descuentosPorCategoria.remove(categoria);
    } else {
      System.out.println("La categoria " + categoria + " no existe");
      res = false;
    }

    return res;
  }

  public int obtener(String categoria) {
    return descuentosPorCategoria.get(categoria);
  }

  public String mostrarDescuentos() {
    String str = "";

    for (Map.Entry<String, Integer> entry : descuentosPorCategoria.entrySet()) {
      str += entry.getKey() + " <--> " + entry.getValue() + "\n";
    }

    return str;
  }
}
