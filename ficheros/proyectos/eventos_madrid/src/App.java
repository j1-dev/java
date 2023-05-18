import java.util.ArrayList;

import clases.Evento;
import utils.*;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList<Evento> eventosJson =
        // jsonUtils.ReadEventosFromJsonFile("src/recursos/eventos.json");
        ArrayList<Evento> eventosCsv = csvUtils.readEventosFromCsvFile("src/recursos/eventos.csv");

        // eventosJson.forEach((e) -> System.out.println(e.toString()));
        // eventosCsv.forEach((e) -> System.out.println(e.toString()));

    }
}
