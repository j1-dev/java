import clases.Ciclista;
import clases.Equipo;
import java.io.IOException;
import java.util.ArrayList;
import utils.jsonUtils;
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Ciclista> a = jsonUtils.ReadCiclistaListFromJsonFile("src/recursos/ciclistas.json");
        ArrayList<Equipo> e = jsonUtils.ReadEquipoListFromJsonFile("src/recursos/equipos.csv");
        System.out.println(a.toString());
        System.out.println(e.toString());
    }
}