package Funciones;

public class mathJuan {
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
    while (!esPrimo(nextPrimo)) {
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
        pos = i;
      }
    }
    return pos;
  }

  public static int quitaPorDetras(int numero, int digitos) {
    char[] aux = intToCharArray(numero);
    int len = aux.length - digitos + 1;
    char[] newNum = new char[len];
    for (int i = 0; i < newNum.length - 1; i++) {
      newNum[i] = aux[i];
    }
    String str = String.valueOf(newNum).trim(); // Se usa trim() porque si no salta un error de formato
    return Integer.parseInt(str);
  }

  public static int quitaPorDelante(int numero, int digitos) {
    char[] aux = intToCharArray(numero);
    int len = aux.length - digitos + 1;
    char[] newNum = new char[len];
    for (int i = 0; i < newNum.length - 1; i++) {
      newNum[i] = aux[i + digitos];
    }
    String str = String.valueOf(newNum).trim(); // Se usa trim() porque si no salta un error de formato
    return Integer.parseInt(str);
  }

  public static int trozoDeNumero(int numero, int posInicial, int posFinal) {
    char[] aux = intToCharArray(numero);
    int len = posFinal - posInicial;
    char[] newNum = new char[len];
    for (int i = 0; i < len; i++) {
      newNum[i] = aux[i + posInicial];
    }
    String str = String.valueOf(newNum).trim();
    return Integer.parseInt(str);
  }

  public static int aBinario(int numero) {
    int binario[] = new int[40];
    int indice = 0;
    int newNum = 0;
    while (numero > 0) {
      binario[indice] = numero % 2;
      indice++;
      numero = numero / 2;
    }
    for (int i = 0; i < indice; i++) {
      newNum += binario[i] * potencia(10, i);
    }
    return newNum;
  }

  public static int aDecimal(int numero) {
    char[] aux = intToCharArray(numero);
    int newNum = 0;
    for (int i = 0; i < aux.length; i++) {
      if (!(aux[i] == '0' || aux[i] == '1')) {
        newNum = -1;
      }
    }
    if (newNum != -1) {
      for (int i = 0; i < aux.length; i++) {
        newNum += Integer.parseInt(String.valueOf(aux[i])) * potencia(2, i);
      }
    }
    return newNum;
  }

  public static int juntaNumeros(int num1, int num2) {
    char[] n1 = intToCharArray(num1);
    char[] n2 = intToCharArray(num2);
    char[] newNum = new char[n1.length + n2.length];
    for (int i = 0; i < newNum.length; i++) {
      if (i < n1.length) {
        newNum[i] = n1[i];
      } else {
        newNum[i] = n2[i - n1.length];
      }
    }
    String str = String.valueOf(newNum);
    return Integer.parseInt(str);
  }

}
