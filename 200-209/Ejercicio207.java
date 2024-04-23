import java.util.Scanner;

public class Ejercicio207 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer valor real:");
        double valor1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo valor real:");
        double valor2 = entrada.nextDouble();
    
        double suma = valor1 + valor2;
        double resta = valor1 - valor2;
        double division = valor1 / valor2;
        double multiplicacion = valor1 * valor2;

        System.out.println("Suma: " + valor1 + " + " + valor2 + " = " + suma);
        System.out.println("Resta: " + valor1 + " - " + valor2 + " = " + resta);
        System.out.println("División: " + valor1 + " / " + valor2 + " = " + division);
        System.out.println("Multiplicación: " + valor1 + " * " + valor2 + " = " + multiplicacion);

        entrada.close();
    }
}