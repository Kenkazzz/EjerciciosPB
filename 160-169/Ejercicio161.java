import java.util.Scanner;

public class Ejercicio161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Digite la primera variable:");
        int variable1 = sc.nextInt();
            
        System.out.println("Digite la segunda variable:");
        int variable2 = sc.nextInt();
            
        System.out.println("Valores originales");
        System.out.println("Variable 1: " + variable1);
        System.out.println("Variable 2: " + variable2);
            
        int temp = variable1;
        variable1 = variable2;
        variable2 = temp;
            
        System.out.println("Valores intercambiados:");
        System.out.println("Variable 1: " + variable1);
        System.out.println("Variable 2: " + variable2);
    }
}
