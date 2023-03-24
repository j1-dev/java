package contenedores.ejrepaso;

import java.util.ArrayList;

public class ej2 {
  public static void main(String[] args) {
    ArrayList<Integer> ranNum = new ArrayList<>();
    int maxNums = (int) (Math.random() * 10 + 11);
    int cont = 0;

    System.out.println("Se van a generar " + maxNums + " numeros aleatorios");

    while (cont < maxNums) {
      ranNum.add((int) (Math.random() * 101));
      cont++;
    }

    System.out.println(ranNum);

  }
}
