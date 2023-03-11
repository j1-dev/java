package Clases.frioMijas_JuanGarcía.personal;

public class Personal {
  private String nombre;
  private String apellidos;
  private int edad;
  private String dni;
  private int salario;
  private int id;
  private static int contador = 1;

  public Personal(String nombre, String apellidos, int edad, int salario, String dni) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
    this.dni = dni;
    this.salario = salario;
    id = contador++;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public int getSalario() {
    return salario;
  }

  public void setSalario(int salario) {
    this.salario = salario;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    String str = "";

    str += "nombre: " + nombre + ",\n";
    str += "apellidos: " + apellidos + ",\n";
    str += "edad: " + edad + ",\n";
    str += "dni: " + dni + ",\n";
    str += "salario: " + salario + ",\n";
    str += "id: " + id + ",\n";

    return str;
  }

}
