package contenedores.ejrepaso;

import java.util.HashMap;
import java.util.Scanner;

public class ej6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String user, password;
    int maxIntentos = 3;
    HashMap<String, String> usuario = new HashMap<>();
    usuario.put("admin", "admin");

    boolean salir = false;
    do {
      System.out.println("Inserte el usuario del sistema...");
      user = sc.nextLine();
      System.out.println("Inserte la clave para " + user);
      password = sc.nextLine();
      boolean correcto = usuario.containsKey(user) && usuario.get(user).equals(password);
      if (correcto) {
        salir = true;
      } else {
        maxIntentos--;
        if (maxIntentos == 0)
          salir = true;
      }
    } while (!salir);
  }
}
