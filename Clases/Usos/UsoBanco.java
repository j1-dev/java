package Clases.Usos;

import Clases.ClasesEJ.*;

public class UsoBanco {
  public static void main(String[] args) {
    Caja caja = new Caja(100d);
    ColaBanco cola = new ColaBanco();

    Cliente c1 = new Cliente("Juan", Accion.INGRESAR, 200d);
    Cliente c2 = new Cliente("Pepe", Accion.SACAR, 100d);
    Cliente c3 = new Cliente("Rosa", Accion.INGRESAR, 100d);
    Cliente c4 = new Cliente("Luis", Accion.SACAR, 100d);
    Cliente c5 = new Cliente("Gema", Accion.INGRESAR, 200d);
    Cliente c6 = new Cliente("Paco", Accion.SACAR, 200d);

    cola.cogerTurno(c1);
    cola.cogerTurno(c2);
    cola.cogerTurno(c3);
    cola.cogerTurno(c4);
    cola.cogerTurno(c5);
    cola.cogerTurno(c6);

    for (int i = 0; i < 6; i++) {
      caja.atiende(cola.atender());
      System.out.println(caja.saldo());
    }

  }

}
