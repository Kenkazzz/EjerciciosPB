import java.util.*;
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un texto: ");
        String texto = scanner.nextLine();
        
        char primeraLetra = obtenerPrimeraLetra(texto);
        
        System.out.println("La primera letra de la cadena ingresada es: " + primeraLetra);
    }
    
    public static char obtenerPrimeraLetra(String texto) {
        return texto.charAt(0);
    }
}
