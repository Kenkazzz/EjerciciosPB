import java.util.Scanner;

public class Ejercicio146 {
    public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el número límite para la serie Fibonacci");
    int limite = entrada.nextInt();
    
    int n1 = 0, n2 = 1, n3;
    System.out.print("Serie Fibonacci hasta " + limite);
    System.out.println(n1);
    System.out.println(n2);
    
    for(int i = 2; i < limite; i++){
        n3 = n1 + n2;
        System.out.println(n3);
        n1 = n2;
        n2 = n3;
    }
}
}