import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su género (M/F):");
        String genero = scanner.nextLine();

        if (genero.equalsIgnoreCase("M")) {
            System.out.println("Bienvenido " + nombre + "!");
        } else if (genero.equalsIgnoreCase("F")) {
            System.out.println("Bienvenida " + nombre + "!");
        } else {
            System.out.println("Hola indeciso.");
        }
    }
}
