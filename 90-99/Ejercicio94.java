import java.util.Scanner;

public class Ejercicio94 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita un numero entero");
        int numero = entrada.nextInt();
        int valorAbsoluto = Math.abs(numero);
        
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
    }
}