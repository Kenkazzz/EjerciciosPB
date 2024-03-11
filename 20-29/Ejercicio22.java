import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número real:");
        double num = scanner.nextDouble();

        int parteEntera = (int) num;

        double parteDecimal = num - parteEntera;

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
    }
}
