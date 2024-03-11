import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número real: ");
        float numeroReal = scanner.nextFloat();

        float cubo = calcularCubo(numeroReal);

        System.out.println("El cubo de " + numeroReal + " es: " + cubo);
    }

    public static float calcularCubo(float numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser positivo");
        }

        // Calcular el cubo
        float resultado = 1;
        for (int i = 0; i < 3; i++) {
            resultado *= numero;
        }

        return resultado;
    }
}
