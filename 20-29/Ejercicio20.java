import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar las notas
        double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        // Calcular la suma
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        // Calcular el promedio
        double promedio = suma / notas.length;

        // Mostrar resultados
        System.out.println("Suma de las notas: " + suma);
        System.out.println("Promedio de las notas: " + promedio);

        // Mostrar el doble de cada nota
        for (int i = 0; i < notas.length; i++) {
            System.out.println("El doble de la nota " + (i + 1) + " es: " + (notas[i] * 2));
        }
    }
}
