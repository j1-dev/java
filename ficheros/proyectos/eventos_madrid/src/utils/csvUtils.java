package utils;

import clases.Evento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class csvUtils {
  public static ArrayList<Evento> readEventosFromCsvFile(String filePath) {
    ArrayList<Evento> eventos = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      // Skip the first line
      br.readLine();

      String line = br.readLine();
      while (line != null) {
        String[] fields = line.split(";");

        Evento evento = new Evento();
        evento.setId(fields[0]);
        evento.setTitle(removeQuotes(fields[1]));
        evento.setPrice(removeQuotes(fields[2]));

        if (!fields[3].isEmpty() && !fields[3].equals("\"\"")) {
          evento.setFree(parseIntegerValue(removeQuotes(fields[3])));
        }

        evento.setDtstart(fields[7]);
        evento.setDtend(fields[8]);
        evento.setTime(fields[9]);

        System.out.println(evento.toString());

        eventos.add(evento);
        line = br.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return eventos;
  }

  private static String removeQuotes(String value) {
    return value.replaceAll("^\"|\"$", "");
  }

  private static int parseIntegerValue(String value) {
    try {
      return Integer.parseInt(removeQuotes(value));
    } catch (NumberFormatException e) {
      return 0;
    }
  }
}