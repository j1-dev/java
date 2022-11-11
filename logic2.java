public class logic2 
{
    public static void main(String[] args) 
    {
        boolean varVerdadera = true, varFalsa = false;

        System.out.println("TABLA DE VERDAD AND");
        System.out.println(varVerdadera + " AND " + varVerdadera + " = " + (varVerdadera && varVerdadera));
        System.out.println(varVerdadera + " AND " + varFalsa + " = " + (varVerdadera && varFalsa));
        System.out.println(varFalsa + " AND " + varVerdadera + " = " + (varFalsa && varVerdadera));
        System.out.println(varFalsa + " AND " + varFalsa + " = " + (varFalsa && varFalsa));

        System.out.println("");

        System.out.println("TABLA DE VERDAD OR");
        System.out.println(varVerdadera + " OR " + varVerdadera + " = " + (varVerdadera || varVerdadera));
        System.out.println(varVerdadera + " OR " + varFalsa + " = " + (varVerdadera || varFalsa));
        System.out.println(varFalsa + " OR " + varVerdadera + " = " + (varFalsa || varVerdadera));
        System.out.println(varFalsa + " OR " + varFalsa + " = " + (varFalsa || varFalsa));
    }    
}
