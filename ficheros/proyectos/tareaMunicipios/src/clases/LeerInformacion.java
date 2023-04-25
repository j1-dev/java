package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public abstract class LeerInformacion {
  public ArrayList<Municipio> LeerFicheroMunicipio(Integer año) throws IOException {
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

        int cp = Integer.valueOf(splitLine[0]);
        String nombre = splitLine[1];
        String sexo = splitLine[2];
        int anio = Integer.valueOf(splitLine[3]);
        String numConPuntos;
        int poblacion;

        if (splitLine.length == 5) {
          numConPuntos = splitLine[4];
          poblacion = Integer.valueOf(numConPuntos.replace(".", ""));
        } else {
          numConPuntos = null;
          poblacion = -1;
        }

        if (sexo.equals("Total")) {
          Municipio m = new Municipio(nombre, poblacion, anio, cp);
          res.add(m);
        }

      }
    } catch (IOException e) {
      System.out.println(e.toString());
    } finally {
      fr.close();
      br.close();
    }
    return res;
  }

  public Municipio buscarMunicipio(ArrayList<Municipio> lista, String nombre, int anio) {
    lista.sort((arg0, arg1) -> {
      return arg0.getAnio() - arg1.getAnio() + arg0.getNombre().compareTo(arg1.getNombre());
    });
    Municipio m = new Municipio(nombre, 0, anio, 0);
    return lista.get(Collections.binarySearch(lista, m, ((arg0, arg1) -> {
      return (arg0.getNombre().compareTo(arg1.getNombre()) + arg0.getAnio() - arg1.getAnio());
    })));
  }
}
