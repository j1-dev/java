import java.util.Scanner;

public class ejercicio2 {

    /*
        En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales. 
        El número de animales que alimentar es numAnimales y sabemos que cada animal como una media de kilosPorAnimal

        Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal. 
        En caso negativo, ha de calcular cual es la ración que corresponde a cada uno de los animales y cuanto tendríamos que comprar para 
        llegar a la ración diaria indicada
        Nota: Evitar la división por 0.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float comidaDiaria, kilosPorAnimal;
        int numAnimales;

        System.out.println("Introduzca la cantidad de comida que se ha comprado hoy");
        comidaDiaria = sc.nextFloat();

        System.out.println("Introduzca cuantos animales hay");
        numAnimales = sc.nextInt();

        System.out.println("Introduzca el número de kilos de comida por animal");
        kilosPorAnimal = sc.nextFloat();

        sc.close();

        if((comidaDiaria - numAnimales*kilosPorAnimal) >= 0){
            System.out.println("Hay suficiente comida para todos los animales");
        } else if (numAnimales != 0){
            float racionInsuficiente = (float)(comidaDiaria/numAnimales);
            System.out.println("No hay comida suficiente para cada animal");
            System.out.println("A cada animal le corresponde "+ racionInsuficiente + 
                               " kilos (faltan " + (kilosPorAnimal-racionInsuficiente) + 
                               " kilos para llegar a la ración correcta)");
        } else {
            System.out.println("Debe haber más de un animal");
        }
    }
}
