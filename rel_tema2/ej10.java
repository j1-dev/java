import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        int dia;
        String mes, horoscopo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el día de su cumpleaños");
        dia = sc.nextInt();

        System.out.println("Introduzca el més de su compleaños");
        mes = sc.nextLine().toLowerCase();
        sc.close();

        if(((dia >= 21 && dia <= 31) && mes == "marzo")||((dia >= 0 && dia <= 20) && mes == "abril")){
            horoscopo = "Aries";
        } else if(((dia >= 21 && dia <= 31) && mes == "abril")||((dia >= 0 && dia <= 21) && mes == "mayo")){
            horoscopo = "Tauro";
        } else if(((dia >= 22 && dia <= 31) && mes == "mayo")||((dia >= 0 && dia <= 21) && mes == "junio")){
            horoscopo = "Geminis";
        } else if(((dia >= 22 && dia <= 31) && mes == "junio")||((dia >= 0 && dia <= 22) && mes == "julio")){
            horoscopo = "Cancer";
        } else if(((dia >= 23 && dia <= 31) && mes == "julio")||((dia >= 0 && dia <= 23) && mes == "agosto")){
            horoscopo = "Leo";
        } else if(((dia >= 24 && dia <= 31) && mes == "agosto")||((dia >= 0 && dia <= 23) && mes == "septiembre")){
            horoscopo = "Virgo";
        } else if(((dia >= 24 && dia <= 31) && mes == "septiembre")||((dia >= 0 && dia <= 23) && mes == "octube")){
            horoscopo = "Libra";
        } else if(((dia >= 24 && dia <= 31) && mes == "octube")||((dia >= 0 && dia <= 22) && mes == "noviembre")){
            horoscopo = "Escorpion";
        } else if(((dia >= 23 && dia <= 31) && mes == "noviembre")||((dia >= 0 && dia <= 21) && mes == "diciembre")){
            horoscopo = "Cancer";
        } else if(((dia >= 22 && dia <= 31) && mes == "junio")||((dia >= 0 && dia <= 22) && mes == "julio")){
            horoscopo = "Cancer";
        }


    }
}
