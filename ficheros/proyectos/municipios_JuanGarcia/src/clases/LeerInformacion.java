package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class LeerInformacion {
  public static ArrayList<Municipio> LeerFicheroMunicipio(Integer year) throws IOException {
    ArrayList<Municipio> res = new ArrayList<>();
    String rutaCSV = "src/recursos/PoblacionMunicipiosMalaga.csv";

    FileReader fr = null;
    BufferedReader br = null;

    try {
      fr = new FileReader(rutaCSV);
      br = new BufferedReader(fr);

      br.readLine();
      String linea = br.readLine();

      while (linea != null) {
        String[] splitLine = linea.split(";");

        String cpNombreCombo = splitLine[0]; // Este string contiene el cp y el nombre del municipio
        String[] parts = cpNombreCombo.split("(?<=\\d)(?=\\D)"); // Esta expresion regular distingue entre diigitos y no
                                                                 // digitos

        Integer cp = Integer.parseInt(parts[0]);
        String nombre = parts[1];
        nombre = nombre.trim();
        String sexo = splitLine[1];
        Integer anio = Integer.valueOf(splitLine[2]);
        String numConPuntos;
        Integer poblacion;

        if (!splitLine[3].equals("\"\"")) {
          numConPuntos = splitLine[3];
          poblacion = Integer.valueOf(numConPuntos.replace(".", ""));
        } else {
          numConPuntos = null;
          poblacion = -1;
        }

        if (sexo.equals("Total") && year.equals(anio) && cp > 10000) {
          Municipio m = new Municipio(nombre, poblacion, anio, cp);
          res.add(m);
        }

        linea = br.readLine();

      }
    } catch (IOException e) {
      System.out.println(e.toString());
    } finally {
      fr.close();
      br.close();
    }

    return res;
  }

  public static Municipio buscarMunicipio(ArrayList<Municipio> lista, String nombre, Integer anio) {
    Comparator<Municipio> ComparatorAnioNombre = Comparator.comparing(Municipio::getNombre)
        .thenComparing(Municipio::getAnio);

    lista.sort(ComparatorAnioNombre);

    Municipio m = new Municipio(nombre, 0, anio, 0);

    return lista.get(Collections.binarySearch(lista, m, ComparatorAnioNombre));
  }

  public static HashMap<String, Integer> IncrementoPoblacion(ArrayList<Municipio> coleccionMunicipios, int year1,
      int year2) {
    HashMap<String, Integer> res = new HashMap<>();

    ArrayList<String> nombres = new ArrayList<>();

    for (int i = 0; i < coleccionMunicipios.size(); i++) {
      Municipio m = coleccionMunicipios.get(i);
      if (!nombres.contains(m.getNombre())) {
        nombres.add(m.getNombre());
      }
    }

    for (String nombre : nombres) {
      Municipio municipioYear1 = buscarMunicipio(coleccionMunicipios, nombre, year1);
      Municipio municipioYear2 = buscarMunicipio(coleccionMunicipios, nombre, year2);

      int poblacionYear1 = municipioYear1.getPoblacion();
      int poblacionYear2 = municipioYear2.getPoblacion();
      int diff = poblacionYear2 - poblacionYear1;

      res.put(nombre, diff);
    }

    return res;
  }
}
