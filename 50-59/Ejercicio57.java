import java.util.Scanner;
public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        
        int resultado = sumarDigitos(numero);
        
        System.out.println("La suma de los dígitos de " + numero + " es: " + resultado);
    }
    
    public static int sumarDigitos(int numero) {
        int suma = 0;
        
        while(numero != 0) {
            suma += numero % 10; // Sumar el último dígito
            numero = numero / 10; // Eliminar el último dígito
        }
        
        return suma;
    }
}
