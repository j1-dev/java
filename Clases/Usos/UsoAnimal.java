package Clases.Usos;

import Clases.ClasesEJ.*;

public class UsoAnimal {
  public static void main(String[] args) {
    Gato gato = new Gato("miau", "gris", 4, "pelo corto", true);
    Perro perro = new Perro("guau", "marron", 4, "pelo largo", true);
    Canario canario = new Canario("pio pio", "verde", 2, 12, false);
    Pinguino pinguino = new Pinguino("bua loco que frio", "blanco/negro", 2, 20, true);
    Lagarto lagarto = new Lagarto("........", "verde", 4, true);

    System.out.println(gato);
    System.out.println(perro);
    System.out.println(canario);
    System.out.println(pinguino);
    System.out.println(lagarto);

    System.out.println(gato.moverse());
    System.out.println(perro.moverse());
    System.out.println(canario.moverse());
    System.out.println(pinguino.moverse());
    System.out.println(lagarto.moverse());

  }
}
