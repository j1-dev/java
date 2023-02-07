package Clases.Ejercicios;

import Clases.ClasesEJ.Piramide;
import Clases.ClasesEJ.Rectangulo;

public class ej17 {
  public static void main(String[] args) {
    Piramide p = new Piramide(4);
    Rectangulo r1 = new Rectangulo(4, 3);
    Rectangulo r2 = new Rectangulo(6, 2);
    System.out.println(p);
    System.out.println(r1);
    System.out.println(r2);
    System.out.println("Pirámides creadas: " + Piramide.getCantidad());
    System.out.println("Rectángulos creados: " + Rectangulo.getCantidad());
  }
}
