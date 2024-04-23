import java.util.Scanner;

public class Ejercicio134 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número ");
        int num1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo número ");
        int num2 = entrada.nextInt();
        
        while (num2 == num1) {
            System.out.println("El segundo número no puede ser igual al primero Ingrese otro número ");
            num2 = entrada.nextInt();
        }
        
        System.out.println("Ingrese el tercer número ");
        int num3 = entrada.nextInt();
        
        while (num3 == num1 || num3 == num2) {
            System.out.println("El tercer número no puede ser igual a ninguno de los anteriores, Ingrese otro número ");
            num3 = entrada.nextInt();
        }
        
        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        
        System.out.println("El mayor número es: " + max);
        System.out.println("El menor número es: " + min);
        
    }
}
