import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar la hora de entrada
        System.out.println("Ingrese la hora de entrada (HH:MM): ");
        String horaEntrada = scanner.nextLine();

        // Ingresar la hora de salida
        System.out.println("Ingrese la hora de salida (HH:MM): ");
        String horaSalida = scanner.nextLine();

        // Calcular el costo de estacionamiento
        int costoEstacionamiento = calcularCostoEstacionamiento(horaEntrada, horaSalida);

        // Mostrar el costo
        System.out.println("El costo del estacionamiento es: $" + costoEstacionamiento);
    }

    private static int calcularCostoEstacionamiento(String horaEntrada, String horaSalida) {
        // Convertir las horas a minutos
        int minutosEntrada = (Integer.parseInt(horaEntrada.substring(0, 2)) * 60) + Integer.parseInt(horaEntrada.substring(3));
        int minutosSalida = (Integer.parseInt(horaSalida.substring(0, 2)) * 60) + Integer.parseInt(horaSalida.substring(3));

        // Calcular la diferencia de minutos
        int diferenciaMinutos = minutosSalida - minutosEntrada;

        // Si la diferencia de minutos es menor o igual a 60, el costo es de $15
        if (diferenciaMinutos <= 60) {
            return 15;
        }

        // Si la diferencia de minutos es mayor a 60
        else {
            // Calcular el número de horas completas
            int numeroHoras = diferenciaMinutos / 60;

            // Si el resto de la división es mayor a 0, se cobra una hora adicional
            int costo = numeroHoras * 15;
            if (diferenciaMinutos % 60 > 0) {
                costo += 15;
            }

            return costo;
        }
    }
}
