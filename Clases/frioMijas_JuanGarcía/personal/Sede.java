package Clases.frioMijas_JuanGarcía.personal;

import java.util.Arrays;

public class Sede {
  private String ciudad;
  private String direccion;
  private int cp;
  private int codigoSede;
  private Jefe jefe;
  private Empleado[] empleados;
  private static int cont = 0;

  public Sede(String ciudad, String direccion, int cp, Jefe jefe) {
    this.ciudad = ciudad;
    this.direccion = direccion;
    this.cp = cp;
    this.codigoSede = cont++;
    this.jefe = jefe;
    this.empleados = new Empleado[0];
  }

  public Sede(String ciudad, String direccion, int cp) {
    this.ciudad = ciudad;
    this.direccion = direccion;
    this.cp = cp;
    this.codigoSede = cont++;
    this.empleados = new Empleado[0];
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
    return "Sede [ciudad=" + ciudad + ", direccion=" + direccion + ", cp=" + cp + ", codigoSede=" + codigoSede
        + ", jefe=" + jefe.toString() + ", empleados=" + Arrays.toString(empleados) + "]";
  }

}
