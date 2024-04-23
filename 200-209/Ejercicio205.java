import java.util.Scanner;

public class Ejercicio205 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad en bolivianos:");
        double bolivianos = entrada.nextDouble();

        System.out.println("Ingrese el tipo de cambio (1 dólar = X bolivianos):");
        double tipoDeCambio = entrada.nextDouble();

        double dolares = bolivianos / tipoDeCambio;
    
        System.out.println(bolivianos + " bolivianos son $" + dolares + " dólares.");

        entrada.close();
    }
}