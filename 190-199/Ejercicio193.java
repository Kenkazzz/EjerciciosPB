import java.util.Scanner;
public class Ejercicio193 {
    public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in); 
    System.out.println("Ingrese un número entre 1 y 255:"); 
    int num = entrada.nextInt();

    entrada.close();

    if (num < 1 || num > 255) {
        System.out.println("El número ingresado no está en el rango válido.");
    } else {
        String binary = Integer.toBinaryString(num);
        System.out.println("El número " + num + " en binario es: " + binary);
    }
}
}