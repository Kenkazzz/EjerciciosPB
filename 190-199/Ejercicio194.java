import java.util.Scanner;

public class Ejercicio194 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] numeros = new int[10];

            System.out.println("Ingrese 10 números:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = entrada.nextInt();
            }
            System.out.println("Numeros sin ordenar:");
            printArray(numeros);
            bubbleSort(numeros);

            System.out.println("Numeros ordenados ascendentemente:");
            printArray(numeros);
            entrada.close();
        }
    }
    private static void bubbleSort(int[] numeros) {
        for (int i = numeros.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    swap(numeros, j, j + 1);
                }
            }
        }
    }
    private static void swap(int[] numeros, int i, int j) {
        int temporal = numeros[i];
        numeros[i] = numeros[j];
        numeros[j] = temporal;
    }
    private static void printArray(int[] numeros) {
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

}