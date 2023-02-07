package Clases.ClasesEJ;

public class Incidencia {
  private static int codigo;
  private int cod;
  private int puesto;
  private String problema;
  private boolean resuelto;
  private String mensajeResuelto;
  private static int incidenciasPendientes;

  public Incidencia(int puesto, String problema) {
    this.puesto = puesto;
    this.problema = problema;
    codigo++;
    cod = codigo;
    incidenciasPendientes++;
    resuelto = false;
    mensajeResuelto = "";
  }

  public static int getCodigo() {
    return codigo;
  }

  public static void setCodigo(int codigo) {
    Incidencia.codigo = codigo;
  }

  public int getPuesto() {
    return puesto;
  }

  public void setPuesto(int puesto) {
    this.puesto = puesto;
  }

  public String getProblema() {
    return problema;
  }

  public void setProblema(String problema) {
    this.problema = problema;
  }

  public boolean isResuelto() {
    return resuelto;
  }

  public void setResuelto(boolean resuelto) {
    this.resuelto = resuelto;
  }

  public String getMensajeResuelto() {
    return mensajeResuelto;
  }

  public void setMensajeResuelto(String mensajeResuelto) {
    this.mensajeResuelto = mensajeResuelto;
  }

  public static int getIncidenciasPendientes() {
    return incidenciasPendientes;
  }

  public static void setIncidenciasPendientes(int incidenciasPendientes) {
    Incidencia.incidenciasPendientes = incidenciasPendientes;
  }

  public void resuelve(String mensaje) {
    resuelto = true;
    mensajeResuelto = mensaje;
    incidenciasPendientes--;
  }

  @Override
  public String toString() {
    return "Incidencia " + cod + " - Puesto: " + puesto + " - " + problema + " - "
        + (!resuelto ? "Pendiente" : "Resuelto - " + mensajeResuelto);
  }

}
