package clases;

public class Corredor extends Ciclista {
    private Integer dorsal;
    private Integer tiempo;

    public Corredor(String nombre, String codigoEquipo, Integer peso, String pais, Integer dorsal, Integer tiempo) {
        super(nombre, codigoEquipo, peso, pais);
        this.dorsal = dorsal;
        this.tiempo = tiempo;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public String toString() {
        return tiempo.toString();
    }
}
