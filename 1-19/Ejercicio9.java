import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad:");
        double cantidad = scanner.nextDouble();

        double iva = cantidad * 0.19;

        System.out.println("El IVA sobre la cantidad es: " + iva);
    }
}
