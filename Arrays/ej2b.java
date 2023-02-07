public class ej2b {
  public static void main(String[] args) {
    int[][] matriz = rellena(3, 3);
    int sumsCol[] = new int[matriz.length];
    int sumsFil[] = new int[matriz[0].length];

    boolean esMagica = esMagica(matriz, sumsFil, sumsCol);

    imprimirConSuma(matriz, sumsFil, sumsCol);

    if (esMagica) {
      System.out.println("\nLa matriz es mágica");
    } else {
      System.out.println("\nLa matriz no es mágica");
    }

  }

  static void imprimirConSuma(int[][] matriz, int[] sumsFil, int[] sumsCol) {

    System.out.print("┌");

    for (int i = 0; i < sumsCol.length - 1; i++) {
      System.out.print("───────┬");
    }
    System.out.print("───────┐\n");

    for (int i = 0; i < sumsFil.length; i++) {
      System.out.print("│");
      for (int j = 0; j < sumsFil.length; j++) {
        System.out.print(matriz[i][j] + "\t│");
      }
      System.out.print("  sum -> " + sumsFil[i] + "\n");
      if (i == sumsCol.length - 1) {
        System.out.print("└");
        for (int j = 0; j < sumsCol.length; j++) {
          if (j == sumsCol.length - 1) {
            System.out.print("───────┘");
          } else {
            System.out.print("───────┴");
          }
        }
      } else {
        System.out.print("├");
        for (int j = 0; j < sumsCol.length; j++) {
          if (j == sumsCol.length - 1) {
            System.out.print("───────┤");
          } else {
            System.out.print("───────┼");
          }
        }
      }
      System.out.println();
    }

    for (int i = 0; i < sumsFil.length; i++) {
      System.out.print(" " + sumsFil[i] + "\t");
    }
    System.out.println();
  }

  static boolean esMagica(int[][] matriz, int[] sumsFil, int[] sumsCol) {
    int sumFil, sumCol;
    boolean esMagica = true;

    for (int i = 0; i < matriz.length; i++) {
      sumFil = 0;
      sumCol = 0;
      for (int j = 0; j < matriz[i].length; j++) {
        sumFil += matriz[i][j];
        sumCol += matriz[j][i];
      }
      sumsFil[i] = sumFil;
      sumsCol[i] = sumCol;
    }

    for (int i = 0; i < sumsFil.length - 1 && esMagica; i++) {
      if (sumsFil[i] != sumsFil[i + 1])
        esMagica = false;
      if (sumsCol[i] != sumsCol[i + 1])
        esMagica = false;
    }

    return esMagica;
  }

  static int[][] rellena(int fil, int col) {
    int[][] m = new int[fil][col];

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        m[i][j] = (int) (Math.random() * 10 + 1);
      }
    }

    return m;
  }
}
