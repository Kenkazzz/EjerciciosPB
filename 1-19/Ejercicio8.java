import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dividendo:");
        int dividendo = scanner.nextInt();

        System.out.println("Ingrese el divisor:");
        int divisor = scanner.nextInt();

        int resto = dividendo % divisor;

        System.out.println("El resto de la división es: " + resto);
    }
}
