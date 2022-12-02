import java.util.Scanner;

public class Ejercicio3_JuanGarcía {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char opcion;
    String frase = "";

    do {
      System.out.println("Elija una de las siguientes opciones: ");
      System.out.println("Opción a - Introducir una cadena de caracteres");
      System.out.println("Opción b - Mostrar la cadena actual");
      System.out.println(
          "Opción c - Pregunta por una cadena de caracteres y devuelve el número de apariciones de dicha cadena en la cadena principal y las posiciones que ocupa en la cadena principal.");
      System.out.println(
          "Opción d - Recorrer cada una de la palabras de la cadena principal en orden inverso y devolver por cada palabra:");
      System.out.println("Opción e - Invertir las palabras de la cadena principal");
      System.out.println("Opción f - Salir");
      opcion = sc.nextLine().toLowerCase().charAt(0);

      switch (opcion) {
        case 'a':
          System.out.println("Introduzca la frase");
          frase = sc.nextLine();
          break;
        case 'b':
          if (frase == "") {
            System.out.println("La frase está vacía");
          } else {
            System.out.println("La frase es: " + frase);
          }
          break;
        case 'c':
          int indice = 0; // indice por donde empieza buscar el método indexOf()
          int aparece = 0; // número total de apariciones de la subCadena
          String apariciones = ""; // String utilizado para mostrar en qué posiciones está la subCadena
          System.out.println("Indique la subcadena que quiere buscar");
          String subCadena = sc.nextLine();
          while (indice != -1) { // cuando indexOf() devuelva -1 significará que ya no ha encontrado más
                                 // subcadenas
            indice = frase.indexOf(subCadena, indice);
            if (indice != -1) {
              aparece++; // suma uno al total de apariciones
              indice++; // sumo uno al índice para que no se quede en un bucle infinito
              apariciones += "Aparece en la posición: " + indice + "\n";
            }
          }
          System.out.println("La cadena: " + subCadena + " aparece: " + aparece + " veces");
          System.out.println(apariciones);
          break;
        case 'd':
          String[] palabras = frase.split(" ");
          for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.println(i + "- " + palabras[i] + "(" + palabras[i].length() + " letras)");
          }
          break;
        case 'e':
          String[] palabras2 = frase.split(" ");
          System.out.print("La frase invertida es: ");
          for (int i = palabras2.length - 1; i >= 0; i--) {
            System.out.print(palabras2[i] + " ");
          }
          System.out.println();
          break;
        case 'f':
          System.out.println("Va a salir del programa");
          break;
        default:
          System.out.println("Opción incorrecta");
          break;
      }
      System.out.println("ENTER para la siguiente opción");
      sc.nextLine();

    } while (opcion != 'f');
    sc.close();
  }
}
