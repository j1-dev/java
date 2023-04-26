import java.util.ArrayList;
import java.util.HashMap;

import clases.LeerInformacion;
import clases.Municipio;

public class App {
  public static void main(String[] args) throws Exception {
    ArrayList<Municipio> municipios = new ArrayList<>();

    for (int i = 1996; i < 2022; i++) {
      municipios.addAll(LeerInformacion.LeerFicheroMunicipio(i));
    }

    System.out.println(municipios.toString());
    System.out.println(LeerInformacion.buscarMunicipio(municipios, "Mijas",
        1998).toString());

    HashMap<String, Integer> incrementos = LeerInformacion.IncrementoPoblacion(municipios, 2000, 2005);
    System.out.println(incrementos.get("Fuengirola"));
    System.out.println(incrementos.get("Mijas"));

    municipios = LeerInformacion.LeerFicheroMunicipio(2021);
    Municipio menorMunicipio = municipios.get(0);
    int menorPoblacion = menorMunicipio.getPoblacion();

    for (Municipio municipio : municipios) {
      if (municipio.getPoblacion() < menorPoblacion) {
        menorMunicipio = municipio;
        menorPoblacion = municipio.getPoblacion();
      }
    }

    System.out.println(menorMunicipio.toString());
  }
}
