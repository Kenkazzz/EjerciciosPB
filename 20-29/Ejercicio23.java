import java.util.*;

public class Ejercicio23 {

    private static final int NUM_DIGITOS = 3;
    private static final int MAX_VALOR = 9;
    private static final int MIN_VALOR = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar los dígitos aleatorios
        int[] digitos = new int[NUM_DIGITOS];
        for (int i = 0; i < NUM_DIGITOS; i++) {
            digitos[i] = random.nextInt(MAX_VALOR - MIN_VALOR + 1) + MIN_VALOR;
        }

        // Mostrar mensaje inicial
        System.out.println("**¡Bienvenido al juego Rojo-amarillo-verde!**");
        System.out.println("Intenta adivinar los tres dígitos y sus posiciones correctas.");
        System.out.println("Para cada intento, ingresa tres dígitos separados por espacios.");
        System.out.println("La pista te indicará qué tan cerca estás de la solución:");
        System.out.println("    * Rojo: el dígito no está en la combinación.");
        System.out.println("    * Amarillo: el dígito está en la combinación pero en una posición incorrecta.");
        System.out.println("    * Verde: el dígito está en la posición correcta.");

        // Bucle principal del juego
        int intentos = 0;
        boolean adivinado = false;
        while (!adivinado) {
            intentos++;

            // Pedir al usuario que ingrese su intento
            System.out.println("Intento " + intentos + ": ");
            String[] intentoStr = scanner.nextLine().split(" ");
            int[] intento = new int[NUM_DIGITOS];
            for (int i = 0; i < NUM_DIGITOS; i++) {
                intento[i] = Integer.parseInt(intentoStr[i]);
            }

            // Generar la pista
            String pista = "";
            for (int i = 0; i < NUM_DIGITOS; i++) {
                if (intento[i] == digitos[i]) {
                    pista += "Verde ";
                } else if (contiene(digitos, intento[i])) {
                    pista += "Amarillo ";
                } else {
                    pista += "Rojo ";
                }
            }

            // Mostrar la pista
            System.out.println("Pista: " + pista);

            // Comprobar si el usuario ha adivinado la combinación
            adivinado = true;
            for (int i = 0; i < NUM_DIGITOS; i++) {
                if (intento[i] != digitos[i]) {
                    adivinado = false;
                    break;
                }
            }
        }

        // Mostrar mensaje final
        if (adivinado) {
            System.out.println("¡Felicidades! Has adivinado la combinación en " + intentos + " intentos.");
        } else {
            System.out.println("Lo siento, no has podido adivinar la combinación en 10 intentos.");
            System.out.println("La combinación era: " + Arrays.toString(digitos));
        }
    }

    private static boolean contiene(int[] array, int valor) {
        for (int i : array) {
            if (i == valor) {
                return true;
            }
        }
        return false;
    }
}
