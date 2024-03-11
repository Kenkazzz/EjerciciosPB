import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el número
        System.out.println("Ingrese un número de cuatro dígitos:");
        int num = scanner.nextInt();

        // Obtener los dígitos
        int digito1 = num / 1000;
        int digito2 = (num % 1000) / 100;
        int digito3 = (num % 100) / 10;
        int digito4 = num % 10;

        int sumaDigitos = digito1 + digito2 + digito3 + digito4;

        System.out.println("La suma de los dígitos del número es: " + sumaDigitos);
    }
}
