package Clases.Usos;

import Clases.Ejemplos.Hora;

import java.util.Scanner;

public class UsoHora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hora;
    int segundos;

    System.out.println("Introduzca la hora");
    hora = sc.nextInt();

    System.out.println("Introduce los segundos");
    segundos = sc.nextInt();

    sc.close();

    Hora hour = new Hora(hora);

    for (int i = 0; i <= segundos; i++) {
      System.out.println(hour);
      hour.addSegundos();
    }
  }
}
