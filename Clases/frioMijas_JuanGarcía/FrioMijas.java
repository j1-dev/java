package Clases.frioMijas_JuanGarcía;

import Clases.frioMijas_JuanGarcía.equipos.*;
import Clases.frioMijas_JuanGarcía.personal.*;

public class FrioMijas {

  public static void main(String[] args) {

    Jefe jefe1 = new Jefe("Jefazo", "Garcia", 45, 2500, "45000001X");
    Jefe jefe2 = new Jefe("Jefe_malaga", "Lopez", 34, 2100, "77000002P");

    Sede sede1 = new Sede("Madrid", "Calle ancha", 80881, jefe1);

    Sede sede2 = new Sede("Malaga", "Calle Larios", 29001);
    sede2.setJefe(jefe2);

    Empleado empleado1 = new Empleado("Daniel", "ape1", 35, 1000, "88000008W");
    Empleado empleado2 = new Empleado("Juan", "ape2", 35, 1200, "21000008E");
    Empleado empleado3 = new Empleado("Maria", "ape3", 55, 1700, "99000008R");
    Empleado empleado4 = new Empleado("Pepe", "ape4", 45, 900, "66000008Y");
    Empleado empleado5 = new Empleado("Pedro", "ape5", 30, 2000, "54000008T");
    Empleado empleado6 = new Empleado("Daniel", "ape6", 24, 1000, "12000008P");
    Empleado empleado7 = new Empleado("Pilar", "ape7", 24, 1000, "12000008P");

    System.out.println(empleado1);
    System.out.println(empleado2);

    sede1.addEmpleado(empleado1);
    sede1.addEmpleado(empleado2);

    sede2.addEmpleado(empleado3);
    sede2.addEmpleado(empleado4);
    sede2.addEmpleado(empleado5);
    sede2.addEmpleado(empleado6);
    sede2.addEmpleado(empleado7);

    // Cambiamos contraseñas
    System.out.println(jefe1);
    jefe1.generaPassword(5);
    System.out.println("Nueva contraseña para jefe1");
    System.out.println(jefe1);

    System.out.println(jefe2);
    jefe2.generaPassword();
    System.out.println("Nueva contraseña para jefe2");
    System.out.println(jefe2);

    // Mostrar la información completa de cada una de las sedes + jefe + empleados
    System.out.println(sede1);

    System.out.println(sede2);

    /*
     * HACER *
     * Mostrar si la contraseña de los jefes es no Fuerte
     */

    System.out.println(jefe1.esFuerte());
    System.out.println(jefe2.esFuerte());

    /*
     * HACER
     * Generar contraseña de 10 elementos que sea fuerte para cada uno de los jefes
     */

    do {
      jefe1.generaPassword(10);
    } while (!jefe1.esFuerte());

    System.out.println(jefe1);

    do {
      jefe2.generaPassword(10);
    } while (!jefe2.esFuerte());

    System.out.println(jefe2);
    /*
     * HACER *
     * Empleados de la sede2 con sueldo entre 500 y 1500
     */
    Empleado[] aux = sede2.getEmpleados();
    for (int i = 0; i < aux.length; i++) {
      if (aux[i].getSalario() >= 500 && aux[i].getSalario() <= 1500) {
        System.out.println(aux[i]);
      }
    }

    /*
     * HACER *
     * Crea 5 equipos frigorificos diferentes y asignalos a la 2º sede y muéstralos
     * a continuación
     */
    Camara elec1 = new Camara(12, 24, 34, 1500, "Bosch", -12);
    Frigorifico elec2 = new Frigorifico(32, 45, 64, 3422, "Samsung");
    Minibar elec3 = new Minibar(32, 45, 32, 2000, "Siemens", 4);
    Arcon elec4 = new Arcon(70, 24, 20, 1400, "Balay", "laterla");
    Frigorifico elec5 = new Frigorifico(70, 40, 60, 4500, "Fagor");

    sede2.asignaElectrodomestico(elec1);
    sede2.asignaElectrodomestico(elec2);
    sede2.asignaElectrodomestico(elec3);
    sede2.asignaElectrodomestico(elec4);
    sede2.asignaElectrodomestico(elec5);

    System.out.println(sede2);

  }
}