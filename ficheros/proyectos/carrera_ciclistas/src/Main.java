import clases.Carrera;
import clases.Ciclista;
import clases.Corredor;
import clases.Etapa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import utils.jsonUtils;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "src/recursos/vueltaMalaga.txt";

        try (FileWriter fileWriter = new FileWriter(filePath);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("");

            ArrayList<Ciclista> ciclistas = jsonUtils.ReadCiclistaListFromJsonFile("src/recursos/ciclistas.json");
            Carrera vueltaMalaga = new Carrera(ciclistas, "La Vuelta Malaga");

            bufferedWriter.write("====NOMBRE DE LA CARRERA ====\n");
            bufferedWriter.write(vueltaMalaga.getNombre() + "\n");

            bufferedWriter.write("====CICLISTAS PARTICIPANTES EN LA CARRERA ====\n");
            for (Ciclista ciclista : ciclistas) {
                bufferedWriter.write(ciclista.toString() + "\n");
            }

            Etapa e1 = new Etapa(1, "src/recursos/etapa1.json");
            Etapa e2 = new Etapa(2, "src/recursos/etapa2.json");
            Etapa e3 = new Etapa(3, "src/recursos/etapa3.json");

            vueltaMalaga.insertarTiemposEtapa(e1.getTiemposDorsal());
            vueltaMalaga.insertarTiemposEtapa(e2.getTiemposDorsal());
            vueltaMalaga.insertarTiemposEtapa(e3.getTiemposDorsal());

            bufferedWriter.write("==== CLASIFICACIÓN FINAL ====\n");
            bufferedWriter.write(vueltaMalaga.clasificacionCompleta() + "\n");

            bufferedWriter.write("==== PODIUM ====\n");
            bufferedWriter.write(vueltaMalaga.podium() + "\n");

            bufferedWriter.write("==== CLASIFICACIÓN POR EQUIPOS====\n");
            bufferedWriter.write(vueltaMalaga.clasificacionPorEquipos() + "\n");

            bufferedWriter.write("==== POSICIÓN DEL CORREDOR: Wilco Kelderman(BOHA) Dorsal: 22 ====\n");
            Corredor c = new Corredor(null, null, null, null, 22, null);

            bufferedWriter.write("Posicion: " + vueltaMalaga.posicionCorredor(c) + "\n");
            System.out.println("Content written to the file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}