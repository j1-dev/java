import java.util.Scanner;

public class ejercicio3 
{
    public static void main(String[] args) 
    {
        final String TEXTO = "Muchos años después, frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de recordar aquella tarde remota en que su padre lo llevó a conocer el hielo. (Cien años de soledad. G. García Márquez).";
        Scanner sc = new Scanner(System.in);

        //Mostrar información del libro
        int info = TEXTO.indexOf("(");
        System.out.println("Información del libro: " + TEXTO.substring(info));

        //Busca un número random entre 0 y el número total de caracteres y muestralo por pantalla. El caracter en la posicion X es:
        int totalCaracteres = TEXTO.length();
        int indiceCaracterRandom = (int)(Math.random()*totalCaracteres)+1;
        System.out.println("El caracter en la posición " + indiceCaracterRandom + " es: " + TEXTO.charAt(indiceCaracterRandom));

        //Trocea el texto en palabras y devuelve la palabra que esté en la posición que indique un número aleatorio entre 0 y el 
        //número de palabras. La palabra en la posición x es: XXXX
        String[] palabras = TEXTO.split(" ");
        int numPalabras = palabras.length;
        int indicePalabraRandom = (int)(Math.random()*numPalabras)+1;
        System.out.println("La palabras en la posición " + indicePalabraRandom + " es: " + palabras[indicePalabraRandom]);

        //Preguntar ¿Como se llamaba el coronel? y si responde su nombre o su apellido o ambos, sin tener en cuenta las 
        //mayúsculas/minúsculas) indicar que se ha acertado la pregunta.
        System.out.println("¿Cómo se llamaba el coronel?");
        String respuesta = sc.nextLine();
        int indiceRespuesta = TEXTO.toLowerCase().indexOf(respuesta.toLowerCase());

        if(indiceRespuesta != -1 && respuesta.length() >= 7) //la longitud minima de la respuesta correcta ("Buendia") es 7 
            System.out.println("Respuesta correcta :D");
        else
            System.out.println("respuesta incorrecta :C");

        sc.close();
    }
}
