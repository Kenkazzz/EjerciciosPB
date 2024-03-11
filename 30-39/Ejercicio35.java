import java.util.Scanner;

public class Ejercicio35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar las horas trabajadas
        System.out.println("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        // Ingresar la tarifa de pago por hora
        System.out.println("Ingrese la tarifa de pago por hora: ");
        float tarifaHora = scanner.nextFloat();

        // Calcular el salario normal
        float salarioNormal = horasTrabajadas * tarifaHora;

        // Calcular el pago por horas extras
        float pagoHorasExtras = 0;
        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            pagoHorasExtras = horasExtras * tarifaHora * 1.5f;
        }

        // Calcular el salario total
        float salarioTotal = salarioNormal + pagoHorasExtras;

        // Mostrar los resultados
        System.out.println("Salario normal: $" + salarioNormal);
        System.out.println("Pago por horas extras: $" + pagoHorasExtras);
        System.out.println("Salario total: $" + salarioTotal);
    }
}
