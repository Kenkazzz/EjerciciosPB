import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los tres números
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();

        // Obtener últimos dígitos
        int ultimoDigito1 = num1 % 10;
        int ultimoDigito2 = num2 % 10;
        int ultimoDigito3 = num3 % 10;

        System.out.println("El último dígito del primer número es: " + ultimoDigito1);
        System.out.println("El último dígito del segundo número es: " + ultimoDigito2);
        System.out.println("El último dígito del tercer número es: " + ultimoDigito3);
    }
}
