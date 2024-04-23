import java.util.Scanner;

public class Ejercicio80 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

      
        System.out.print("Ingrese un número real: ");
        double numeroReal = scanner.nextDouble();

        
        System.out.println("Usted ingresó el número entero: " + numeroEntero);
        System.out.println("Usted ingresó el número real: " + numeroReal);
        
        
    }
}