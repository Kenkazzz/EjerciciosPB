import java.util.Scanner;

public class Ejercicio42 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir el voltaje del sistema de iluminación al usuario
    System.out.println("Introduce el voltaje del sistema de iluminación (en kilovoltios): ");
    double voltajeSistema = scanner.nextDouble();

    // Convertir el voltaje a voltios
    double voltajeSistemaVoltios = voltajeSistema * 1000;

    // Calcular el número de naranjas necesarias
    double naranjasNecesarias = voltajeSistemaVoltios / 0.05;

    // Calcular el peso total de las naranjas
    double pesoTotalNaranjas = naranjasNecesarias * 6;

    // Convertir el peso total a toneladas
    double toneladas = pesoTotalNaranjas / 1000000;

    // Mostrar los resultados
    System.out.println("Se necesitan " + naranjasNecesarias + " naranjas para iluminar el sistema.");
    System.out.println("Se necesitan " + toneladas + " toneladas de naranjas para iluminar el sistema.");
  }
}
