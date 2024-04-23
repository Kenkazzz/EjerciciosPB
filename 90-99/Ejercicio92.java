import java.util.Scanner;

public class Ejercicio92 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de los vectores:");
        int n = entrada.nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < n; i++) {
            vector1[i] = entrada.nextInt();
        }

        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < n; i++) {
            vector2[i] = entrada.nextInt();
        }

        int productoEscalar = calcularProductoEscalar(vector1, vector2);
        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

    }

    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
}