package Clases.Usos;

import Clases.Ejemplos.CuentaCorriente;

public class UsoCuentaCorriente {
  public static void main(String[] args) {
    CuentaCorriente c1 = CuentaCorriente.crearCuenta("79035817C", "Juanito");

    c1.muestra();

    c1.ingresar(9999);

    c1.muestra();

    c1.sacarDinero(10000);

    c1.muestra();

  }
}
