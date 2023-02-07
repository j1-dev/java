public class ej1b {
  public static void main(String[] args) {
    int[][] matriz = new int[5][5];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = 10 * i + j;
      }
    }

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
