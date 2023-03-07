package Clases.frioMijas_JuanGarcía.personal;

public class Empleado extends Personal {

  public Empleado(String nombre, String apellidos, int edad, int salario, String dni) {
    super(nombre, apellidos, edad, salario, dni);
  }

  @Override
  public String toString() {
    return "Empleado [" + super.toString() + "]";
  }

  @Override
  public boolean equals(Object pers) {
    Empleado emp = (Empleado) pers;
    return this.getDni().equals(emp.getDni());
  }

}
