import java.util.List;

import modelo.Coche;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, JSon!");

        // Leer Json que contiene 1 objeto y convertirlo en objeto
        jsonUtils.LeerEmpleadoFromJsonFile("src/recursos/coche.json");

        System.out.println("==============================================");

        // Leer Json que contiene 1 array de objetos y convertirlo en un list<objeto>
        List<Coche> listaCoches = jsonUtils.LeerListEmpleadoFromJsonFile("src/recursos/arrayCoches.json");
        System.out.println("====== ARRAY EMPLEADOS =======================");

        double mediaPrecio = 0;
        for (Coche coche : listaCoches) {
            mediaPrecio += coche.getPrecio();
            System.out.println(coche);
        }
        mediaPrecio /= listaCoches.size();
        System.out.println("El precio medio de todos los coches es: " + mediaPrecio);

        System.out.println("==============================================");

        // Convertir objeto a Json
        jsonUtils.convertToJson(listaCoches.get(2));
    }
}
