import java.util.Scanner;

public class factura 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        final int IVA = 21;

        System.out.println("Introduzca el precio base de la factura: ");
        float precioBase = sc.nextFloat();
        float precioFinal = precioBase + ((precioBase/100)*IVA);

        //System.out.println("El precio final de la factura es: " + precioFinal + "€");
        System.out.printf("El precio final de la factura es: %.2f€ con un iva del %d  \n", precioFinal, IVA);
        sc.close();
    }    
}
