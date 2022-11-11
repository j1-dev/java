import java.util.Scanner;

public class ej29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta1, respuesta2 = "", respuesta3;
        float total = 0f;

        System.out.println("Qué ha tomado de comer? (palmera, donut o pitufo): ");
        respuesta1 = sc.nextLine().toLowerCase();

        if(respuesta1 == "pitufo"){
            System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla):");
            respuesta2 = sc.nextLine().toLowerCase();
        }

        System.out.println("¿Qué ha tomado de beber? (zumo o café): ");
        respuesta3 = sc.nextLine().toLowerCase();

        if(respuesta1 == "palmera"){
            total += 1.4f;
        } else if (respuesta1 == "donut"){
            total += 1f;
            System.out.println("a");
        } else if (respuesta1 == "pitufo" && respuesta2 == "aceite"){
            total += 1.2f;
        } else if (respuesta1 == "pitufo" && respuesta2 == "tortilla"){
            total += 1.6f;
        } else if (respuesta3 == "zumo"){
            total += 1.5f;
        } else if (respuesta3 == "cafe"){
            total += 1.2f;
        }

        System.out.println("Total desayuno: " + total);
    }
}
