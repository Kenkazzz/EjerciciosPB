import java.util.Scanner;

public class Ejercicio41 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir la edad al usuario
    System.out.println("Introduce tu edad: ");
    int edad = scanner.nextInt();

    // Calcular el crecimiento total del cabello
    double crecimientoTotal = edad * 12 * 0.5;

    // Convertir el crecimiento total a metros
    double metros = crecimientoTotal / 100;

    // Mostrar los resultados
    System.out.println("Tu cabellera mide " + metros + " metros.");
  }
}
