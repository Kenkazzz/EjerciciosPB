import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia en kilómetros:");
        float kilometros = scanner.nextFloat();

        float metros = kilometros * 1000;

        System.out.println("La distancia en metros es: " + metros);
    }
}
