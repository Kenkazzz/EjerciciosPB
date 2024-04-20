import java.util.*;
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número ");
        double num1 = entrada.nextDouble();
        
        System.out.println("Ingrese el segundo número ");
        double num2 = entrada.nextDouble();
        
        double suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        
        double resta = num1 - num2;
        System.out.println("La resta es: " + resta);
        
        double multiplicacion = num1 * num2;
        System.out.println("La multiplicación es: " + multiplicacion);
        
        if(num2 != 0) {
            double division = num1 / num2;
            System.out.println("La división es: " + division);
            
            double resto = num1 % num2;
            System.out.println("El resto de la división es: " + resto);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
