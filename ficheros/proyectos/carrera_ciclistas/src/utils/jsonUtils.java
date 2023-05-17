package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.databind.SerializationFeature;

import clases.Ciclista;
import clases.Equipo;

public class jsonUtils {

    public static Ciclista ReadCiclistaFromJsonFile(String relativePathFile) {
        File ficheroCiclistas = new File(relativePathFile);

        ObjectMapper objectMapper = new ObjectMapper();

        Ciclista cic = null;
        try {
            cic = objectMapper.readValue(ficheroCiclistas, Ciclista.class);
        } catch (IOException e) {

            e.printStackTrace();
        }

        return cic;

    }

    public static ArrayList<Ciclista> ReadCiclistaListFromJsonFile(String relativePathFile) {
        File ficheroCiclistas = new File(relativePathFile);
        ArrayList<Ciclista> lista = new ArrayList<>();

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            lista = objectMapper.readValue(ficheroCiclistas, new TypeReference<ArrayList<Ciclista>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public static ArrayList<Equipo> ReadEquipoListFromCSVFile(String relativePathFile) throws IOException {
        ArrayList<Equipo> equipos = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(relativePathFile);
            br = new BufferedReader(fr);

            br.readLine();
            String linea = br.readLine();
            while (linea != null) {
                String[] splitLine = linea.split(",");
                String codigo = splitLine[0];
                String nombre = splitLine[1];
                String nacionalidad = splitLine[2];
                Integer presupuesto = Integer.valueOf(splitLine[3]);
                Equipo e = new Equipo(codigo, nombre, nacionalidad, presupuesto);
                equipos.add(e);
                linea = br.readLine();
            }
        } catch (IOException error) {
            System.out.println(error);
        }

        return equipos;
    }

    public static Map<Integer, Integer> ReadEtapaFromJsonFile(String relativePathFile) {
        File jsonFile = new File(relativePathFile);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            map = objectMapper.readValue(jsonFile, new TypeReference<LinkedHashMap<Integer, Integer>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }

}