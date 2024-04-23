import java.util.Scanner;

public class Ejercicio120 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Hola usuario!");
            System.out.print("¿Desea que siga imprimiendo el texto? [S/N]: ");
            respuesta = entrada.nextLine();

            if (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N")) {
                System.out.println("Respuesta inválida. Por favor ingrese S o N.");
            }

        } while (!respuesta.equalsIgnoreCase("N"));

        System.out.println("Programa finalizado");
    }
}