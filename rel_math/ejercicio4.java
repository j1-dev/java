public class ejercicio4 
{
    public static void main(String[] args) 
    {
        double num1 = Math.random()*99+1;
        double num2 = Math.random()*99+1;
        double num3 = Math.random()*99+1;

        System.out.println("Round (redondeo matemático): " + num1 + "  -->  " + Math.round(num1));
        System.out.println("Floor (redondeo hacia abajo): " + num2 + "  -->  " + Math.floor(num2));
        System.out.println("Ceil (redondeo hacia arriba): " + num3 + "  -->  " + Math.ceil(num3));
    }
}
