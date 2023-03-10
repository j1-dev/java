package barcos;

import personas.Pasajero;
import vehiculos.Vehiculo;

public class Barco {
  private int capVehiculos;
  private int capPersonas;
  private int maxKilos;
  private String nombre;
  private int fechaBotadura;
  private Vehiculo[] vehiculos;
  private Pasajero[] pasajeros;

  public Barco(String nombre, int fechaBotadura, int maxKilos, int capVehiculos, int capPersonas) {
    this.capVehiculos = capVehiculos;
    this.capPersonas = capPersonas;
    this.maxKilos = maxKilos;
    this.nombre = nombre;
    this.fechaBotadura = fechaBotadura;
    vehiculos = new Vehiculo[0];
    pasajeros = new Pasajero[0];
  }

  public void embarcarVehiculo(Vehiculo vehiculo) {
    Vehiculo[] newVehiculos = new Vehiculo[this.vehiculos.length + 1];
    boolean embarcado = haEmbarcado(vehiculo.getPropietario());
    boolean maxCap = vehiculos.length < capVehiculos;

    if (embarcado && maxCap) {
      for (int i = 0; i < this.vehiculos.length; i++) {
        newVehiculos[i] = this.vehiculos[i];
      }

      newVehiculos[this.vehiculos.length] = vehiculo;
      this.vehiculos = newVehiculos;
    } else {
      if (!embarcado) {
        System.out.println("El propietario de este vehiculo no ha embarcado todavia");
      } else if (!maxCap) {
        System.out.println("No caben mas vehiculos");
      }
      System.out.println(vehiculo.informacion());
    }
  }

  public void desembarcarVehiculo() {
    if (this.vehiculos.length != 0) {
      Vehiculo[] newVehiculos = new Vehiculo[this.vehiculos.length - 1];
      Vehiculo v = this.vehiculos[this.vehiculos.length - 1];

      System.out.println("DESEMBARCA: " + v.informacion());
      desembarcarPasajero(v.getPropietario());

      for (int i = 0; i < newVehiculos.length; i++) {
        newVehiculos[i] = this.vehiculos[i];
      }

      this.vehiculos = newVehiculos;
    } else {
      System.out.println("No quedan vehiculos en el barco");
    }
  }

  public void embarcarPasajero(Pasajero pasajero) {
    Pasajero[] newPasajeros = new Pasajero[this.pasajeros.length + 1];

    for (int i = 0; i < this.pasajeros.length; i++) {
      newPasajeros[i] = this.pasajeros[i];
    }
    newPasajeros[this.pasajeros.length] = pasajero;

    this.pasajeros = newPasajeros;
  }

  public void desembarcarPasajero(Pasajero pasajero) {
    Pasajero[] newPasajeros = new Pasajero[this.pasajeros.length - 1];
    boolean encontrado = false;
    int contador = 0;

    for (int i = 0; i < newPasajeros.length && !encontrado; i++) {
      if (pasajeros[i] == pasajero) {
        encontrado = true;
        contador = i;
      } else {
        newPasajeros[i] = pasajeros[i];
      }
    }

    for (int i = contador; i < newPasajeros.length; i++) {
      newPasajeros[i] = pasajeros[i + 1];
    }

    this.pasajeros = newPasajeros;
  }

  public String informacionBarco() {
    String str = "";
    str += nombre + " - Per.Max: " + capPersonas + " - Veh.max: " + capVehiculos + " - Kgs Maximo: " + maxKilos
        + " - Botadura: " + fechaBotadura + "\n";

    str += informacionPasajeros();
    str += informacionVehiculos();
    return str;
  }

  public String informacionVehiculos() {
    String str = "";
    str += "Vehiculos (" + vehiculos.length + ")\n";

    for (int i = 0; i < vehiculos.length; i++) {
      str += vehiculos[i].informacion() + "\n";
    }

    return str;
  }

  public String informacionPasajeros() {
    String str = "";
    str += "Pasajeros (" + pasajeros.length + ")\n";

    for (int i = 0; i < pasajeros.length; i++) {
      str += pasajeros[i].toString() + "\n";
    }

    return str;
  }

  private Boolean haEmbarcado(Pasajero pasajero) {
    Boolean result = false;

    for (int i = 0; i < pasajeros.length && !result; i++) {
      if (this.pasajeros[i].equals(pasajero)) {
        result = true;
      }
    }

    return result;
  }
}
