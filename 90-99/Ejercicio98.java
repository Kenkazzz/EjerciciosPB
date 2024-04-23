import java.util.Scanner;

public class Ejercicio98 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese el primer número: ");
    double num1 = entrada.nextDouble();

    System.out.print("Ingrese el segundo número: ");
    double num2 = entrada.nextDouble();

    double suma = num1 + num2;
    double resta = num1 - num2;

    if (suma % resta == 0) {
        System.out.println("La division es exacta.");
    } else {
        System.out.println("La division no es exacta.");
    }
}
}