import java.util.Scanner;

public class Ejercicio159 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un numero entero");
        int numero = entrada.nextInt();

        int c = 0;
        for (int i=1; i<=numero; i++) {
                if (numero % i == 0) {
                    c++;
                }
            }
            if (c <= 2) {
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }
        }
    }
