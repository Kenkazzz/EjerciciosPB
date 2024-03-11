import java.util.Scanner;

public class Ejercicio39 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir el nombre al usuario
    System.out.println("Introduce tu nombre: ");
    String nombre = scanner.nextLine();

    // Pedir el año de nacimiento al usuario
    System.out.println("Introduce tu año de nacimiento: ");
    int añoNacimiento = scanner.nextInt();

    // Pedir el año actual al usuario
    System.out.println("Introduce el año actual: ");
    int añoActual = scanner.nextInt();

    // Calcular la edad de la persona
    int edad = añoActual - añoNacimiento;

    // Calcular el porcentaje de vida dormido
    double porcentajeDormido = 0.34;

    // Calcular los días dormidos
    double diasDormidos = edad * 365.25 * porcentajeDormido;

    // Mostrar los resultados
    System.out.println(nombre + ", has dormido " + diasDormidos + " días.");
  }
}
