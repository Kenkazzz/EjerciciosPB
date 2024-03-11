import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su sueldo básico:");
        double sueldoBasico = scanner.nextDouble();

        System.out.println("Ingrese el monto por horas extras:");
        double horasExtras = scanner.nextDouble();

        double totalGanado = sueldoBasico + horasExtras;

        double descuento = totalGanado * 0.2;

        System.out.println("Sueldo básico: $" + sueldoBasico);
        System.out.println("Total ganado: $" + totalGanado);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + (totalGanado - descuento));
    }
}
