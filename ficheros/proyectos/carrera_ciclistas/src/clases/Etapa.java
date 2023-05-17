package clases;

import java.util.LinkedHashMap;
import java.util.Map;

import utils.jsonUtils;

public class Etapa {
  private Map<Integer, Integer> tiemposDorsal;
  private int numEtapa;

  public Etapa() {
  }

  public Etapa(int num, String path) {
    numEtapa = num;
    tiemposDorsal = jsonUtils.ReadEtapaFromJsonFile(path);
  }

  public Map<Integer, Integer> getTiemposDorsal() {
    return tiemposDorsal;
  }

  public void setTiemposDorsal(Map<Integer, Integer> tiemposDorsal) {
    this.tiemposDorsal = tiemposDorsal;
  }

  public int getNumEtapa() {
    return numEtapa;
  }

  public void setNumEtapa(int numEtapa) {
    this.numEtapa = numEtapa;
  }

  public static Integer getLastEntryValue(Map<Integer, Integer> map) {
    LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>(map);

    Integer lastValue = null;
    for (Map.Entry<Integer, Integer> entry : linkedHashMap.entrySet()) {
      lastValue = entry.getValue();
    }

    return lastValue;
  }

}
