import java.util.Scanner;

public class Ejercicio196 {
    public static void main(String[] args) {
        double[][] ingresos = new double[18][10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 18; i++) {
            System.out.println("Ingrese los ingresos del vendedor " + (i + 1) + " para cada producto:");
            for (int j = 0; j < 10; j++) {
                System.out.print("Producto " + (j + 1) + ": ");
                ingresos[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < 18; i++) {
            double total = 0;
            for (int j = 0; j < 10; j++) {
                total += ingresos[i][j];
            }
            System.out.println("Total de ingresos del vendedor " + (i + 1) + ": $" + total);
        }

        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 18; j++) {
                total += ingresos[j][i];
            }
            double promedio = total / 18;
            System.out.println("Promedio del producto " + (i + 1) + ": $" + promedio);
        }

        for (int i = 0; i < 18; i++) {
            double total = 0;
            for (int j = 0; j < 10; j++) {
                total += ingresos[i][j];
            }
            double promedio = total / 10;
            System.out.println("Promedio de ingresos del vendedor " + (i + 1) + ": $" + promedio);
        }

        double ingresosTotales = 0;
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 10; j++) {
                ingresosTotales += ingresos[i][j];
            }
        }
        System.out.println("Ingresos totales de la empresa: $" + ingresosTotales);

        entrada.close();
    }
}