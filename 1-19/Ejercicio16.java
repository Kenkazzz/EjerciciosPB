import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nota en el examen de matemática:");
        double nota = scanner.nextDouble();

        if (nota >= 60) {
            System.out.println("¡Felicidades! Usted ganó el examen de matemática");
        } else {
            System.out.println("Lo siento, no aprobó el examen de matemática");
        }
    }
}
