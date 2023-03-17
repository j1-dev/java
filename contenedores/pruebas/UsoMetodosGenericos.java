package contenedores.pruebas;

import java.util.ArrayList;

import Clases.Ejemplos.Persona;
import Clases.trenes.maquinaria.Tren;
import Clases.trenes.personal.Maquinista;

public class UsoMetodosGenericos {
  public static void main(String[] args) {
    ArrayList<Object> tabla = new ArrayList<>();
    Tren t = new Tren(null, null);
    Maquinista m = new Maquinista(null, null, 0);
    Persona p = new Persona();

    tabla = inserta(tabla, t);
    tabla = inserta(tabla, m);
    tabla = inserta(tabla, p);

    System.out.println(tabla.toString());
  }

  public static <T> ArrayList<T> inserta(ArrayList<T> a, T objeto) {
    ArrayList<T> nuevoArray = a;
    nuevoArray.add(objeto);
    return nuevoArray;
  }
}
