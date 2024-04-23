import java.util.Scanner;

public class Ejercicio130 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el monto a pagar:");
        double monto = entrada.nextDouble();

        System.out.println("¿En cuántos meses desea realizar el pago? (12 o 24)");
        int meses = entrada.nextInt();

        double totalPagar = calcularTotal(monto, meses);

        System.out.println("El total a pagar es: $" + totalPagar);
    }

    public static double calcularTotal(double monto, int meses) {
        double total = monto;
        for (int i = 1; i <= meses; i++) {
            double interes = total * 0.02;
            total += interes;
        }
        return total;
    }
}