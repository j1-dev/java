package Clases.frioMijas_JuanGarcía.personal;

public class Jefe extends Personal {
  private Password password;

  public Jefe(String nombre, String apellidos, int edad, int salario, String dni) {
    super(nombre, apellidos, edad, salario, dni);

  }

  public String generaPassword() {
    return "";
  }

  public String generaPassword(int size) {
    return "";
  }
}
