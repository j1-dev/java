package Clases.frioMijas_JuanGarcía.personal;

import java.util.Arrays;

import Clases.frioMijas_JuanGarcía.equipos.Electrodomestico;

public class Sede {
  private String ciudad;
  private String direccion;
  private int cp;
  private int codigoSede;
  private Jefe jefe;
  private Empleado[] empleados;
  private Electrodomestico[] electrodomesticos;
  private static int cont = 0;

  public Sede(String ciudad, String direccion, int cp, Jefe jefe) {
    this.ciudad = ciudad;
    this.direccion = direccion;
    this.cp = cp;
    this.codigoSede = cont++;
    this.jefe = jefe;
    this.empleados = new Empleado[0];
    this.electrodomesticos = new Electrodomestico[0];
  }

  public Sede(String ciudad, String direccion, int cp) {
    this.ciudad = ciudad;
    this.direccion = direccion;
    this.cp = cp;
    this.codigoSede = cont++;
    this.empleados = new Empleado[0];
    this.electrodomesticos = new Electrodomestico[0];

  }

  public Jefe getJefe() {
    return jefe;
  }

  public void setJefe(Jefe jefe) {
    this.jefe = jefe;
  }

  public Empleado[] getEmpleados() {
    return empleados;
  }

  public void setEmpleados(Empleado[] empleados) {
    this.empleados = empleados;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public int getCp() {
    return cp;
  }

  public void setCp(int cp) {
    this.cp = cp;
  }

  public int getCodigoSede() {
    return codigoSede;
  }

  public void setCodigoSede(int codigoSede) {
    this.codigoSede = codigoSede;
  }

  public static int getCont() {
    return cont;
  }

  public static void setCont(int cont) {
    Sede.cont = cont;
  }

  public void asignaElectrodomestico(Electrodomestico el) {
    boolean dup = false;
    for (int i = 0; i < electrodomesticos.length && !dup; i++) {
      if (electrodomesticos[i].equals(el)) {
        dup = true;
      }
    }

    if (!dup) {
      Electrodomestico[] newArr = new Electrodomestico[electrodomesticos.length + 1];
      for (int i = 0; i < electrodomesticos.length; i++) {
        newArr[i] = electrodomesticos[i];
      }
      newArr[electrodomesticos.length] = el;
      electrodomesticos = newArr;
    }

  }

  public void addEmpleado(Empleado emp) {
    boolean dup = false;
    for (int i = 0; i < empleados.length && !dup; i++) {
      if (empleados[i].equals(emp)) {
        dup = true;
      }
    }

    if (!dup) {
      Empleado[] newArr = new Empleado[empleados.length + 1];
      for (int i = 0; i < empleados.length; i++) {
        newArr[i] = empleados[i];
      }
      newArr[empleados.length] = emp;
      empleados = newArr;
    }

  }

  @Override
  public String toString() {
    String str = "";

    str += "--Sede--" + ",\n";
    str += "ciudad " + ciudad + ",\n";
    str += "direccion: " + direccion + ",\n";
    str += "cp: " + cp + ",\n";
    str += "codigoSede: " + codigoSede + ",\n";
    str += "jefe: " + jefe + ",\n";
    str += "empleados: \n" + Arrays.toString(empleados);
    str += "electrodomesticos: \n" + Arrays.toString(electrodomesticos);

    return str;
  }

}
