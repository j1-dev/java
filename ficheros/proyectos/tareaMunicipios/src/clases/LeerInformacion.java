package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
        String[] splitLine = linea.split("[\\s;]+");

        Integer cp = Integer.valueOf(splitLine[0]);
        String nombre = splitLine[1];
        String sexo = splitLine[2];
        Integer anio = Integer.valueOf(splitLine[3]);
        String numConPuntos;
        Integer poblacion;

        if (splitLine.length == 5) {
          numConPuntos = splitLine[4];
          poblacion = Integer.valueOf(numConPuntos.replace(".", ""));
        } else {
          numConPuntos = null;
          poblacion = -1;
        }

        if (sexo.equals("Total") && year == anio) {
          Municipio m = new Municipio(nombre, poblacion, anio, cp);
          res.add(m);
        }

      }
    } catch (IOException e) {
      System.out.println(e.toString());
    }

    return res;
  }

  public static Municipio buscarMunicipio(ArrayList<Municipio> lista, String nombre, Integer anio) {
    lista.sort((arg0, arg1) -> {
      return arg0.getAnio() - arg1.getAnio() + arg0.getNombre().compareTo(arg1.getNombre());
    });

    Municipio m = new Municipio(nombre, 0, anio, 0);

    return lista.get(Collections.binarySearch(lista, m, (arg0, arg1) -> {
      return (arg0.getNombre().compareTo(arg1.getNombre()) + arg0.getAnio() - arg1.getAnio());
    }));
  }

  public static HashMap<String, Integer> IncrementoPoblacion(ArrayList<Municipio> coleccionMunicipios, int year1,
      int year2) {
    HashMap<String, Integer> res = new HashMap<>();

    for (Municipio municipio : coleccionMunicipios) {
      Municipio municipioYear1 = buscarMunicipio(coleccionMunicipios, municipio.getNombre(), year1);
      Municipio municipioYear2 = buscarMunicipio(coleccionMunicipios, municipio.getNombre(), year2);

      int poblacionYear1 = municipioYear1.getPoblacion();
      int poblacionYear2 = municipioYear2.getPoblacion();
      int diff = poblacionYear1 - poblacionYear2;

      res.put(municipio.getNombre(), diff);
    }

    return res;
  }
}
