import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de grados centígrados:");
        double centigrados = scanner.nextDouble();

        double fahrenheit = (centigrados * 9 / 5) + 32;

        System.out.println("La cantidad en grados Fahrenheit es: " + fahrenheit);
    }
}
