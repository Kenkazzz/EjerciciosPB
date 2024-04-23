import java.util.*;

public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero ");
        int numero = scanner.nextInt();
        
        int cifras = String.valueOf(numero).length();
        
        System.out.println("El número de cifras es " + cifras);
    }
}