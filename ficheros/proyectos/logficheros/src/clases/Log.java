package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
  public enum TipoMensaje {
    ERROR, INFORMACION
  }

  public static void NuevaEntradaALog(String mensaje, TipoMensaje tipo) throws Exception {
    String rutaAFicheroLog = "src/log.txt";
    FileWriter fw = null;
    BufferedWriter bw = null;
    try {
      fw = new FileWriter(rutaAFicheroLog, true);
      bw = new BufferedWriter(fw);

      bw.write("[" + tipo.toString() + "] -> {mensaje: " + mensaje + ", fecha: "
          + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE) + "}");
      bw.newLine();
    } catch (IOException e) {
      System.out.println(e.toString());
    } catch (Exception e) {
      System.out.println(e.toString());
    } finally {
      fw.close();
      bw.close();
    }

  }

  // @Override
  // public String toString() {
  // return "[" + tipo.toString() + "] -> {mensaje: " + mensaje + ", fecha: "
  // + fecha.format(DateTimeFormatter.ISO_LOCAL_DATE) + "}";
  // }

}
