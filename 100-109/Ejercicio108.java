import java.util.Scanner;

public class Ejercicio108 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }


    }
}