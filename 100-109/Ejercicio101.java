import java.util.Scanner;

public class Ejercicio101 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el primer numero");
        double num1 = entrada.nextDouble();

        System.out.println("Digite el segundo numero");
        double num2 = entrada.nextDouble();

        if (num1%num2==0) {
            System.out.println("Si es Divisible");
        }else{
            System.out.println("No es Divisible");
        }
    }
}