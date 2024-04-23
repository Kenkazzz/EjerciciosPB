import java.util.Scanner;

public class Ejercicio181{
    public static void main(String[] abc) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int numero = entrada.nextInt();
        entrada.close();

        if (numero <= 0) {
            System.out.println("El número debe ser un entero positivo :(");
            return;
        }
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto :)");
        } else {
            System.out.println(numero + " no es un número perfecto :(");
        }
    }

}