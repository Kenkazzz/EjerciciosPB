import java.util.Scanner;

public class Ejercicio206 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el salario anterior del obrero:");
        double salarioAnterior = entrada.nextDouble();

        double incremento = 0.25;
    
        double nuevoSalario = salarioAnterior + (salarioAnterior * incremento);

        System.out.println("El nuevo salario del obrero es: $" + nuevoSalario);

        entrada.close();
    }
}