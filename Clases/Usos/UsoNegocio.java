package Clases.Usos;

import java.util.Arrays;

import Clases.ClasesEJ.Cliente;
import Clases.ClasesEJ.Ferreteria;

public class UsoNegocio {
  public static void main(String[] args) {
    Cliente c1 = new Cliente("Pepe", 44.4);
    Cliente c2 = new Cliente("Popo", 55.5);
    Cliente c3 = new Cliente("Pipi", 11.1);
    Cliente c4 = new Cliente("Papa", 33.3);
    Cliente c5 = new Cliente("Pupu", 22.2);

    Ferreteria ferreteriaGonzalez = new Ferreteria("Ferreteria gonzalez", "123456789C");

    ferreteriaGonzalez.abrir();

    ferreteriaGonzalez.cobrar();

    ferreteriaGonzalez.ponerEnCola(c1);
    ferreteriaGonzalez.ponerEnCola(c2);
    ferreteriaGonzalez.ponerEnCola(c3);
    ferreteriaGonzalez.ponerEnCola(c4);
    ferreteriaGonzalez.ponerEnCola(c5);

    // ferreteriaGonzalez.cobrar();
    // ferreteriaGonzalez.cobrar();
    // ferreteriaGonzalez.cobrar();
    // System.out.println(ferreteriaGonzalez);

    Cliente[] cola = ferreteriaGonzalez.getCola();
    Arrays.sort(cola);
    System.out.println(Arrays.toString(cola));
  }
}
