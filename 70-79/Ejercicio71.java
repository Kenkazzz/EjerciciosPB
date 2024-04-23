import java.util.*;

public class Ejercicio71 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el número de veces que sea hacer la serie fibonacci ");
        int n = entrada.nextInt();
        
        int a = 0, b = 1, c;
        
        
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}