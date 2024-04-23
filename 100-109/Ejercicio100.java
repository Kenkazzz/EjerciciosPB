import java.util.Scanner;

public class Ejercicio100 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el primer numero");
        double num1 = entrada.nextDouble();

        System.out.println("Digite el segundo numero");
        double num2 = entrada.nextDouble();

        double suma = num1+num2;

        if (suma%2==0) {
            System.out.println("La suma de los numeros es par");
        }else{
            System.out.println("La suma es impar");
        }
    }
}