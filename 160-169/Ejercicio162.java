import java.util.Scanner;

public class Ejercicio162 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa un número positivo menor a 10");
        int numero = entrada.nextInt();
        
        if (numero < 1 || numero > 9) {
            System.out.println("El número debe ser positivo y menor a 10");
        } else {
            System.out.println("Tabla de multiplicar del " + numero + " : ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}