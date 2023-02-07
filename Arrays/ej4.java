public class ej4 {
  public static void main(String[] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    System.out.println("Numero -> Cuadrado -> Cubo");
    for (int i = 0; i < numero.length; i++) {
      numero[i] = (int) (Math.random() * 100 + 1);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
      System.out.println(numero[i] + "\t" + cuadrado[i] + "\t" + cubo[i]);
    }
  }
}
