public class App {
  public static void main(String[] args) throws Exception {
    Gato gHembra = new Gato("Cleo", "Pardo", "Hembra");
    Gato g1Macho = new Gato("Pepe", "raza desconocida", "Macho");
    Gato g2Macho = new Gato("Pedro", "Romano", "Macho");

    try {
      Gato newGato1 = g1Macho.apareaCon(gHembra);
      Gato newGato2 = gHembra.apareaCon(g1Macho);
      System.out.println(newGato1.toString());
      System.out.println(newGato2.toString());
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
