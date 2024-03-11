import java.util.Scanner;

public class Ejercicio43 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir los dos números al usuario
    System.out.println("Introduce el primer número: ");
    int num1 = scanner.nextInt();

    System.out.println("Introduce el segundo número: ");
    int num2 = scanner.nextInt();

    // Comparar los dos números
    if (num1 < num2) {
      System.out.println("El número menor es: " + num1);
    } else if (num2 < num1) {
      System.out.println("El número menor es: " + num2);
    } else {
      System.out.println("Los dos números son iguales.");
    }
  }
}
