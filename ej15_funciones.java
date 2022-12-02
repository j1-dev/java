import Funciones.*;

public class ej15_funciones {
  public static void main(String[] args) {
    System.out.println("TODOS LOS PRIMOS ENTRE 1 Y 1000");
    for (int i = 0; i < 1000; i++) {
      if (mathJuan.esPrimo(i)) {
        System.out.println(i);
      }
    }
  }
}
