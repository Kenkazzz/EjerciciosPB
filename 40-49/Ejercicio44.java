import java.util.*;
public class Ejercicio44 {
            public static void main(String[] args) {
            double pi = Math.PI;
    
            for (int i = 2; i <= 10; i++) {
                double potencia = calcularPotencia(pi, i);
                double raizCuadrada = Math.sqrt(potencia);
    
                System.out.println("Potencia de PI a la " + i + ": " + potencia);
                System.out.println("Raíz cuadrada de la potencia: " + raizCuadrada);
            }
}
public static double calcularPotencia(double base, int exponente) {
    return Math.pow(base, exponente);
}
}
