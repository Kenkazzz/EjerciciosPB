import java.util.Scanner;

public class Ejercicio133 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero ");
        double num1 = entrada.nextDouble();
        
        System.out.println("Digite el segundo numero ");
        double num2 = entrada.nextDouble();

        if (num1>num2) {
            System.out.println("El numero menor es "+num2);
            System.out.println("El numero mayor es "+num1);
        }else if (num2>num1) {
            System.out.println("El numero menor es "+num1);
            System.out.println("El numero mayor es "+num2);
        }else{
            System.out.println("Son numeros iguales");
        }

    }
}