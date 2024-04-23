import java.util.Scanner;

public class Ejercicio214 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad invertida por la primera persona:");
        double inversion1 = entrada.nextDouble();

        System.out.println("Ingrese la cantidad invertida por la segunda persona:");
        double inversion2 = entrada.nextDouble();

        System.out.println("Ingrese la cantidad invertida por la tercera persona:");
        double inversion3 = entrada.nextDouble();

        double totalInvertido = inversion1 + inversion2 + inversion3;

        double porcentaje1 = (inversion1 / totalInvertido) * 100;
        double porcentaje2 = (inversion2 / totalInvertido) * 100;
        double porcentaje3 = (inversion3 / totalInvertido) * 100;

        System.out.println("Porcentaje de inversión de la primera persona: " + porcentaje1 + "%");
        System.out.println("Porcentaje de inversión de la segunda persona: " + porcentaje2 + "%");
        System.out.println("Porcentaje de inversión de la tercera persona: " + porcentaje3 + "%");

        entrada.close();
    }
}