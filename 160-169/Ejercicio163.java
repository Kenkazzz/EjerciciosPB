import java.util.Scanner;

public class Ejercicio163 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = entrada.nextInt();
        System.out.println("Ingrese el segundo número:");
        int b = entrada.nextInt();

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        
        if (b != 0) {
            double division = (double) a / b;
            int residuo = a % b;
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);
            System.out.println("Residuo: " + residuo);
        } else {
            System.out.println("No es posible realizar la división y el residuo con el segundo número siendo cero.");
        }
    }
}