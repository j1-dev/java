package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Carrera {
    private String nombre;
    private ArrayList<Corredor> corredores;
    private ArrayList<Equipo> equipos;

    //Dado un conjunto de ciclistas se crean los
    //corredores correspondientes, se les asignan dorsales correlativos desde el 1 en adelante.
    public Carrera(List<Ciclista> ciclistas , String nombre){}

    public void insertarTiemposEtapa(Map<Integer, Integer> tiempos){}

    public void ordenarCorredoresPorTiempo() {}

    public Corredor buscarCorredorPorDorsal(int dorsal) {return null;}

    public Integer posicionCorredor(Corredor c) {return null;}

    // Devuelve el pelotón completo ordenado por tiempo, cada
    // linea será un ciclista con este formato: “dorsal – NombreCiclista (codEquipo) : tiempo”
    public String clasificacionCompleta(){return null;}

    //Para calcular la clasificación por equipos se toman los
    //3 mejores corredores de cada equipo y se suman sus tiempo. (Puede haber equipos que no
    //tienen corredores en alguna carrera en tal caso no deben aparecer en el resultado).
    public String clasificacionPorEquipos(){return null;}

    public String podium(){return null;}
}
