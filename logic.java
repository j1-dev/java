public class logic 
{
    public static void main(String[] args) 
    {
        boolean operador1 = true;
        boolean operador2 = false;
    
        boolean resultado_and = operador1 && operador2;

        System.out.println("el resultado de " + operador1 +" AND " + operador2 + " es igual a " + resultado_and);

        boolean resultado_or = operador1 || operador2;

        System.out.println("el resultado de " + operador1 +" OR " + operador2 + " es igual a " + resultado_or);
    }    
}
