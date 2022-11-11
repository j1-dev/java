import java.util.Scanner;

public class evaluacion_basica{
    public static void main(String[] args) 
    {
        //Declaración de constantes y variables
        
        final int   SUELDO_BASE = 950, ANIO_ANTIGUEDAD = 150,
                    BONIFICACION_HIJO = 10, BONIFICACION_TRES_HIJOS = 100,
                    HORAS_EXTRA_RESTANTE = 30;
        final float HORAS_EXTRA_RATIO = 21.4f, PORCENTAJE_FORMACION = 0.05f;

        Scanner sc = new Scanner(System.in);

        //Recolecta de datos

        System.out.println("Indique cuántos años lleva en la empresa: ");
        int numAnios = sc.nextInt();

        System.out.println("Indique cuántos hijos tiene: ");
        int numHijos = sc.nextInt();

        System.out.println("Indique las horas extras realizadas este mes");
        int horasExtra = sc.nextInt();
        int horasExtraRestante = 0;

        if(horasExtra > 20)
        {
            horasExtraRestante = horasExtra - 20;
            horasExtra = 20;
        }

        //Calculo de los resultados

        int sueldoBase = SUELDO_BASE + numAnios * ANIO_ANTIGUEDAD + numHijos * BONIFICACION_HIJO;

        if(numHijos >= 3)
            sueldoBase += BONIFICACION_TRES_HIJOS;
    
        float sueldoHorasExtra = (float)horasExtra * HORAS_EXTRA_RATIO + (float)horasExtraRestante * HORAS_EXTRA_RESTANTE;
        float sueldoTotal = (float)sueldoBase + sueldoHorasExtra;
        float descuentoFormacion = sueldoTotal * PORCENTAJE_FORMACION;
        sueldoTotal -= descuentoFormacion;

        //Se muestran los resultados

        System.out.printf("El empleado recibirá en su nómina mensual %.2f euros \n", sueldoTotal);
        System.out.printf("De los cuales: \n");
        System.out.printf("    +%d euros son del sueldo base + antigüedad + bonificación por hijo + bonificación por tener 3 o mas hijos \n", sueldoBase);
        System.out.printf("    +%.2f euros son de horas extras realizadas (%d horas realizadas)\n", sueldoHorasExtra, horasExtra);
        System.out.printf("    -%.2f euros para formación\n", descuentoFormacion);

        sc.close();
    }
}