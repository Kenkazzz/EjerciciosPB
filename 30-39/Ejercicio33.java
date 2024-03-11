import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar los datos
        int cantidadEmpleados = 0;
        int cantidadHombres = 0;
        int cantidadMujeres = 0;
        float salarioTotal = 0;
        int cantidadSalarioMayor700 = 0;

        // Ingresar la cantidad de empleados
        System.out.println("Ingrese la cantidad de empleados: ");
        cantidadEmpleados = scanner.nextInt();

        // Leer los datos de cada empleado
        for (int i = 0; i < cantidadEmpleados; i++) {
            // Ingresar el sexo
            System.out.println("Ingrese el sexo del empleado " + (i + 1) + " (H/M): ");
            String sexo = scanner.next();

            // Ingresar el salario
            System.out.println("Ingrese el salario del empleado " + (i + 1) + ": ");
            float salario = scanner.nextFloat();

            // Acumular datos
            if (sexo.equalsIgnoreCase("H")) {
                cantidadHombres++;
            } else if (sexo.equalsIgnoreCase("M")) {
                cantidadMujeres++;
            }

            salarioTotal += salario;

            if (salario > 700) {
                cantidadSalarioMayor700++;
            }
        }

        // Calcular el promedio de salarios
        float promedioSalario = salarioTotal / cantidadEmpleados;

        // Calcular el porcentaje de mujeres
        float porcentajeMujeres = (float) cantidadMujeres / cantidadEmpleados * 100;

        // Calcular el porcentaje de varones
        float porcentajeVarones = (float) cantidadHombres / cantidadEmpleados * 100;

        // Mostrar los resultados
        System.out.println("a) Cantidad de personas que ganan más de 700 al mes: " + cantidadSalarioMayor700);
        System.out.println("b) Promedio de salarios: " + promedioSalario);
        System.out.println("c) Porcentaje de mujeres que trabajan en esa empresa: " + porcentajeMujeres + "%");
        System.out.println("d) Porcentaje de varones que trabajan en esa empresa: " + porcentajeVarones + "%");
    }
}
