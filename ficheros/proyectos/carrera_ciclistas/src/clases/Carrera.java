package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import utils.jsonUtils;

public class Carrera {
    private String nombre;
    private ArrayList<Corredor> corredores;
    private ArrayList<Equipo> equipos;

    // Dado un conjunto de ciclistas se crean los
    // corredores correspondientes, se les asignan dorsales correlativos desde el 1
    // en adelante.
    public Carrera(List<Ciclista> ciclistas, String nombre) {
        this.nombre = nombre;

        corredores = new ArrayList<>();
        int contador = 1;
        for (Ciclista ciclista : ciclistas) {
            Corredor c = new Corredor(ciclista.getNombre(),
                    ciclista.getCodigoEquipo(),
                    ciclista.getPeso(),
                    ciclista.getPais(),
                    contador++,
                    0);
            corredores.add(c);
        }

        try {
            this.equipos = jsonUtils.ReadEquipoListFromCSVFile("src/recursos/equipos.csv");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertarTiemposEtapa(Map<Integer, Integer> tiempos) {
        int lastTiempo = getLastEntryValue(tiempos);
        // System.out.println(lastTiempo);

        for (Corredor corredor : corredores) {
            int dorsal = corredor.getDorsal();
            int prevTiempo = corredor.getTiempo();
            if (tiempos.containsKey(dorsal)) {
                int tiempo = tiempos.get(dorsal);
                corredor.setTiempo(prevTiempo + tiempo);
            } else {
                corredor.setTiempo(prevTiempo + lastTiempo);
            }
        }

    }

    public void ordenarCorredoresPorTiempo() {
        corredores.sort((arg0, arg1) -> arg0.getTiempo() - arg1.getTiempo());
    }

    public Corredor buscarCorredorPorDorsal(int dorsal) {
        for (Corredor corredor : corredores) {
            if (corredor.getDorsal().equals(dorsal)) {
                return corredor;
            }
        }

        return null;
    }

    public Integer posicionCorredor(Corredor c) {
        int contador = 0;
        for (Corredor corredor : corredores) {
            contador++;
            if (corredor.equals(c)) {
                return contador;
            }
        }
        return -1;
    }

    // Devuelve el pelotón completo ordenado por tiempo, cada
    // linea será un ciclista con este formato: “dorsal – NombreCiclista (codEquipo)
    // : tiempo”
    public String clasificacionCompleta() {
        String str = "";

        ordenarCorredoresPorTiempo();

        for (Corredor corredor : corredores) {
            str += corredor.getDorsal() + " - " + corredor.getNombre() + " (" + corredor.getCodigoEquipo() + "): "
                    + corredor.getTiempo() + "\n";
        }

        return str;
    }

    // Para calcular la clasificación por equipos se toman los
    // 3 mejores corredores de cada equipo y se suman sus tiempo. (Puede haber
    // equipos que no
    // tienen corredores en alguna carrera en tal caso no deben aparecer en el
    // resultado).
    public String clasificacionPorEquipos() {
        String str = "";
        HashMap<String, ArrayList<Corredor>> map = new HashMap<>();

        for (Corredor corredor : corredores) {
            String equipo = corredor.getCodigoEquipo();
            if (map.containsKey(equipo)) {
                map.get(equipo).add(corredor);
            } else {
                ArrayList<Corredor> tmp = new ArrayList<>();
                tmp.add(corredor);
                map.put(equipo, tmp);
            }
        }

        HashMap<String, Integer> mapTiempos = new HashMap<>();
        for (Map.Entry<String, ArrayList<Corredor>> entry : map.entrySet()) {
            entry.getValue().sort((arg0, arg1) -> arg0.getTiempo() - arg1.getTiempo());
            int tiempoTotal = 0;
            for (int i = 0; i < 3; i++) {
                tiempoTotal += entry.getValue().get(i).getTiempo();
            }
            mapTiempos.put(entry.getKey(), tiempoTotal);
        }

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        mapTiempos.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            str += entry.getKey() + " - " + entry.getValue() + "\n";
        }

        return str;
    }

    public String podium() {
        String pod = clasificacionCompleta();
        String[] podSplit = pod.split("\n");
        String str = "";

        for (int i = 0; i < 3; i++) {
            str += podSplit[i] + "\n";
        }

        return str;
    }

    public static Integer getLastEntryValue(Map<Integer, Integer> map) {
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>(map);

        Integer lastValue = null;
        for (Map.Entry<Integer, Integer> entry : linkedHashMap.entrySet()) {
            lastValue = entry.getValue();
        }

        return lastValue;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(ArrayList<Corredor> corredores) {
        this.corredores = corredores;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

}
