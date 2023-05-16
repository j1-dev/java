package clases;

import java.util.ArrayList;
public class Equipo {
    private ArrayList<Ciclista> ciclistas;
    private String codigo;
    private String nombre;
    private String nacionalidad;
    private Integer presupuesto;

    public Equipo() {
    }

    public Equipo(String codigo, String nombre, String nacionalidad, Integer presupuesto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.presupuesto = presupuesto;
    }

    public ArrayList<Ciclista> getCiclistas() {
        return ciclistas;
    }

    public void setCiclistas(ArrayList<Ciclista> ciclistas) {
        this.ciclistas = ciclistas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Integer presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "ciclistas=" + ciclistas +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", presupuesto=" + presupuesto +
                '}';
    }
}
