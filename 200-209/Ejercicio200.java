import java.util.Scanner;

public class Ejercicio200 {
    public static void main(String[] abc) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su capital de inversión: ");
        double capital = entrada.nextDouble();

        System.out.print("Ingrese la tasa de interés mensual (en porcentaje): ");
        double tasaInteres = entrada.nextDouble();

        double interesGanadoMensual = capital * (tasaInteres / 100);
        double interesTotalGanado2Meses = interesGanadoMensual * 2;
        double montoTotalDespues2Meses = capital + interesTotalGanado2Meses;

        System.out.printf("Después de 2 meses habrá ganado un total de: $%.2f\n", interesTotalGanado2Meses);
        System.out.printf("Su capital total después de esos 2 meses será de: $%.2f\n", montoTotalDespues2Meses);
        entrada.close();
    }

}