package Clases.Ejercicios;

import Clases.ClasesEJ.Punto;
import Clases.ClasesEJ.Linea;

public class ej16 {
  public static void main(String[] args) {
    Punto p1 = new Punto(4.21, 7.3);
    Punto p2 = new Punto(-2, 1.66);
    Linea l = new Linea(p1, p2);
    System.out.println(l);
  }
}
