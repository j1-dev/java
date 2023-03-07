package Clases.frioMijas_JuanGarcía.personal;

public class Jefe extends Personal {
  private Password password;

  public Jefe(String nombre, String apellidos, int edad, int salario, String dni) {
    super(nombre, apellidos, edad, salario, dni);
    password = new Password();
  }

  public void generaPassword() {
    password.generaPassword();
  }

  public void generaPassword(int size) {
    password.generaPassword(size);
  }

  public Password getPassword() {
    return password;
  }

  public void setPassword(Password password) {
    this.password = password;
  }

  public boolean esFuerte() {
    return password.esFuerte();
  }

  @Override
  public String toString() {
    return "Jefe [password=" + password + " " + super.toString() + "]";
  }
}
