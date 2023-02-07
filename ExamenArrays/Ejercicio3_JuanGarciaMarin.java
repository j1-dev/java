public class Ejercicio3_JuanGarciaMarin {
  public static void main(String[] args) {
    int[][] matriz = new int[5][10];

    // metodo para rellenar la matriz
    rellenaAleatorios(matriz);

    // imprimir la matriz
    imprimeMatriz(matriz);

    System.out.println(); // linea en blanco para mejor lectura

    // Cambiamos la matriz
    matriz = sustituyeCeros(matriz);

    // La volvemos a imprimir
    imprimeMatriz(matriz);

  }

  public static int[][] rellenaAleatorios(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = (int) (Math.random() * 5);
      }
    }

    return matriz;
  }

  public static void imprimeMatriz(int[][] matriz) {
    int sumFila = 0, sumCol = 0;

    for (int i = 0; i < matriz.length; i++) {
      System.out.print("Fila " + i + ": ");
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + "\t");
        sumFila += matriz[i][j];
      }
      System.out.print("| == " + sumFila);
      System.out.println();
      sumFila = 0;
    }

    for (int i = 0; i < matriz[0].length; i++) {
      System.out.print("---------");
    }

    System.out.print("\n\t");

    for (int i = 0; i < matriz[0].length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        sumCol += matriz[j][i];
      }
      System.out.print(sumCol + "\t");
      sumCol = 0;
    }

    System.out.println();
  }

  public static int[][] sustituyeCeros(int[][] matriz) {
    int[][] newMatriz = matriz;

    for (int i = 0; i < newMatriz.length; i++) {
      newMatriz[i] = sustituyeCerosArray(matriz[i]); // cada fila es un array realmente y se puede tratar como tal.
    }

    return newMatriz;
  }

  public static int[] sustituyeCerosArray(int[] arr) {
    int[] newArr = arr;
    int nCeros = 0;
    int sumArr = 0;

    for (int i = 0; i < newArr.length; i++) {
      if (arr[i] == 0) {
        nCeros++;
      }
      sumArr += arr[i];
    }
    System.out.println("nCeros = " + nCeros + ", sumArr = " + sumArr);

    int dif = 24 - sumArr; // saca la diferencia hasta 24
    int val = 0;
    if (nCeros != 0)
      val = (int) Math.ceil(dif / nCeros); // la divide entre el numero de 0 si hay

    for (int i = 0; i < newArr.length; i++) {
      if (newArr[i] == 0 && nCeros > 0) {
        if (nCeros > 1) {
          newArr[i] = val;
          dif -= val;
          nCeros--;
        } else if (nCeros == 1) { // si solo queda un 0, se le pone el resto de la diferencia.     
          newArr[i] = dif;
          nCeros--;
        }

      }
    }

    return newArr;
  }

}
