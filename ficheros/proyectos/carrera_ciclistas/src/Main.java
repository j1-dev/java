import clases.Carrera;
import clases.Ciclista;
import clases.Etapa;

import java.io.IOException;
import java.util.ArrayList;
import utils.jsonUtils;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Ciclista> ciclistas = jsonUtils.ReadCiclistaListFromJsonFile("src/recursos/ciclistas.json");
        Carrera vueltaMalaga = new Carrera(ciclistas, "La Vuelta Malaga");

        System.out.println("====NOMBRE DE LA CARRERA ====");
        System.out.println(vueltaMalaga.getNombre());

        System.out.println("====CICLISTAS PARTICIPANTES EN LA CARRERA ====");
        for (Ciclista ciclista : ciclistas) {
            System.out.println(ciclista);
        }

        Etapa e1 = new Etapa(1, "src/recursos/etapa1.json");
        Etapa e2 = new Etapa(2, "src/recursos/etapa2.json");
        Etapa e3 = new Etapa(3, "src/recursos/etapa3.json");

        vueltaMalaga.insertarTiemposEtapa(e1.getTiemposDorsal());
        vueltaMalaga.insertarTiemposEtapa(e2.getTiemposDorsal());
        vueltaMalaga.insertarTiemposEtapa(e3.getTiemposDorsal());

        System.out.println("==== CLASIFICACIÓN FINAL ====");
        System.out.println(vueltaMalaga.clasificacionCompleta());

        System.out.println("==== PODIUM ====");
        System.out.println(vueltaMalaga.podium());

        System.out.println("==== CLASIFICACIÓN POR EQUIPOS====");
        System.out.println(vueltaMalaga.clasificacionPorEquipos());

        System.out.println("==== POSICIÓN DEL CORREDOR: Wilco Kelderman(BOHA) Dorsal: 22 ====");
    }
}