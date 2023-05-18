import java.util.ArrayList;

import clases.Evento;
import utils.*;

public class App {
  public static void main(String[] args) throws Exception {
    ArrayList<Evento> eventosJson = jsonUtils.ReadEventosFromJsonFile("src/recursos/eventos.json");
    ArrayList<Evento> eventosCsv = csvUtils.readEventosFromCsvFile("src/recursos/eventos.csv");
    ArrayList<String> codigosPostales = new ArrayList<>(0);

    eventosJson.forEach(evento -> {
      String codigoPostal = evento.getAddress().getArea().getPostalCode();
      if (!codigoPostal.equals("")) {
        if (!codigosPostales.contains(codigoPostal)) {
          System.out.println(codigoPostal);
          codigosPostales.add(evento.getAddress().getArea().getPostalCode());
        }
      }
    });

    // eventosJson.forEach((e) -> System.out.println(e.toString()));
    // eventosCsv.forEach((e) -> System.out.println(e.toString()));

    System.out.println("====LISTADO DE EVENTOS GRATUITOS====");
    System.out.println(" ---Json");

    eventosJson.forEach(evento -> {
      if (evento.getFree() == 1) {
        System.out.println(evento.toString());
      }
    });

    System.out.println(" ---Csv");

    eventosCsv.forEach(evento -> {
      if (evento.getFree() == 1) {
        System.out.println(evento.toString());
      }
    });

    int random = (int) (Math.random() * codigosPostales.size());

    System.out.println(random + " - " + codigosPostales.size());

    String codigo = codigosPostales.get(random);

    System.out.println("====LISTADO DE EVENTOS GRATUITOS EN EL CODIGO POSTAL: " + codigo);
    System.out.println("  ---Json");

    eventosJson.forEach(evento -> {
      if (evento.getFree() == 1 && evento.getAddress().getArea().getPostalCode() == codigo) {
        System.out.println(evento.toString());
      }
    });
    System.out.println("  ---Csv");

    eventosCsv.forEach(evento -> {
      if (evento.getFree() == 1 && evento.getAddress().getArea().getPostalCode() == codigo) {
        System.out.println(evento.toString());
      }
    });

    System.out.println(eventosJson.size());
    System.out.println(eventosCsv.size());
  }
}
