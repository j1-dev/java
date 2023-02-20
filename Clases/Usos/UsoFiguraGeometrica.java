package Clases.Usos;

import Clases.ClasesEJ.*;

public class UsoFiguraGeometrica {
  public static void main(String[] args) {

    FiguraGeometrica[] coleccion = new FiguraGeometrica[4];

    coleccion[0] = new Rectangulo(3, 5.6, "Verde");
    coleccion[1] = new Triangulo(6, 7.8, "Azul");
    coleccion[2] = new Cuadrado(5, "Amarillo");
    coleccion[3] = new Circulo(2.2, "Marrón");

    for (FiguraGeometrica tri : coleccion) {
      System.out.println(tri.toString());
      if (tri instanceof Cuadrado) {
        System.out.println(((Cuadrado) tri).pintar());
      }
    }
  }

}
