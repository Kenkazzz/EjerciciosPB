import java.util.Scanner;

public class Ejercicio204 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese el valor en dólares:");
        double dolares = entrada.nextDouble();

        double tasaDeCambio = 8.08;

    
        double bolivianos = dolares * tasaDeCambio;

        // Mostrar el resultado
        System.out.println("$" + dolares + " dólares son " + bolivianos + " bolivianos.");

        entrada.close();
    }
}