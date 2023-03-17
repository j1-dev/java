package contenedores;

public class ContenedorBase<T> {
  private T o;

  public void insertar(T nuevo) {
    if (nuevo != null)
      o = nuevo;

  }

  public T extraer() {
    T res = o;
    o = null;
    return res;
  }
}
