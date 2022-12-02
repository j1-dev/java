import Funciones.*;

public class ej16_funciones {
  public static void main(String[] args) {
    System.out.println("TODOS LOS CAPICúA ENTRE 1 Y 99999");
    for (int i = 0; i < 99999; i++) {
      if (mathJuan.esCapicua(i)) {
        System.out.println(i);
      }
    }
  }
}
