package Funciones;

public class PartidoBaloncesto {

  // Variables de los equipos
  final static int E1_ACIERTO_2 = 70;
  final static int E2_ACIERTO_2 = 75;

  final static int E1_ACIERTO_3 = 45;
  final static int E2_ACIERTO_3 = 35;

  final static int E1_JUEGA_DE_2 = 60;
  final static int E2_JUEGA_DE_2 = 70;

  final static int E1_REBOTE_DEF = 60;
  final static int E1_REBOTE_ATA = 30;

  final static int E2_REBOTE_DEF = 70;
  final static int E2_REBOTE_ATA = 40;

  public static void main(String[] args) {

    int puntosE1 = 0;
    int puntosE2 = 0;

    System.out.println("Empieza la simulación del partido de baloncesto");

    // salto Inicial
    String turno = salto();
    System.out.println("Ataca el equipo: " + turno);

    // Un partido de baloncesto hay unas 150 posesiones de media.
    for (int posesion = 0; posesion < 150; posesion++) {
      int valorAtaque = canasta(turno);

      // Si hay canasta entonces el turno es del equipo que estaba defendiendo
      if (valorAtaque > 0) {
        if (turno.equals("E1")) {
          puntosE1 = actualizarPuntos(puntosE1, valorAtaque);
        } else {
          puntosE2 = actualizarPuntos(puntosE2, valorAtaque);
        }

        System.out.println("Canasta de " + turno + " - de " + valorAtaque + " puntos");
        imprimirResultado(puntosE1, puntosE2);
        turno = siguienteTurno(turno);
        System.out.println("Ataca el equipo: " + turno);
      } else {
        // no hay canasta, se produce un rebote
        turno = rebote(turno);
        System.out.println("Rebote del equipo: " + turno);
      }
    }
    System.out.println("-------------------------");
    System.out.println("FIN de partido");
    imprimirResultado(puntosE1, puntosE2);

  }

  // Funciones que necesito programar

  // devuelve E1 si el salto lo gana E1 y E2 si el salto lo gana E2
  static String salto() {
    int tipo = (int) Math.random();
    String equipo = "";

    if (tipo == 0) {
      equipo = "E1";
    } else {
      equipo = "E2";
    }

    return equipo;
  }

  // devuelve el valor de la canasta realizada (0, 2 o 3)
  static int canasta(String turno) {
    int valorCanasta = 0;
    int chanceJuegaDe2 = aleatorio(100);
    int chanceAcierta = aleatorio(100);

    if (turno == "E1") {
      if (chanceJuegaDe2 < E1_JUEGA_DE_2) {
        if (chanceAcierta > E1_ACIERTO_2) {
          valorCanasta = 2;
        }
      } else {
        if (chanceAcierta > E1_ACIERTO_3) {
          valorCanasta = 3;
        }
      }
    } else {
      if (chanceJuegaDe2 < E2_JUEGA_DE_2) {
        if (chanceAcierta > E2_ACIERTO_2) {
          valorCanasta = 2;
        }
      } else {
        if (chanceAcierta > E2_ACIERTO_3) {
          valorCanasta = 3;
        }
      }
    }

    return valorCanasta;
  }

  static int actualizarPuntos(int valorAcumulado, int valorAIncrementar) {
    return valorAcumulado + valorAIncrementar;
  }

  static String siguienteTurno(String turno) {
    String newTurno;

    if (turno == "E1") {
      newTurno = "E2";
    } else {
      newTurno = "E1";
    }

    return newTurno;
  }

  // devuelve E1 si el rebote lo gana E1 y E2 si el rebote lo gana E2
  static String rebote(String equipoAtaque) {
    String equipo;

    if (equipoAtaque == "E1") {
      if (rebote(E1_REBOTE_ATA, E2_REBOTE_DEF)) {
        equipo = "E1";
      } else {
        equipo = "E2";
      }
    } else {
      if (rebote(E2_REBOTE_ATA, E1_REBOTE_DEF)) {
        equipo = "E2";
      } else {
        equipo = "E1";
      }
    }

    return equipo;
  }

  /*
   * Indica true si el rebote es
   * de ataque y false si el rebote es de defensa
   * El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que
   * defiende es de 30 al maximo.
   */
  static Boolean rebote(int reboteAtaque, int reboteDefensa) {
    Boolean ataqDef = false;
    int chance = aleatorio(reboteDefensa);

    if (chance >= 0 && chance <= reboteAtaque) {
      ataqDef = true;
    } else if (chance >= 30 && chance <= reboteDefensa) {
      ataqDef = false;
    }

    return ataqDef;
  }

  // devuelve un numero aleatorio entre 0 y maximo
  static int aleatorio(int maximo) {
    return (int) (Math.random() * maximo);
  }

  // devuelve un número entre mínimo y máximo
  static int aleatorio(int minimo, int maximo) {
    return (int) (Math.random() * (maximo) + minimo);
  }

  // imprime el resultado actual del partido.
  static void imprimirResultado(int valor1, int valor2) {
    System.out.println("EQUIPO 1: " + valor1);
    System.out.println("EQUIPO 2: " + valor2);
  }

}