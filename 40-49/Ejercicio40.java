import java.util.Scanner;

public class Ejercicio40 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir los kilos de oro al usuario
    System.out.println("Introduce los kilos de oro: ");
    double kilosOro = scanner.nextDouble();

    // Pedir el precio por onza de oro al usuario
    System.out.println("Introduce el precio por onza de oro: ");
    double precioOnzaOro = scanner.nextDouble();

    // Convertir kilos a gramos
    double gramosOro = kilosOro * 1000;

    // Convertir gramos a onzas
    double onzasOro = gramosOro / 28.3495;

    // Calcular el precio total del oro
    double precioTotal = onzasOro * precioOnzaOro;

    // Mostrar los resultados
    System.out.println("El precio total del oro es: $" + precioTotal);
  }
}
