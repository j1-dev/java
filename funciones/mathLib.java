package funciones;

import java.util.Scanner;

public class mathLib {
  public static char[] intToCharArray(int n) {
    String number = String.valueOf(n);
    return number.toCharArray();
  }

  public static Boolean esCapicua(int numero) {
    Boolean capicua = true;
    char[] arrayNum = intToCharArray(numero);
    for (int i = 0; (i < arrayNum.length) && capicua; i++) {
      if (arrayNum[i] != arrayNum[arrayNum.length - i - 1]) {
        capicua = false;
      }
    }
    return capicua;
  }

  public static Boolean esPrimo(int numero) {
    Boolean primo = true;
    int divisores = 0;
    for (int i = 1; i < numero; i++) {
      if (numero % i == 0) {
        divisores++;
      }
    }
    if (divisores > 1) {
      primo = false;
    }
    return primo;
  }

  public static int siguientePrimo(int numero) {
    int nextPrimo = numero + 1; // +1 para que no se cuente el primer numero si es primo
    while (esPrimo(nextPrimo) == false) {
      nextPrimo++;
    }
    return nextPrimo;
  }

  public static int potencia(int base, int exponente) {
    int n = base;
    for (int i = 1; i < exponente; i++) {
      n *= base;
    }
    return n;
  }

  public static int digitos(int numero) {
    return intToCharArray(numero).length;
  }

  public static int voltea(int numero) {
    char[] aux = intToCharArray(numero);
    String volteado = "";
    for (int i = aux.length - 1; i >= 0; i--) {
      volteado += aux[i];
    }
    return Integer.parseInt(volteado);
  }

  public static int digitoN(int numero, int posicion) {
    return Character.getNumericValue(intToCharArray(numero)[posicion - 1]);
  }

  public static int posicionDeDigito(int numero, int digito) {
    int pos = -1;
    char[] aux = intToCharArray(numero);
    for (int i = 0; i < aux.length; i++) {
      if (Character.getNumericValue(aux[i]) == digito) {
        pos = i + 1; // +1 porque "i" empieza en 0
      }
    }
    return pos;
  }

  public static int quitaPorDetras(int numero, int digitos) {
    return 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(esCapicua(n));
    System.out.println(esPrimo(n));
    System.out.println(siguientePrimo(n));
    System.out.println(potencia(3, 3));
    System.out.println(digitos(n));
    System.out.println(voltea(n));
    System.out.println(digitoN(12351512, 4));
    System.out.println(posicionDeDigito(80002, 2));
  }

}
