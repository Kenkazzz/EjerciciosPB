import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar la edad
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        // Determinar si es mayor o menor de edad
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }
}
