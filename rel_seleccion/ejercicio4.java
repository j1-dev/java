import java.util.Scanner;

public class ejercicio4 {

    /*
        Problema de Viaje

        Queremos viajar de Málaga a Madrid y vamos a realizar una aplicación que nos calcule el precio por el que nos saldrá el viaje.

        Tenemos varias opciones, coche, avión y tren.

        Los que viajamos podemos ser 2, 3 o 4 personas
        Si viajamos en coche debemos saber que el precio de la gasolina es de 1.75€ el litro, que madrid está a unos 550 kms y que 
        nuestro coche gasta de media 8 litros a los 100.
        Si viajamos en avión el precio del billete es de 95€ pero hay un suplemento de 20€ si llevamos equipaje (o todos llevan o ninguno)
        Si viajamos en tren el billete normal son 80€ pero si somos 4 personas podemos sacar tarifa reducida que nos quita un 25% del total 
        y si somos 3 nos quita un 10%.


        Salida:
        Vais a viajar X personas.
        Viajais en: tren
        Precio por persona: xxx€
        //Añade aquí desglose de su tipo de viaje

        Realiza este programa intentando reutilizar, es decir teniendo la mayor parte común del código que puedas.

        En caso de que algún dato sea erróneo - Debe mostrar como precio 0 y mostrar el error que se ha producido.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcionTransporte;
        int nPersonas;
        float precioPorPersona;
        final float PRECIOGAS = 1.75f;
        final int DISTMADRID = 550, LITROSPOR100KM = 8,
                  PRECIOBILLETEAVION = 95, PRECIOSUP = 20, 
                  PRECIOBILLETETREN = 80, TARIFA4 = 25, TARIFA3 = 10;

        System.out.println("Introduzca el número de personas que van a viajar (2, 3, 4)");
        nPersonas = sc.nextInt();
        sc.nextLine(); //Clear Buffer

        System.out.println("Introduzca el medio de transporte que van a usar (coche, avion, tren)");
        opcionTransporte = sc.nextLine().toLowerCase();

     

        if((nPersonas >= 2 && nPersonas <= 4)){
            switch (opcionTransporte){
                case "coche":
                    precioPorPersona = (DISTMADRID*LITROSPOR100KM/100)*PRECIOGAS/nPersonas;
                    break;
                case "avion":
                    Boolean llevanEquipaje;
                    System.out.println("Van a viajar en avion, necesitan equipaje? (true/false)");
                    llevanEquipaje = sc.nextBoolean();
                    precioPorPersona = (llevanEquipaje) ? PRECIOBILLETEAVION + PRECIOSUP : PRECIOBILLETEAVION;
                    break;
                case "tren":
                    precioPorPersona = PRECIOBILLETETREN;     
                    if(nPersonas == 3) {
                        precioPorPersona *= ((100-TARIFA3)/100.0f);
                    } else if (nPersonas == 4){
                        precioPorPersona *= ((100-TARIFA4)/100.0f);
                    }
                    break;
                default:
                    precioPorPersona = 0;
                    break;
            }
        } else {
            precioPorPersona = 0;
        }

        sc.close();

        System.out.println("El precio Por Persona es: " + precioPorPersona);
    }
}
