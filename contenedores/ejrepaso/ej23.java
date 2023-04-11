package contenedores.ejrepaso;

import java.util.HashMap;
import java.util.Map;
import contenedores.clases.Piezas;

public class ej23 {
  public static void main(String[] args) {
    final HashMap<Piezas, Integer> tablaValores = new HashMap<>() {
      {
        put(Piezas.DAMA, 9);
        put(Piezas.TORRE, 5);
        put(Piezas.ALFIL, 3);
        put(Piezas.CABALLO, 2);
        put(Piezas.PEON, 1);
      }
    };
    HashMap<Piezas, Integer> tablaContadorCapturas = new HashMap<>() {
      {
        put(Piezas.DAMA, 0);
        put(Piezas.TORRE, 0);
        put(Piezas.ALFIL, 0);
        put(Piezas.CABALLO, 0);
        put(Piezas.PEON, 0);
      }
    };
    HashMap<Piezas, Integer> tablaContadorPiezasRestantes = new HashMap<>() {
      {
        put(Piezas.DAMA, 1);
        put(Piezas.TORRE, 2);
        put(Piezas.ALFIL, 2);
        put(Piezas.CABALLO, 2);
        put(Piezas.PEON, 8);
      }
    };

    int totalCapturas = (int) (Math.random() * 16);
    int puntuacionTotal = 0;

    while (totalCapturas > 0) {
      Piezas piezaCapturada;
      do {
        int indexPiezaCapturada = (int) (Math.random() * 5);
        piezaCapturada = Piezas.values()[indexPiezaCapturada];
      } while (tablaContadorPiezasRestantes.get(piezaCapturada) <= 0);
      tablaContadorCapturas.put(piezaCapturada, tablaContadorCapturas.get(piezaCapturada) + 1);
      tablaContadorPiezasRestantes.put(piezaCapturada, tablaContadorPiezasRestantes.get(piezaCapturada) - 1);
      totalCapturas--;
      puntuacionTotal += tablaValores.get(piezaCapturada);
    }

    System.out.println("Fichas capturadas por el jugador");
    for (Map.Entry<Piezas, Integer> entry : tablaContadorCapturas.entrySet()) {
      if (entry.getValue() > 0) {
        System.out
            .println(entry.getValue() + " " + entry.getKey() + " ( " + tablaValores.get(entry.getKey()) + " peones)");
      }
    }
    System.out.println("Puntos totales: " + puntuacionTotal + " peones");
  }
}
