import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

import clases.Evento;
import utils.*;

public class App {
  public static void main(String[] args) throws Exception {
    ArrayList<Evento> eventosJson = jsonUtils.ReadEventosFromJsonFile("src/recursos/eventos.json");
    ArrayList<Evento> eventosCsv = csvUtils.readEventosFromCsvFile("src/recursos/eventos.csv");
    ArrayList<String> codigosPostales = getCodigosPostalesDistintos(eventosJson);

    if (eventosJson.size() == eventosCsv.size()) {
      System.out.println("Los dos ficheros tienen la misma información");
    } else {
      System.out.println("Los ficheros no tienen la misma información");
    }

    System.out.println("Eventos json: " + eventosJson.size());
    System.out.println("Eventos csv: " + eventosCsv.size());

    System.out.println("====LISTADO DE EVENTOS GRATUITOS====");
    System.out.println(" ---Json");
    muestraEventosGratis(eventosJson);

    System.out.println(" ---Csv");
    muestraEventosGratis(eventosCsv);

    int random = (int) (Math.random() * codigosPostales.size());
    // System.out.println(random + " - " + codigosPostales.size());
    String codigo = codigosPostales.get(random);

    System.out.println("====LISTADO DE EVENTOS GRATUITOS EN EL CODIGO POSTAL: " +
        codigo);
    System.out.println(" ---Json");
    muestraEventosGratisPorCP(eventosJson, codigo);

    System.out.println(" ---Csv");
    muestraEventosGratisPorCP(eventosCsv, codigo);

    System.out.println("====NUMERO DE EVENTOS POR CADA CODGIO POSTAL====");
    System.out.println(" ---Json");
    muestraNumDeEventosPorCP(eventosJson);

    System.out.println(" ---Csv");
    muestraNumDeEventosPorCP(eventosCsv);

  }

  public static void muestraEventosGratis(ArrayList<Evento> eventos) {
    eventos.forEach(evento -> {
      if (evento.getFree() == 1) {
        System.out.println(evento.toString());
      }
    });
  }

  public static void muestraEventosGratisPorCP(ArrayList<Evento> eventos, String cp) {
    eventos.forEach(evento -> {
      if (evento.getFree() == 1 && evento.getAddress().getArea().getPostalCode().equals(cp)) {
        System.out.println(evento.toString());
      }
    });
  }

  public static HashMap<String, Integer> numeroDeEventosPorCP(ArrayList<Evento> eventos) {
    HashMap<String, Integer> res = new HashMap<>();
    ArrayList<String> codigosPostales = getCodigosPostalesDistintos(eventos);
    for (String codigo : codigosPostales) {
      int cont = 0;
      for (Evento evento : eventos) {
        if (evento.getAddress().getArea().getPostalCode().equals(codigo)) {
          cont++;
        }
      }
      res.put(codigo, cont);
    }
    return res;
  }

  public static void muestraNumDeEventosPorCP(ArrayList<Evento> eventos) {
    HashMap<String, Integer> map = numeroDeEventosPorCP(eventos);
    Set<Entry<String, Integer>> set = map.entrySet();
    for (Entry<String, Integer> entry : set) {
      System.out.println(entry.getKey() + " -> " + entry.getValue() + " eventos");
    }
  }

  public static ArrayList<String> getCodigosPostalesDistintos(ArrayList<Evento> eventos) {
    ArrayList<String> res = new ArrayList<>();
    eventos.forEach(evento -> {
      String codigoPostal = evento.getAddress().getArea().getPostalCode();
      if (!codigoPostal.equals("")) {
        if (!res.contains(codigoPostal)) {
          // System.out.println(codigoPostal);
          res.add(evento.getAddress().getArea().getPostalCode());
        }
      }
    });
    return res;
  }
}
