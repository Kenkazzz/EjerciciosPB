import java.util.*;

public class Ejercicio63 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Introduce valores enteros (0 para terminar):");
        
        while (true) {
            int valor = entrada.nextInt();
            
            if (valor == 0) {
                break;
            } else if (valor > 0) {
                suma += valor;
            }
            
            if (valor > 20 && valor <= 30) {
                break;
            }
        }
        
        System.out.println("La suma de los valores mayores a 0 es: " + suma);
    }
}
