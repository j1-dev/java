import barcos.Barco;
import personas.Pasajero;
import vehiculos.*;

public class Melillero {

  public static void main(String[] args) {

    Barco elCano = new Barco("El Cano", 1789, 100000, 5, 100);

    Barco titanic = new Barco("Titanic", 1954, 100000, 50, 100);

    Pasajero p0 = new Pasajero("Pedro", "Hernández", "Brasileña", true);
    Pasajero p1 = new Pasajero("Juan", "Fernández", "Colombiana", true);
    Pasajero p2 = new Pasajero("Miguel", "Sánchez", "Venezolana", false);
    Pasajero p3 = new Pasajero("Juan", "García", "Venezolana", true);
    Pasajero p4 = new Pasajero("Miguel", "Sánchez", "Brasileña", true);
    Pasajero p5 = new Pasajero("Lucía", "López", "Uruguaya", true);
    Pasajero p6 = new Pasajero("Sofía", "López", "Brasileña", true);
    Pasajero p7 = new Pasajero("María", "Ruiz", "Colombiana", true);
    Pasajero p8 = new Pasajero("Ana", "Hernández", "Peruana", false);
    Pasajero p9 = new Pasajero("Miguel", "Sánchez", "Peruana", false);
    Pasajero p10 = new Pasajero("Miguel", "Sánchez", "Brasileña", true);
    Pasajero p11 = new Pasajero("María", "García", "Mexicana", true);
    Pasajero p12 = new Pasajero("Carlos", "Hernández", "Argentina", true);
    Pasajero p13 = new Pasajero("Juan", "Pérez", "Uruguaya", true);
    Pasajero p14 = new Pasajero("María", "Jiménez", "Mexicana", true);
    Pasajero p15 = new Pasajero("Juan", "García", "Brasileña", true);
    Pasajero p16 = new Pasajero("María", "González", "Venezolana", false);
    Pasajero p17 = new Pasajero("Elena", "Pérez", "Brasileña", false);
    Pasajero p18 = new Pasajero("Miguel", "Jiménez", "Chilena", true);
    Pasajero p19 = new Pasajero("Ana", "Hernández", "Ecuatoriana", true);
    Pasajero p20 = new Pasajero("Carlos", "Ruiz", "Colombiana", true);

    Motocicleta v0 = new Motocicleta("OUGY-9740", 339, true);
    Coche v1 = new Coche("TROO-4706", 3, true);
    Camion v2 = new Camion("GLKZ-2936", 8434);
    Motocicleta v3 = new Motocicleta("WAEJ-6348", 56, true);
    Camion v4 = new Camion("ZDAC-5327", 10921);
    Camion v5 = new Camion("PKPL-0005", 3116);
    Motocicleta v6 = new Motocicleta("NBMF-5602", 295, true);
    Camion v7 = new Camion("BAQY-3696", 3289);
    Camion v8 = new Camion("CDEJ-3243", 7212);
    Motocicleta v9 = new Motocicleta("TNNI-2932", 254, false);
    Motocicleta v10 = new Motocicleta("EGOK-3521", 417, true);
    Camion v11 = new Camion("UHAQ-8122", 18397);
    Motocicleta v12 = new Motocicleta("IBHA-1502", 193, false);
    Motocicleta v13 = new Motocicleta("IMCO-1402", 375, true);
    Coche v14 = new Coche("JBJA-2056", 5, true);
    Camion v15 = new Camion("KKVH-6698", 8152);
    Camion v16 = new Camion("QQRA-8107", 13320);
    Motocicleta v17 = new Motocicleta("UNIT-3188", 492, true);
    Motocicleta v18 = new Motocicleta("GRWQ-5702", 125, true);
    Coche v19 = new Coche("UMON-9063", 2, false);
    Camion v20 = new Camion("WYOE-4010", 19090);

    v0.setPropietario(p0);
    v1.setPropietario(p1);
    v2.setPropietario(p2);
    v3.setPropietario(p3);
    v4.setPropietario(p4);
    v5.setPropietario(p5);
    v6.setPropietario(p6);
    v7.setPropietario(p7);
    v8.setPropietario(p8);
    v9.setPropietario(p9);
    v10.setPropietario(p10);
    v11.setPropietario(p11);
    v12.setPropietario(p12);
    v13.setPropietario(p13);
    v14.setPropietario(p14);
    v15.setPropietario(p15);
    v16.setPropietario(p16);
    v17.setPropietario(p17);
    v18.setPropietario(p18);
    v19.setPropietario(p19);
    v20.setPropietario(p20);

    System.out.println("xxxxx BARCO EL CANO XXXXXXX");

    elCano.embarcarPasajero(p0);
    elCano.embarcarPasajero(p1);
    elCano.embarcarPasajero(p2);
    elCano.embarcarPasajero(p3);
    elCano.embarcarPasajero(p4);
    elCano.embarcarPasajero(p5);
    elCano.embarcarPasajero(p6);

    elCano.embarcarVehiculo(v0);
    elCano.embarcarVehiculo(v1);
    elCano.embarcarVehiculo(v2);
    elCano.embarcarVehiculo(v3);
    elCano.embarcarVehiculo(v4);
    elCano.embarcarVehiculo(v5); // NO CABEN MAS Vehiculos
    elCano.embarcarVehiculo(v6); // NO CABEN MAS Vehiculos

    System.out.println("----------------------------------------");
    System.out.println(elCano.informacionBarco());
    System.out.println("----------------------------------------");

    System.out.println("\n\n");
    System.out.println("xxxxx BARCO: TITANIC XXXXXXX");

    titanic.embarcarPasajero(p10);
    titanic.embarcarPasajero(p11);
    titanic.embarcarPasajero(p12);
    titanic.embarcarPasajero(p13);
    titanic.embarcarPasajero(p14);
    titanic.embarcarPasajero(p15);
    titanic.embarcarPasajero(p16);
    titanic.embarcarPasajero(p18);

    titanic.embarcarVehiculo(v10);
    titanic.embarcarVehiculo(v11);
    titanic.embarcarVehiculo(v12);
    titanic.embarcarVehiculo(v13);
    titanic.embarcarVehiculo(v14);
    titanic.embarcarVehiculo(v15);
    titanic.embarcarVehiculo(v16);
    titanic.embarcarVehiculo(v17); // Propierario no ha embarcado

    System.out.println("----------------------------------------");
    System.out.println(titanic.informacionBarco());

    titanic.desembarcarVehiculo();
    titanic.desembarcarVehiculo();

    System.out.println("----------------------------------------");
    System.out.println("xxxxx BARCO: TITANIC (2) XXXXXXX");
    System.out.println(titanic.informacionPasajeros());
    System.out.println("----------------------------------------");
    System.out.println(titanic.informacionVehiculos());
    System.out.println("----------------------------------------");

    titanic.desembarcarVehiculo();
    titanic.desembarcarVehiculo();
    titanic.desembarcarVehiculo();
    titanic.desembarcarVehiculo();
    titanic.desembarcarVehiculo();
    titanic.desembarcarVehiculo(); // No quedan vehiculos en el baco

    System.out.println(titanic.informacionPasajeros());

  }

