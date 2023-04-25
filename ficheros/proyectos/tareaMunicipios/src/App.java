import java.util.ArrayList;

import clases.LeerInformacion;
import clases.Municipio;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Municipio> municipios = new ArrayList<>();

        municipios = LeerInformacion.LeerFicheroMunicipio(2000);

        System.out.println(municipios.toString());

    }
}
