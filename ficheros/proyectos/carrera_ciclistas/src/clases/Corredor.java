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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dorsal == null) ? 0 : dorsal.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Corredor other = (Corredor) obj;
        if (dorsal == null) {
            if (other.dorsal != null)
                return false;
        } else if (!dorsal.equals(other.dorsal))
            return false;
        return true;
    }

}
