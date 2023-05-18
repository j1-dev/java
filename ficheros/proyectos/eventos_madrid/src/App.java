import java.util.ArrayList;

import clases.Evento;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Evento> ev = jsonUtils.ReadEventosFromJsonFile("src/recursos/eventos.json");

        ev.forEach((e) -> System.out.println(e.toString()));
    }
}
