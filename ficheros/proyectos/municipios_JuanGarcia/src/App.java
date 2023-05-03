import java.util.ArrayList;
import java.util.HashMap;

import clases.LeerInformacion;
import clases.Municipio;

public class App {
  public static void main(String[] args) throws Exception {
    ArrayList<Municipio> municipios = new ArrayList<>();

    // Lectura de todos los municipios
    for (int i = 1996; i <= 2022; i++) {
      municipios.addAll(LeerInformacion.LeerFicheroMunicipio(i));
    }

    System.out.println("---MUNICIPIOS ORDENADES POR NOMBRE Y AÑO---");
    System.out.println(municipios.toString());

    System.out.println("---INFO MIJAS EN 2022---");
    System.out.println(LeerInformacion.buscarMunicipio(municipios, "Mijas",
        2022).toString());

    System.out.println("---INCREMENTOS (2016 - 2022)---");
    HashMap<String, Integer> incrementos = LeerInformacion.IncrementoPoblacion(municipios, 2016, 2022);

    System.out.println("Incremento de Fuengirola: " + incrementos.get("Fuengirola"));
    System.out.println("Incremento de Mijas: " + incrementos.get("Mijas"));

    System.out.println();
    System.out.println("---MUNICIPIO MENOS POBLADO EN 2021---");
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