  /*
   * xxxxx BARCO EL CANO XXXXXXX
   * No caben mas vehículos
   * No caben mas vehículos
   * ----------------------------------------
   * El Cano - Per.Max: 100 - Veh.Max: 5 - Kgs Maximo:100000 kgs - Botadura:1789
   * Pasajeros (7)
   * Pedro - Hernández - Brasileña - Camarote: true (Codigo=1 )
   * Juan - Fernández - Colombiana - Camarote: true (Codigo=2 )
   * Miguel - Sánchez - Venezolana - Camarote: false (Codigo=3 )
   * Juan - García - Venezolana - Camarote: true (Codigo=4 )
   * Miguel - Sánchez - Brasileña - Camarote: true (Codigo=5 )
   * Lucía - López - Uruguaya - Camarote: true (Codigo=6 )
   * Sofía - López - Brasileña - Camarote: true (Codigo=7 )
   * Vehiculos (5)
   * Motocicleta: matricula=OUGY-9740- propietario=Pedro - Hernández - Brasileña -
   * Camarote: true (Codigo=1 ) - Cilindrada: 339 - ConCarnet: true
   * Coche: matricula=TROO-4706- propietario=Juan - Fernández - Colombiana -
   * Camarote: true (Codigo=2 ) - Num Puestas: 3 -Es particular: true
   * Camion: matricula=GLKZ-2936- propietario=Miguel - Sánchez - Venezolana -
   * Camarote: false (Codigo=3 ) - Capacidad Carga: 8434
   * Motocicleta: matricula=WAEJ-6348- propietario=Juan - García - Venezolana -
   * Camarote: true (Codigo=4 ) - Cilindrada: 56 - ConCarnet: true
   * Camion: matricula=ZDAC-5327- propietario=Miguel - Sánchez - Brasileña -
   * Camarote: true (Codigo=5 ) - Capacidad Carga: 10921
   * 
   * ----------------------------------------
   * 
   * 
   * 
   * xxxxx BARCO: TITANIC XXXXXXX
   * El propietario de este coche (Elena) no ha embarcado aún.
   * ----------------------------------------
   * Titanic - Per.Max: 100 - Veh.Max: 50 - Kgs Maximo:100000 kgs - Botadura:1954
   * Pasajeros (8)
   * Miguel - Sánchez - Brasileña - Camarote: true (Codigo=11 )
   * María - García - Mexicana - Camarote: true (Codigo=12 )
   * Carlos - Hernández - Argentina - Camarote: true (Codigo=13 )
   * Juan - Pérez - Uruguaya - Camarote: true (Codigo=14 )
   * María - Jiménez - Mexicana - Camarote: true (Codigo=15 )
   * Juan - García - Brasileña - Camarote: true (Codigo=16 )
   * María - González - Venezolana - Camarote: false (Codigo=17 )
   * Miguel - Jiménez - Chilena - Camarote: true (Codigo=19 )
   * Vehiculos (7)
   * Motocicleta: matricula=EGOK-3521- propietario=Miguel - Sánchez - Brasileña -
   * Camarote: true (Codigo=11 ) - Cilindrada: 417 - ConCarnet: true
   * Camion: matricula=UHAQ-8122- propietario=María - García - Mexicana -
   * Camarote: true (Codigo=12 ) - Capacidad Carga: 18397
   * Motocicleta: matricula=IBHA-1502- propietario=Carlos - Hernández - Argentina
   * - Camarote: true (Codigo=13 ) - Cilindrada: 193 - ConCarnet: false
   * Motocicleta: matricula=IMCO-1402- propietario=Juan - Pérez - Uruguaya -
   * Camarote: true (Codigo=14 ) - Cilindrada: 375 - ConCarnet: true
   * Coche: matricula=JBJA-2056- propietario=María - Jiménez - Mexicana -
   * Camarote: true (Codigo=15 ) - Num Puestas: 5 -Es particular: true
   * Camion: matricula=KKVH-6698- propietario=Juan - García - Brasileña -
   * Camarote: true (Codigo=16 ) - Capacidad Carga: 8152
   * Camion: matricula=QQRA-8107- propietario=María - González - Venezolana -
   * Camarote: false (Codigo=17 ) - Capacidad Carga: 13320
   * 
   * DESEMBARCA el Camion: matricula=QQRA-8107- propietario=María - González -
   * Venezolana - Camarote: false (Codigo=17 ) - Capacidad Carga: 13320
   * DESEMBARCA el pasajero: María - González - Venezolana - Camarote: false
   * (Codigo=17 )
   * DESEMBARCA el Camion: matricula=KKVH-6698- propietario=Juan - García -
   * Brasileña - Camarote: true (Codigo=16 ) - Capacidad Carga: 8152
   * DESEMBARCA el pasajero: Juan - García - Brasileña - Camarote: true (Codigo=16
   * )
   * ----------------------------------------
   * xxxxx BARCO: TITANIC (2) XXXXXXX
   * Pasajeros (6)
   * Miguel - Sánchez - Brasileña - Camarote: true (Codigo=11 )
   * María - García - Mexicana - Camarote: true (Codigo=12 )
   * Carlos - Hernández - Argentina - Camarote: true (Codigo=13 )
   * Juan - Pérez - Uruguaya - Camarote: true (Codigo=14 )
   * María - Jiménez - Mexicana - Camarote: true (Codigo=15 )
   * Miguel - Jiménez - Chilena - Camarote: true (Codigo=19 )
   * 
   * ----------------------------------------
   * Vehiculos (5)
   * Motocicleta: matricula=EGOK-3521- propietario=Miguel - Sánchez - Brasileña -
   * Camarote: true (Codigo=11 ) - Cilindrada: 417 - ConCarnet: true
   * Camion: matricula=UHAQ-8122- propietario=María - García - Mexicana -
   * Camarote: true (Codigo=12 ) - Capacidad Carga: 18397
   * Motocicleta: matricula=IBHA-1502- propietario=Carlos - Hernández - Argentina
   * - Camarote: true (Codigo=13 ) - Cilindrada: 193 - ConCarnet: false
   * Motocicleta: matricula=IMCO-1402- propietario=Juan - Pérez - Uruguaya -
   * Camarote: true (Codigo=14 ) - Cilindrada: 375 - ConCarnet: true
   * Coche: matricula=JBJA-2056- propietario=María - Jiménez - Mexicana -
   * Camarote: true (Codigo=15 ) - Num Puestas: 5 -Es particular: true
   * 
   * ----------------------------------------
   * DESEMBARCA el Coche: matricula=JBJA-2056- propietario=María - Jiménez -
   * Mexicana - Camarote: true (Codigo=15 ) - Num Puestas: 5 -Es particular: true
   * DESEMBARCA el pasajero: María - Jiménez - Mexicana - Camarote: true
   * (Codigo=15 )
   * DESEMBARCA el Motocicleta: matricula=IMCO-1402- propietario=Juan - Pérez -
   * Uruguaya - Camarote: true (Codigo=14 ) - Cilindrada: 375 - ConCarnet: true
   * DESEMBARCA el pasajero: Juan - Pérez - Uruguaya - Camarote: true (Codigo=14 )
   * DESEMBARCA el Motocicleta: matricula=IBHA-1502- propietario=Carlos -
   * Hernández - Argentina - Camarote: true (Codigo=13 ) - Cilindrada: 193 -
   * ConCarnet: false
   * DESEMBARCA el pasajero: Carlos - Hernández - Argentina - Camarote: true
   * (Codigo=13 )
   * DESEMBARCA el Camion: matricula=UHAQ-8122- propietario=María - García -
   * Mexicana - Camarote: true (Codigo=12 ) - Capacidad Carga: 18397
   * DESEMBARCA el pasajero: María - García - Mexicana - Camarote: true (Codigo=12
   * )
   * DESEMBARCA el Motocicleta: matricula=EGOK-3521- propietario=Miguel - Sánchez
   * - Brasileña - Camarote: true (Codigo=11 ) - Cilindrada: 417 - ConCarnet: true
   * DESEMBARCA el pasajero: Miguel - Sánchez - Brasileña - Camarote: true
   * (Codigo=11 )
   * No quedan vehiculos en el barco
   * Pasajeros (1)
   * Miguel - Jiménez - Chilena - Camarote: true (Codigo=19 )
   * 
   */

}