public class ManejoCadenas {

    public static void main(String[] args) {
        String cadena = "En un lugar de un la mancha.";

        //CharAt
        int posicion = 3;
        char caracte3 = cadena.charAt(posicion);
        System.out.println("Caracter en 3= " + caracte3);

        //Comparacion
        String cadena1 = "Hola";
        String cadena2 = "hola";

        System.out.println((cadena1 == cadena2)? "IGUALES" : "DISTINTAS");
        System.out.println((cadena1.compareTo(cadena2) == 0)? "IGUALES": "DISTINTAS");
        //System.out.println(cadena1.compareTo(cadena2));
        System.out.println("Comparacion ignorando mayusculas= "+ ((cadena1.compareToIgnoreCase(cadena2)) == 0 ? "Iguales" : "Distintas") );

        cadena1 = "Alfonso";
        cadena2 = "Pepe";

        //System.out.println(cadena1.compareTo(cadena2)); //-15
        //System.out.println(cadena2.compareTo(cadena1)); //15
        System.out.println(cadena1 + ":" + (cadena1.compareTo(cadena2) > 0 
                        ? "Va después" : "Va antes") + " de " + cadena2 );

        //Longitud de una cadena
        int longitudCadena = cadena.length();
        System.out.println("La cadena tiene longitud: " + longitudCadena);
        System.out.println("Primer caracter de la cadena: " + cadena.charAt(0));
        System.out.println("Ultimo caracter de la cadena: " + cadena.charAt(longitudCadena -1));

        //Buscar caracter
        int posicionD = cadena.indexOf('d');
        System.out.println("La posicion= " + posicionD + " es el caracter: " + cadena.charAt(posicionD));

        //Buscar por String; Si -1 entonces no está
        int posicionsubCadena = cadena.indexOf("malcha");
        System.out.println("La subcadena empieza en: " + posicionsubCadena);

        //Buscar a partir de una posición y un caracter
        int posicionNSeguinda = cadena.indexOf('n', 5);
        System.out.println("La letra n que se encuentra despues de la posicion 5 está en la posición: "+ posicionNSeguinda);

        //Buscar a partir de una posición y un String
        int posicionCadenaMancha = cadena.indexOf("mancha", 21);
        System.out.println("La cadena mancha que se encuentra despues de la posicion 21 está en la posición: "+ posicionCadenaMancha);

        String cadenaMayusculas = cadena.toUpperCase();
        System.out.println(cadenaMayusculas);

        String cadenaMinuscula = cadena.toLowerCase();
        System.out.println(cadenaMinuscula);

        //Reemplazar
        System.out.println(cadena.replace('n', 'f'));
        System.out.println(cadena.replaceAll("mancha", "mijas"));
        System.out.println(cadena.replaceFirst("un", "otro"));

        //Quitar espacios en blanco al principio y final
        String contestacion = "    hola adios   ";
        System.out.println("Contestación: " + contestacion + " Final");
        System.out.println("Contestación: " + contestacion.trim() + " Final");

        //Cortar
        String[] trozos =cadena.split("de");
        
        int numeroDeTrozos = trozos.length;
        System.out.println("Lo he partido en: " + numeroDeTrozos + " trozos");
        
        String trozo1 = trozos[0];
        String trozo2 = trozos[1];
        
        System.out.println("El trozo 1 es: "+ trozo1);
        System.out.println("El trozo 2 es: "+ trozo2);

        //Cortar cadena
        String subStringDesde5 = cadena.substring(5);
        System.out.println("SubString desde 5: "+ subStringDesde5);

        String subStringDesde5Hasta10 = cadena.substring(5, 10);
        System.out.println("SubString desde 5 hasta 10: "+ subStringDesde5Hasta10);

        //Concatenar +
        String saludo = "Hola";
        String nombre = "Pepe";
        String saludoCompleto = saludo + nombre;
        String saludoCompleto2 = saludo.concat(nombre);
        System.out.println("Saludo1=" + saludoCompleto + "-Saludo2=" +  saludoCompleto2);

        float decimal = 34.5467f;
        String decimalString = String.valueOf(decimal);
        System.out.println(decimalString);

        //StringBuffer -> Modifciar y ampliar un string
        StringBuffer sbuffer = new StringBuffer(cadena);
        //Modifica caracter en una posición
        sbuffer.setCharAt(1, 'M');
        System.out.println(sbuffer);

        sbuffer.insert(10, "DON QUIJOTE DE LA MANCHA");
        System.out.println(sbuffer);

        sbuffer.append("-FINAL");
        System.out.println(sbuffer);

        System.out.println("Es un digito 'd'"+ Character.isDigit('d'));
        System.out.println("Es un digito '4'"+ Character.isDigit('4'));


        int posicion2 =5;
        //Si la posicion es de un espacio -> muestra "La posicion n  es un ESPACIO
        //SINO ->muestra el caracter
        boolean esEspacio = Character.isSpaceChar(' ');


    }
    
}
