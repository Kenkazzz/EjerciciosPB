import java.util.Scanner;

public class Ejercicio38 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir la edad al usuario
    System.out.println("Introduce tu edad: ");
    int edad = scanner.nextInt();

    // Calcular la cantidad de fruta consumida
    int gramosFruta = edad * 8;

    // Calcular la cantidad de manzanas consumidas
    int manzanas = gramosFruta / 4;

    // Mostrar los resultados
    System.out.println("Has consumido " + gramosFruta + " gramos de fruta.");
    System.out.println("Has consumido " + manzanas + " manzanas.");
  }
}
