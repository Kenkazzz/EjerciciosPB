import java.util.Scanner;

public class Ejercicio203 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int edad = entrada.nextInt();

        double pulsaciones = (220.0 - edad) / 10.0;

        System.out.println("El número de pulsaciones por cada 10 segundos es: " + pulsaciones);

        entrada.close();
    }
}