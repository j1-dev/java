import java.util.Scanner;
import Funciones.mathJuan;

public class mathMenu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(mathJuan.esCapicua(n));
    System.out.println(mathJuan.esPrimo(n));
    System.out.println(mathJuan.siguientePrimo(n));
    System.out.println(mathJuan.potencia(3, 3));
    System.out.println(mathJuan.digitos(n));
    System.out.println(mathJuan.voltea(n));
    System.out.println(mathJuan.digitoN(12351512, 4));
    System.out.println(mathJuan.posicionDeDigito(80002, 2));
    System.out.println(mathJuan.quitaPorDetras(123456, 2));
    System.out.println(mathJuan.quitaPorDelante(123456, 2));
    System.out.println(mathJuan.trozoDeNumero(123456, 1, 4));
    System.out.println(mathJuan.juntaNumeros(123547, 456));
  }

}
