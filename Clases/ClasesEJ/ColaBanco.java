package Clases.ClasesEJ;

public class ColaBanco {
  private Cliente[] clientes;

  public ColaBanco() {
    clientes = new Cliente[0];
  }

  public void cogerTurno(Cliente cliente) {
    Cliente[] newClientes = new Cliente[clientes.length + 1];

    for (int i = 0; i < clientes.length; i++) {
      newClientes[i] = clientes[i];
    }

    newClientes[clientes.length] = cliente;
    clientes = newClientes;
  }

  public Cliente atender() {
    Cliente[] newClientes = new Cliente[clientes.length - 1];
    Cliente c = clientes[0];

    for (int i = 1; i < newClientes.length + 1; i++) {
      newClientes[i - 1] = clientes[i];
    }
    clientes = newClientes;

    return c;
  }
}
