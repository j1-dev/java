package clases;

public class Ciclista {
    private String nombre;
    private String codigoEquipo;
    private Integer peso;
    private String pais;


    public Ciclista(){}
    public Ciclista(String nombre, String codigoEquipo, Integer peso, String pais) {
        this.nombre = nombre;
        this.codigoEquipo = codigoEquipo;
        this.peso = peso;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "nombre='" + nombre + "'\n" +
                ", codigoEquipo='" + codigoEquipo + "'\n" +
                ", peso=" + peso + "'\n" +
                ", pais='" + pais + "'\n" +
                '}';
    }
}
