package contenedores.pruebas;

import Clases.ClasesEJ.Cliente;
import Clases.frioMijas_JuanGarcía.equipos.Frigorifico;
import contenedores.ContenedorBase;

public class UsoContenedorBase {
  public static void main(String[] args) {
    Cliente cliente = new Cliente(null, 0);
    Frigorifico frigorifico = new Frigorifico(0, 0, 0, 0, null);
    ContenedorBase<Cliente> c_cliente = new ContenedorBase<Cliente>();
    ContenedorBase<Frigorifico> c_frigorifico = new ContenedorBase<Frigorifico>();

    c_cliente.insertar(cliente);
    c_frigorifico.insertar(frigorifico);
  }
}
